// Date: 12/16/2016 9:07:47 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Marine extends ModelBiped
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer vest1;
    ModelRenderer vest2;
    ModelRenderer vest3;
    ModelRenderer vest4;
    ModelRenderer vest5;
    ModelRenderer vest6;
    ModelRenderer vest7;
    ModelRenderer vest8;
    ModelRenderer vest9;
    ModelRenderer vest10;
    ModelRenderer vest11;
    ModelRenderer vest12;
    ModelRenderer vest14;
    ModelRenderer vest16;
    ModelRenderer vest17;
    ModelRenderer vest18;
    ModelRenderer vest19;
    ModelRenderer vest20;
    ModelRenderer leftleg1;
    ModelRenderer leftleg2;
    ModelRenderer leftleg3;
    ModelRenderer leftleg4;
    ModelRenderer head1;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer head5;
    ModelRenderer head6;
    ModelRenderer head7;
    ModelRenderer head8;
    ModelRenderer head9;
    ModelRenderer head10;
    ModelRenderer head11;
    ModelRenderer head12;
    ModelRenderer head13;
    ModelRenderer head14;
    ModelRenderer head15;
    ModelRenderer head16;
    ModelRenderer head17;
    ModelRenderer head18;
    ModelRenderer head19;
    ModelRenderer head20;
    ModelRenderer head21;
    ModelRenderer head22;
    ModelRenderer head23;
    ModelRenderer head24;
    ModelRenderer head25;
  
  public Marine()
  {
  	  super(0.01f, 0, 256, 256);
    textureWidth = 256;
    textureHeight = 256;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      vest1 = new ModelRenderer(this, 0, 50);
      vest1.addBox(-3.5F, 2.5F, -3F, 7, 9, 6);
      vest1.setRotationPoint(0F, 0F, 0F);
      vest1.setTextureSize(64, 32);
      vest1.mirror = true;
      setRotation(vest1, 0F, 0F, 0F);
      vest2 = new ModelRenderer(this, 0, 50);
      vest2.addBox(-4F, 3.5F, -2.5F, 8, 8, 5);
      vest2.setRotationPoint(0F, 0F, 0F);
      vest2.setTextureSize(64, 32);
      vest2.mirror = true;
      setRotation(vest2, 0F, 0F, 0F);
      vest3 = new ModelRenderer(this, 100, 16);
      vest3.addBox(-3.5F, -1.7F, -3.5F, 2, 1, 3);
      vest3.setRotationPoint(0F, 0F, 0F);
      vest3.setTextureSize(64, 32);
      vest3.mirror = true;
      setRotation(vest3, 1.152537F, 0F, 0F);
      vest4 = new ModelRenderer(this, 100, 16);
      vest4.addBox(1.5F, -1.7F, -3.5F, 2, 1, 3);
      vest4.setRotationPoint(0F, 0F, 0F);
      vest4.setTextureSize(64, 32);
      vest4.mirror = true;
      setRotation(vest4, 1.152537F, 0F, 0F);
      vest5 = new ModelRenderer(this, 120, 16);
      vest5.addBox(0.5F, -1.7F, -3.5F, 1, 1, 1);
      vest5.setRotationPoint(0F, 0F, 0F);
      vest5.setTextureSize(64, 32);
      vest5.mirror = true;
      setRotation(vest5, 1.152537F, 0F, 0F);
      vest6 = new ModelRenderer(this, 120, 16);
      vest6.addBox(-1.5F, -1.7F, -3.5F, 1, 1, 1);
      vest6.setRotationPoint(0F, 0F, 0F);
      vest6.setTextureSize(64, 32);
      vest6.mirror = true;
      setRotation(vest6, 1.152537F, 0F, 0F);
      vest7 = new ModelRenderer(this, 16, 100);
      vest7.addBox(-1.5F, 3.5F, -3.8F, 3, 3, 1);
      vest7.setRotationPoint(0F, 0F, 0F);
      vest7.setTextureSize(64, 32);
      vest7.mirror = true;
      setRotation(vest7, 0F, 0F, 0F);
      vest8 = new ModelRenderer(this, 16, 100);
      vest8.addBox(-5.5F, 6F, -1.5F, 2, 5, 3);
      vest8.setRotationPoint(0F, 0F, 0F);
      vest8.setTextureSize(64, 32);
      vest8.mirror = true;
      setRotation(vest8, 0F, 0F, 0F);
      vest9 = new ModelRenderer(this, 16, 100);
      vest9.addBox(-4F, 7.5F, -4F, 2, 3, 2);
      vest9.setRotationPoint(0F, 0F, 0F);
      vest9.setTextureSize(64, 32);
      vest9.mirror = true;
      setRotation(vest9, 0F, 0F, 0F);
      vest10 = new ModelRenderer(this, 16, 100);
      vest10.addBox(3.5F, 6F, -1.5F, 2, 4, 3);
      vest10.setRotationPoint(0F, 0F, 0F);
      vest10.setTextureSize(64, 32);
      vest10.mirror = true;
      setRotation(vest10, 0F, 0F, 0F);
      vest11 = new ModelRenderer(this, 16, 100);
      vest11.addBox(-3F, 3F, -3.5F, 1, 3, 1);
      vest11.setRotationPoint(0F, 0F, 0F);
      vest11.setTextureSize(64, 32);
      vest11.mirror = true;
      setRotation(vest11, 0F, 0F, 0F);
      vest12 = new ModelRenderer(this, 16, 100);
      vest12.addBox(2F, 3F, -3.5F, 1, 3, 1);
      vest12.setRotationPoint(0F, 0F, 0F);
      vest12.setTextureSize(64, 32);
      vest12.mirror = true;
      setRotation(vest12, 0F, 0F, 0F);
      vest14 = new ModelRenderer(this, 16, 100);
      vest14.addBox(-1F, 7.5F, -4F, 2, 3, 1);
      vest14.setRotationPoint(0F, 0F, 0F);
      vest14.setTextureSize(64, 32);
      vest14.mirror = true;
      setRotation(vest14, 0F, 0F, 0F);
      vest16 = new ModelRenderer(this, 16, 100);
      vest16.addBox(2F, 7.5F, -4F, 2, 3, 2);
      vest16.setRotationPoint(0F, 0F, 0F);
      vest16.setTextureSize(64, 32);
      vest16.mirror = true;
      setRotation(vest16, 0F, 0F, 0F);
      vest17 = new ModelRenderer(this, 70, 50);
      vest17.addBox(-3.5F, 0.5F, 1F, 2, 3, 1);
      vest17.setRotationPoint(0F, 0F, 0F);
      vest17.setTextureSize(64, 32);
      vest17.mirror = true;
      setRotation(vest17, 0.2974289F, 0F, 0F);
      vest18 = new ModelRenderer(this, 70, 50);
      vest18.addBox(1.5F, 0.5F, 1F, 2, 3, 1);
      vest18.setRotationPoint(0F, 0F, 0F);
      vest18.setTextureSize(64, 32);
      vest18.mirror = true;
      setRotation(vest18, 0.2974289F, 0F, 0F);
      vest19 = new ModelRenderer(this, 100, 50);
      vest19.addBox(0.5F, 2.5F, 1F, 1, 1, 1);
      vest19.setRotationPoint(0F, 0F, 0F);
      vest19.setTextureSize(64, 32);
      vest19.mirror = true;
      setRotation(vest19, 0.2974289F, 0F, 0F);
      vest20 = new ModelRenderer(this, 100, 50);
      vest20.addBox(-1.5F, 2.5F, 1F, 1, 1, 1);
      vest20.setRotationPoint(0F, 0F, 0F);
      vest20.setTextureSize(64, 32);
      vest20.mirror = true;
      setRotation(vest20, 0.2974289F, 0F, 0F);
      leftleg1 = new ModelRenderer(this, 0, 100);
      leftleg1.addBox(-1.5F, 4F, -2.5F, 3, 3, 1);
      leftleg1.setRotationPoint(0F, 0F, 0F);
      leftleg1.setTextureSize(256, 256);
      leftleg1.mirror = true;
      setRotation(leftleg1, 0F, 0F, 0F);
      leftleg2 = new ModelRenderer(this, 0, 100);
      leftleg2.addBox(-1.5F, 4F, -2.5F, 3, 3, 1);
      leftleg2.setRotationPoint(0F, 0F, 0F);
      leftleg2.setTextureSize(256, 256);
      leftleg2.mirror = true;
      setRotation(leftleg2, 0F, 0F, 0F);
      leftleg3 = new ModelRenderer(this, 0, 100);
      leftleg3.addBox(-3F, 1F, -1.5F, 1, 4, 3);
      leftleg3.setRotationPoint(0F, 0F, 0F);
      leftleg3.setTextureSize(256, 256);
      leftleg3.mirror = true;
      setRotation(leftleg3, 0F, 0F, 0F);
      leftleg4 = new ModelRenderer(this, 0, 100);
      leftleg4.addBox(2F, 1F, -1.5F, 1, 4, 3);
      leftleg4.setRotationPoint(0F, 0F, 0F);
      leftleg4.setTextureSize(256, 256);
      leftleg4.mirror = true;
      setRotation(leftleg4, 0F, 0F, 0F);
      head1 = new ModelRenderer(this, 150, 0);
      head1.addBox(-4F, -8F, -4.5F, 8, 3, 9);
      head1.setRotationPoint(0F, 0F, 0F);
      head1.setTextureSize(64, 32);
      head1.mirror = true;
      setRotation(head1, 0F, 0F, 0F);
      head2 = new ModelRenderer(this, 150, 0);
      head2.addBox(-4F, -8.5F, -4F, 8, 1, 8);
      head2.setRotationPoint(0F, 0F, 0F);
      head2.setTextureSize(64, 32);
      head2.mirror = true;
      setRotation(head2, 0F, 0F, 0F);
      head3 = new ModelRenderer(this, 150, 0);
      head3.addBox(-4.5F, -8F, -4F, 1, 3, 8);
      head3.setRotationPoint(0F, 0F, 0F);
      head3.setTextureSize(64, 32);
      head3.mirror = true;
      setRotation(head3, 0F, 0F, 0F);
      head4 = new ModelRenderer(this, 150, 0);
      head4.addBox(3.5F, -8F, -4F, 1, 3, 8);
      head4.setRotationPoint(0F, 0F, 0F);
      head4.setTextureSize(64, 32);
      head4.mirror = true;
      setRotation(head4, 0F, 0F, 0F);
      head5 = new ModelRenderer(this, 150, 0);
      head5.addBox(-4.5F, -5F, -1F, 10, 2, 5);
      head5.setRotationPoint(-0.5F, 0F, 0F);
      head5.setTextureSize(64, 32);
      head5.mirror = true;
      setRotation(head5, 0F, 0F, 0F);
      head6 = new ModelRenderer(this, 150, 0);
      head6.addBox(-4.5F, -8F, 3.5F, 9, 5, 1);
      head6.setRotationPoint(0F, 0F, 0F);
      head6.setTextureSize(64, 32);
      head6.mirror = true;
      setRotation(head6, 0F, 0F, 0F);
      head7 = new ModelRenderer(this, 150, 0);
      head7.addBox(-4.5F, -3.5F, 0.5F, 10, 1, 4);
      head7.setRotationPoint(-0.5F, 0F, 0F);
      head7.setTextureSize(64, 32);
      head7.mirror = true;
      setRotation(head7, 0F, 0F, 0F);
      head8 = new ModelRenderer(this, 150, 0);
      head8.addBox(-3.5F, -6.5F, 4F, 7, 4, 1);
      head8.setRotationPoint(0F, 0F, 0F);
      head8.setTextureSize(64, 32);
      head8.mirror = true;
      setRotation(head8, 0F, 0F, 0F);
      head9 = new ModelRenderer(this, 150, 30);
      head9.addBox(-4F, -8.1F, -5F, 3, 1, 1);
      head9.setRotationPoint(0F, 0F, 0F);
      head9.setTextureSize(64, 32);
      head9.mirror = true;
      setRotation(head9, 0F, 0F, 0F);
      head10 = new ModelRenderer(this, 150, 30);
      head10.addBox(1F, -8.1F, -5F, 3, 1, 1);
      head10.setRotationPoint(0F, 0F, 0F);
      head10.setTextureSize(64, 32);
      head10.mirror = true;
      setRotation(head10, 0F, 0F, 0F);
      head11 = new ModelRenderer(this, 150, 30);
      head11.addBox(-2F, -5.9F, -5F, 4, 1, 1);
      head11.setRotationPoint(0F, 0F, 0F);
      head11.setTextureSize(64, 32);
      head11.mirror = true;
      setRotation(head11, 0F, 0F, 0F);
      head12 = new ModelRenderer(this, 150, 30);
      head12.addBox(-4F, -5.4F, -5F, 3, 1, 1);
      head12.setRotationPoint(0F, 0F, 0F);
      head12.setTextureSize(64, 32);
      head12.mirror = true;
      setRotation(head12, 0F, 0F, 0F);
      head13 = new ModelRenderer(this, 150, 30);
      head13.addBox(1F, -5.4F, -5F, 3, 1, 1);
      head13.setRotationPoint(0F, 0F, 0F);
      head13.setTextureSize(64, 32);
      head13.mirror = true;
      setRotation(head13, 0F, 0F, 0F);
      head14 = new ModelRenderer(this, 150, 30);
      head14.addBox(-1.5F, -8F, -5F, 3, 1, 1);
      head14.setRotationPoint(0F, 0F, 0F);
      head14.setTextureSize(64, 32);
      head14.mirror = true;
      setRotation(head14, 0F, 0F, 0F);
      head15 = new ModelRenderer(this, 150, 30);
      head15.addBox(-4.6F, -7.6F, -5F, 1, 3, 1);
      head15.setRotationPoint(0F, 0F, 0F);
      head15.setTextureSize(64, 32);
      head15.mirror = true;
      setRotation(head15, 0F, 0F, 0F);
      head16 = new ModelRenderer(this, 150, 30);
      head16.addBox(3.6F, -7.6F, -5F, 1, 3, 1);
      head16.setRotationPoint(0F, 0F, 0F);
      head16.setTextureSize(64, 32);
      head16.mirror = true;
      setRotation(head16, 0F, 0F, 0F);
      head17 = new ModelRenderer(this, 150, 30);
      head17.addBox(3.6F, -6.4F, -4F, 1, 1, 9);
      head17.setRotationPoint(0F, 0F, 0F);
      head17.setTextureSize(64, 32);
      head17.mirror = true;
      setRotation(head17, 0F, 0F, 0F);
      head18 = new ModelRenderer(this, 150, 30);
      head18.addBox(-4.4F, -6.4F, 4.1F, 9, 1, 1);
      head18.setRotationPoint(0F, 0F, 0F);
      head18.setTextureSize(64, 32);
      head18.mirror = true;
      setRotation(head18, 0F, 0F, 0F);
      head19 = new ModelRenderer(this, 150, 30);
      head19.addBox(-4.6F, -6.4F, -3.9F, 1, 1, 9);
      head19.setRotationPoint(0F, 0F, 0F);
      head19.setTextureSize(64, 32);
      head19.mirror = true;
      setRotation(head19, 0F, 0F, 0F);
      head20 = new ModelRenderer(this, 150, 60);
      head20.addBox(-4F, -7.2F, -4.8F, 8, 2, 1);
      head20.setRotationPoint(0F, 0F, 0F);
      head20.setTextureSize(64, 32);
      head20.mirror = true;
      setRotation(head20, 0F, 0F, 0F);
      head21 = new ModelRenderer(this, 0, 120);
      head21.addBox(-2F, -0.8F, -4.3F, 4, 1, 1);
      head21.setRotationPoint(0F, 0F, 0F);
      head21.setTextureSize(64, 32);
      head21.mirror = true;
      setRotation(head21, 0F, 0F, 0F);
      head22 = new ModelRenderer(this, 0, 120);
      head22.addBox(-1.5F, -1.4F, -4.3F, 3, 1, 1);
      head22.setRotationPoint(0F, 0F, 0F);
      head22.setTextureSize(64, 32);
      head22.mirror = true;
      setRotation(head22, 0F, 0F, 0F);
      head23 = new ModelRenderer(this, 0, 120);
      head23.addBox(-4F, -1.1F, -4.1F, 8, 1, 1);
      head23.setRotationPoint(0F, 0F, 0F);
      head23.setTextureSize(64, 32);
      head23.mirror = true;
      setRotation(head23, 0F, 0F, 0F);
      head24 = new ModelRenderer(this, 50, 120);
      head24.addBox(-4.1F, -2F, -3F, 1, 5, 1);
      head24.setRotationPoint(0F, 0F, 0F);
      head24.setTextureSize(64, 32);
      head24.mirror = true;
      setRotation(head24, -1.003822F, 0F, 0F);
      head25 = new ModelRenderer(this, 50, 120);
      head25.addBox(3.1F, -2F, -3F, 1, 5, 1);
      head25.setRotationPoint(0F, 0F, 0F);
      head25.setTextureSize(64, 32);
      head25.mirror = true;
      setRotation(head25, -1.003822F, 0F, 0F);
      
      this.bipedHead.addChild(head1);
      this.bipedHead.addChild(head2);
      this.bipedHead.addChild(head3);
      this.bipedHead.addChild(head4);
      this.bipedHead.addChild(head5);
      this.bipedHead.addChild(head6);
      this.bipedHead.addChild(head7);
      this.bipedHead.addChild(head8);
      this.bipedHead.addChild(head9);
      this.bipedHead.addChild(head10);
      this.bipedHead.addChild(head11);
      this.bipedHead.addChild(head12);
      this.bipedHead.addChild(head13);
      this.bipedHead.addChild(head14);
      this.bipedHead.addChild(head15);
      this.bipedHead.addChild(head16);
      this.bipedHead.addChild(head17);
      this.bipedHead.addChild(head18);
      this.bipedHead.addChild(head19);
      this.bipedHead.addChild(head20);
      this.bipedHead.addChild(head21);
      this.bipedHead.addChild(head22);
      this.bipedHead.addChild(head23);
      this.bipedHead.addChild(head24);
      this.bipedHead.addChild(head25 );
      this.bipedBody.addChild(vest1);
      this.bipedBody.addChild(vest2);
      this.bipedBody.addChild(vest3);
      this.bipedBody.addChild(vest4);
      this.bipedBody.addChild(vest5);
      this.bipedBody.addChild(vest6);
      this.bipedBody.addChild(vest7);
      this.bipedBody.addChild(vest8);
      this.bipedBody.addChild(vest9);
      this.bipedBody.addChild(vest10);
      this.bipedBody.addChild(vest11);
      this.bipedBody.addChild(vest12);
      this.bipedBody.addChild(vest14);
      this.bipedBody.addChild(vest16);
      this.bipedBody.addChild(vest17);
      this.bipedBody.addChild(vest18);
      this.bipedBody.addChild(vest19);
      this.bipedBody.addChild(vest20);
      this.bipedLeftLeg.addChild(leftleg1);
      this.bipedRightLeg.addChild(leftleg2);
      this.bipedRightLeg.addChild(leftleg3);
      this.bipedLeftLeg.addChild(leftleg4);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
