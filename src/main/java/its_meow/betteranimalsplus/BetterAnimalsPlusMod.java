package its_meow.betteranimalsplus;

import java.io.File;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import its_meow.betteranimalsplus.common.item.ItemBlockHeadType;
import its_meow.betteranimalsplus.config.BetterAnimalsPlusConfig;
import its_meow.betteranimalsplus.fixers.HeadBlockDataFixer;
import its_meow.betteranimalsplus.fixers.HeadItemDataFixer;
import its_meow.betteranimalsplus.fixers.HeadTileDataFixer;
import its_meow.betteranimalsplus.init.ModBlocks;
import its_meow.betteranimalsplus.init.ModEntities;
import its_meow.betteranimalsplus.init.ModItems;
import its_meow.betteranimalsplus.init.ModOreDictSmelting;
import its_meow.betteranimalsplus.util.EntityContainer;
import its_meow.betteranimalsplus.util.HeadTypes;
import its_meow.betteranimalsplus.world.gen.TrilliumGenerator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.FixTypes;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.ModFixs;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = Ref.MOD_ID)
@Mod(modid = Ref.MOD_ID, name = Ref.NAME, version = Ref.VERSION, acceptedMinecraftVersions = Ref.acceptedMCV, updateJSON = Ref.updateJSON)
public class BetterAnimalsPlusMod {

    public static final int FIXER_VERSION = 2;

	@Instance(Ref.MOD_ID)
    public static BetterAnimalsPlusMod mod;

    public static CreativeTabs tab = new CreativeTabs("Better Animals+") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.antler);
        }

        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> toDisplay) {
            super.displayAllRelevantItems(toDisplay);
            for(HeadTypes type : HeadTypes.values()) {
            	for(ItemBlockHeadType item : type.getItems()) {
            		toDisplay.add(new ItemStack(item));
            	}
            }
            for (EntityContainer cont : ModEntities.entityList) {
                ItemStack stack = new ItemStack(Items.SPAWN_EGG);
                ItemMonsterPlacer.applyEntityIdToItemStack(stack, new ResourceLocation(Ref.MOD_ID, cont.entityName));
                toDisplay.add(stack);
            }
        }
    };

    public static Logger logger;

    public static Configuration config;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = LogManager.getLogger("betteranimalsplus");
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "betteranimalsplus.cfg"));
        BetterAnimalsPlusConfig.readConfig(true);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        ModOreDictSmelting.register();
        if (BetterAnimalsPlusConfig.spawnTrillium) {
            GameRegistry.registerWorldGenerator(new TrilliumGenerator(ModBlocks.trillium), 1);
        }
        ModFixs fixer = FMLCommonHandler.instance().getDataFixer().init(Ref.MOD_ID, FIXER_VERSION);
        fixer.registerFix(FixTypes.CHUNK, new HeadBlockDataFixer());
        fixer.registerFix(FixTypes.BLOCK_ENTITY, new HeadTileDataFixer());
        fixer.registerFix(FixTypes.ITEM_INSTANCE, new HeadItemDataFixer());
        logger.log(Level.INFO, "Overspawning lammergeiers...");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
        logger.log(Level.INFO, "Crazy bird creation complete.");
    }
	
	@EventHandler
	public static void serverStart(FMLServerStartingEvent e) {
		BetterAnimalsPlusConfig.readConfig(false);
	}

}
