package its_meow.betteranimalsplus.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelHirschgeistSkullArmorPiece extends ModelBiped {

	private ModelRenderer head01;
	private ModelRenderer muzzle;
	private ModelRenderer lowerJaw01;
	private ModelRenderer lAnter01;
	private ModelRenderer rAnter01;
	private ModelRenderer lowerJaw02;
	private ModelRenderer lAnter02a;
	private ModelRenderer lAnter02b;
	private ModelRenderer lAnter02c;
	private ModelRenderer lAnter02d;
	private ModelRenderer lAnter03;
	private ModelRenderer lAnter04;
	private ModelRenderer lAnter05a;
	private ModelRenderer lAnter06a;
	private ModelRenderer lAnter07a;
	private ModelRenderer lAnter05b;
	private ModelRenderer lAnter06b;
	private ModelRenderer lAnter06c;
	private ModelRenderer lAnter07b;
	private ModelRenderer rAnter02a;
	private ModelRenderer rAnter02b;
	private ModelRenderer rAnter02c;
	private ModelRenderer rAnter02d;
	private ModelRenderer rAnter03;
	private ModelRenderer rAnter04;
	private ModelRenderer rAnter05a;
	private ModelRenderer rAnter06a;
	private ModelRenderer rAnter07a;
	private ModelRenderer rAnter05b;
	private ModelRenderer rAnter06b;
	private ModelRenderer rAnter06c;
	private ModelRenderer rAnter07b;

	public ModelHirschgeistSkullArmorPiece(float scale) {
		super(scale, 0, 128, 128);
		
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.lAnter07b = new ModelRenderer(this, 2, 34);
		this.lAnter07b.setRotationPoint(0.0F, 2.8F, 0.0F);
		this.lAnter07b.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lAnter07b, -0.40980330836826856F, 0.0F, 0.0F);
		this.lowerJaw02 = new ModelRenderer(this, 51, 19);
		this.lowerJaw02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lowerJaw02.addBox(-1.9F, 0.2F, -0.8F, 1, 4, 2, 0.0F);
		this.lAnter05a = new ModelRenderer(this, 0, 33);
		this.lAnter05a.setRotationPoint(0.5F, 0.0F, 0.4F);
		this.lAnter05a.addBox(-0.5F, -0.5F, -3.7F, 1, 1, 4, 0.0F);
		this.setRotateAngle(lAnter05a, -0.27314402793711257F, -0.40980330836826856F, 0.0F);
		this.lAnter06b = new ModelRenderer(this, 2, 34);
		this.lAnter06b.setRotationPoint(0.0F, 2.8F, 0.0F);
		this.lAnter06b.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lAnter06b, 0.22759093446006054F, 0.0F, 0.0F);
		this.lAnter02d = new ModelRenderer(this, 12, 33);
		this.lAnter02d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lAnter02d.addBox(-0.2F, -0.8F, -2.8F, 1, 1, 3, 0.0F);
		this.muzzle = new ModelRenderer(this, 27, 19);
		this.muzzle.setRotationPoint(0.0F, 3.2F, -2.2F);
		this.muzzle.addBox(-2.0F, 0.2F, -1.0F, 4, 4, 2, 0.0F);
		this.setRotateAngle(muzzle, 0.136659280431156F, 0.0F, 0.0F);
		this.lAnter06a = new ModelRenderer(this, 2, 34);
		this.lAnter06a.setRotationPoint(-0.3F, 0.3F, 3.2F);
		this.lAnter06a.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lAnter06a, -0.7740535232594852F, 0.0F, -1.1838568316277536F);
		this.rAnter04 = new ModelRenderer(this, 0, 33);
		this.rAnter04.mirror = true;
		this.rAnter04.setRotationPoint(0.0F, 0.0F, -2.7F);
		this.rAnter04.addBox(-0.5F, -0.5F, -2.8F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rAnter04, 0.22759093446006054F, -0.18203784098300857F, 0.0F);
		this.lAnter02a = new ModelRenderer(this, 12, 33);
		this.lAnter02a.setRotationPoint(0.0F, 0.0F, -2.1F);
		this.lAnter02a.addBox(-0.8F, -0.2F, -2.8F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lAnter02a, 0.0F, 0.091106186954104F, 0.0F);
		this.lAnter06c = new ModelRenderer(this, 2, 34);
		this.lAnter06c.setRotationPoint(0.0F, 1.6F, 0.1F);
		this.lAnter06c.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lAnter06c, -0.4553564018453205F, 0.0F, 0.0F);
		this.rAnter02c = new ModelRenderer(this, 12, 33);
		this.rAnter02c.mirror = true;
		this.rAnter02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rAnter02c.addBox(-0.8F, -0.8F, -2.8F, 1, 1, 3, 0.0F);
		this.lowerJaw01 = new ModelRenderer(this, 40, 19);
		this.lowerJaw01.setRotationPoint(0.0F, 3.0F, -1.3F);
		this.lowerJaw01.addBox(-1.1F, 0.2F, -0.8F, 3, 4, 2, 0.0F);
		this.setRotateAngle(lowerJaw01, -0.045553093477052F, 0.0F, 0.0F);
		this.rAnter06c = new ModelRenderer(this, 2, 34);
		this.rAnter06c.mirror = true;
		this.rAnter06c.setRotationPoint(0.0F, 1.6F, 0.1F);
		this.rAnter06c.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rAnter06c, -0.4553564018453205F, 0.0F, 0.0F);
		this.lAnter07a = new ModelRenderer(this, 2, 34);
		this.lAnter07a.setRotationPoint(-0.3F, 0.4F, 4.2F);
		this.lAnter07a.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.rAnter02d = new ModelRenderer(this, 12, 33);
		this.rAnter02d.mirror = true;
		this.rAnter02d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rAnter02d.addBox(-0.2F, -0.8F, -2.8F, 1, 1, 3, 0.0F);
		this.lAnter05b = new ModelRenderer(this, 0, 33);
		this.lAnter05b.setRotationPoint(0.0F, 0.0F, -3.6F);
		this.lAnter05b.addBox(-0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F);
		this.setRotateAngle(lAnter05b, 0.18203784098300857F, 0.18203784098300857F, 0.0F);
		this.rAnter02a = new ModelRenderer(this, 12, 33);
		this.rAnter02a.mirror = true;
		this.rAnter02a.setRotationPoint(0.0F, 0.0F, -2.1F);
		this.rAnter02a.addBox(-0.8F, -0.2F, -2.8F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rAnter02a, 0.0F, -0.091106186954104F, 0.0F);
		this.rAnter05b = new ModelRenderer(this, 0, 33);
		this.rAnter05b.mirror = true;
		this.rAnter05b.setRotationPoint(0.0F, 0.0F, -3.6F);
		this.rAnter05b.addBox(-0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F);
		this.setRotateAngle(rAnter05b, 0.18203784098300857F, -0.18203784098300857F, 0.0F);
		this.rAnter07b = new ModelRenderer(this, 2, 34);
		this.rAnter07b.mirror = true;
		this.rAnter07b.setRotationPoint(0.0F, 2.8F, 0.0F);
		this.rAnter07b.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rAnter07b, -0.40980330836826856F, 0.0F, 0.0F);
		this.rAnter03 = new ModelRenderer(this, 0, 33);
		this.rAnter03.mirror = true;
		this.rAnter03.setRotationPoint(0.0F, 0.0F, -2.7F);
		this.rAnter03.addBox(-0.5F, -0.5F, -2.8F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rAnter03, 0.0F, -0.091106186954104F, 0.0F);
		this.lAnter02b = new ModelRenderer(this, 12, 33);
		this.lAnter02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lAnter02b.addBox(-0.2F, -0.2F, -2.8F, 1, 1, 3, 0.0F);
		this.rAnter05a = new ModelRenderer(this, 0, 33);
		this.rAnter05a.mirror = true;
		this.rAnter05a.setRotationPoint(-0.5F, 0.0F, 0.4F);
		this.rAnter05a.addBox(-0.5F, -0.5F, -3.7F, 1, 1, 4, 0.0F);
		this.setRotateAngle(rAnter05a, -0.27314402793711257F, 0.40980330836826856F, 0.0F);
		this.rAnter02b = new ModelRenderer(this, 12, 33);
		this.rAnter02b.mirror = true;
		this.rAnter02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rAnter02b.addBox(-0.2F, -0.2F, -2.8F, 1, 1, 3, 0.0F);
		this.lAnter03 = new ModelRenderer(this, 0, 33);
		this.lAnter03.setRotationPoint(0.0F, 0.0F, -2.7F);
		this.lAnter03.addBox(-0.5F, -0.5F, -2.8F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lAnter03, 0.0F, 0.091106186954104F, 0.0F);
		this.rAnter06a = new ModelRenderer(this, 2, 34);
		this.rAnter06a.mirror = true;
		this.rAnter06a.setRotationPoint(0.3F, 0.3F, 3.2F);
		this.rAnter06a.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rAnter06a, -0.7740535232594852F, 0.0F, 1.1838568316277536F);
		this.lAnter04 = new ModelRenderer(this, 0, 33);
		this.lAnter04.setRotationPoint(0.0F, 0.0F, -2.7F);
		this.lAnter04.addBox(-0.5F, -0.5F, -2.8F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lAnter04, 0.22759093446006054F, 0.18203784098300857F, 0.0F);
		this.rAnter01 = new ModelRenderer(this, 0, 33);
		this.rAnter01.mirror = true;
		this.rAnter01.setRotationPoint(-1.5F, -1.0F, -3.5F);
		this.rAnter01.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rAnter01, -0.5918411493512771F, 0.5462880558742251F, 0.0F);
		this.head01 = new ModelRenderer(this, 25, 8);
		//this.head01.setRotationPoint(0.0F, 23.9F, 1.0F);
		this.head01.setRotationPoint(0F, 0F, 2.0F);
		this.head01.addBox(-2.5F, -1.8F, -4.0F, 5, 6, 4, 0.0F);
		this.setRotateAngle(head01, -1.5707963267948966F, 0.0F, 0.0F);
		this.rAnter07a = new ModelRenderer(this, 2, 34);
		this.rAnter07a.mirror = true;
		this.rAnter07a.setRotationPoint(0.3F, 0.4F, 4.2F);
		this.rAnter07a.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.rAnter06b = new ModelRenderer(this, 2, 34);
		this.rAnter06b.mirror = true;
		this.rAnter06b.setRotationPoint(0.0F, 2.8F, 0.0F);
		this.rAnter06b.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rAnter06b, 0.22759093446006054F, 0.0F, 0.0F);
		this.lAnter02c = new ModelRenderer(this, 12, 33);
		this.lAnter02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lAnter02c.addBox(-0.8F, -0.8F, -2.8F, 1, 1, 3, 0.0F);
		this.lAnter01 = new ModelRenderer(this, 0, 33);
		this.lAnter01.setRotationPoint(1.5F, -1.0F, -3.5F);
		this.lAnter01.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lAnter01, -0.5918411493512771F, -0.5462880558742251F, 0.0F);
		this.lAnter07a.addChild(this.lAnter07b);
		this.lowerJaw01.addChild(this.lowerJaw02);
		this.lAnter03.addChild(this.lAnter05a);
		this.lAnter06a.addChild(this.lAnter06b);
		this.lAnter02a.addChild(this.lAnter02d);
		this.head01.addChild(this.muzzle);
		this.lAnter03.addChild(this.lAnter06a);
		this.rAnter03.addChild(this.rAnter04);
		this.lAnter01.addChild(this.lAnter02a);
		this.lAnter06b.addChild(this.lAnter06c);
		this.rAnter02a.addChild(this.rAnter02c);
		this.head01.addChild(this.lowerJaw01);
		this.rAnter06b.addChild(this.rAnter06c);
		this.lAnter03.addChild(this.lAnter07a);
		this.rAnter02a.addChild(this.rAnter02d);
		this.lAnter05a.addChild(this.lAnter05b);
		this.rAnter01.addChild(this.rAnter02a);
		this.rAnter05a.addChild(this.rAnter05b);
		this.rAnter07a.addChild(this.rAnter07b);
		this.rAnter02a.addChild(this.rAnter03);
		this.lAnter02a.addChild(this.lAnter02b);
		this.rAnter03.addChild(this.rAnter05a);
		this.rAnter02a.addChild(this.rAnter02b);
		this.lAnter02a.addChild(this.lAnter03);
		this.rAnter03.addChild(this.rAnter06a);
		this.lAnter03.addChild(this.lAnter04);
		this.head01.addChild(this.rAnter01);
		this.rAnter03.addChild(this.rAnter07a);
		this.rAnter06a.addChild(this.rAnter06b);
		this.lAnter02a.addChild(this.lAnter02c);
		this.head01.addChild(this.lAnter01);
		
		
		
		//this.bipedHead.addChild(this.head01);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bipedHead.showModel = false;
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
		this.head01.rotationPointX = this.bipedHead.rotationPointX;
		this.head01.rotationPointY = this.bipedHead.rotationPointY;
		this.head01.rotationPointZ = this.bipedHead.rotationPointZ + 1F; // Back 1
		this.head01.rotateAngleX = (this.bipedHead.rotateAngleX / 2) - 1.5707963267948966F;
		this.head01.rotateAngleY = this.bipedHead.rotateAngleY / 2;
		this.head01.rotateAngleZ = this.bipedHead.rotateAngleZ;
		this.head01.render(0.125F);
		
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	 public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}
