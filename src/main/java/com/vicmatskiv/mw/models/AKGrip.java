// Date: 6/24/2019 1:48:22 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AKGrip extends ModelBase
{
  //fields
    ModelRenderer gun1;
    ModelRenderer gun2;
    ModelRenderer gun3;
    ModelRenderer gun4;
    ModelRenderer gun5;
    ModelRenderer gun6;
    ModelRenderer gun7;
    ModelRenderer gun8;
    ModelRenderer gun9;
    ModelRenderer gun10;
    ModelRenderer gun11;
    ModelRenderer gun31;
    ModelRenderer gun32;
    ModelRenderer gun33;
    ModelRenderer gun34;
    ModelRenderer gun35;
    ModelRenderer gun36;
    ModelRenderer gun37;
    ModelRenderer gun38;
  
  public AKGrip()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      gun1 = new ModelRenderer(this, 0, 0);
      gun1.addBox(0F, 0F, 0F, 4, 1, 9);
      gun1.setRotationPoint(-3.5F, -7F, -7F);
      gun1.setTextureSize(64, 32);
      gun1.mirror = true;
      setRotation(gun1, 0F, 0F, 0F);
      gun2 = new ModelRenderer(this, 0, 0);
      gun2.addBox(0F, 0F, 0F, 4, 12, 5);
      gun2.setRotationPoint(-3.5F, -2.5F, -6F);
      gun2.setTextureSize(64, 32);
      gun2.mirror = true;
      setRotation(gun2, 0.4810499F, 0F, 0F);
      gun3 = new ModelRenderer(this, 0, 0);
      gun3.addBox(0F, 0F, 0F, 4, 1, 3);
      gun3.setRotationPoint(-3.5F, -6F, 2F);
      gun3.setTextureSize(64, 32);
      gun3.mirror = true;
      setRotation(gun3, -2.528146F, 0F, 0F);
      gun4 = new ModelRenderer(this, 0, 0);
      gun4.addBox(0F, 0F, 0F, 4, 2, 4);
      gun4.setRotationPoint(-3.5F, 6.5F, -1F);
      gun4.setTextureSize(64, 32);
      gun4.mirror = true;
      setRotation(gun4, 0F, 0F, 0F);
      gun5 = new ModelRenderer(this, 0, 0);
      gun5.addBox(0F, 0F, 0F, 4, 12, 1);
      gun5.setRotationPoint(-3.5F, -4.5F, -1.5F);
      gun5.setTextureSize(64, 32);
      gun5.mirror = true;
      setRotation(gun5, 0.4810499F, 0F, 0F);
      gun6 = new ModelRenderer(this, 0, 0);
      gun6.addBox(0F, 0F, 0F, 4, 3, 2);
      gun6.setRotationPoint(-3.5F, 8.5F, 3F);
      gun6.setTextureSize(64, 32);
      gun6.mirror = true;
      setRotation(gun6, 2.490967F, 0F, 0F);
      gun7 = new ModelRenderer(this, 0, 0);
      gun7.addBox(0F, 0F, 0F, 4, 1, 1);
      gun7.setRotationPoint(-3.5F, 5.2F, 4.2F);
      gun7.setTextureSize(64, 32);
      gun7.mirror = true;
      setRotation(gun7, -0.669215F, 0F, 0F);
      gun8 = new ModelRenderer(this, 0, 0);
      gun8.addBox(0F, 0F, 0F, 4, 4, 7);
      gun8.setRotationPoint(-3.5F, -6.5F, -7F);
      gun8.setTextureSize(64, 32);
      gun8.mirror = true;
      setRotation(gun8, 0F, 0F, 0F);
      gun9 = new ModelRenderer(this, 0, 0);
      gun9.addBox(0F, 0F, 0F, 4, 2, 1);
      gun9.setRotationPoint(-3.5F, -2.5F, -7F);
      gun9.setTextureSize(64, 32);
      gun9.mirror = true;
      setRotation(gun9, 1.226894F, 0F, 0F);
      gun10 = new ModelRenderer(this, 0, 0);
      gun10.addBox(0F, 0F, 0F, 4, 1, 1);
      gun10.setRotationPoint(-3.5F, -6F, -0.4F);
      gun10.setTextureSize(64, 32);
      gun10.mirror = true;
      setRotation(gun10, 0F, 0F, 0F);
      gun11 = new ModelRenderer(this, 0, 0);
      gun11.addBox(0F, 0F, 0F, 4, 1, 2);
      gun11.setRotationPoint(-3.5F, -5.2F, 0.67F);
      gun11.setTextureSize(64, 32);
      gun11.mirror = true;
      setRotation(gun11, -2.156359F, 0F, 0F);
      gun31 = new ModelRenderer(this, 0, 0);
      gun31.addBox(0F, 0F, 0F, 1, 13, 5);
      gun31.setRotationPoint(-3.6F, -3.5F, -5.9F);
      gun31.setTextureSize(64, 32);
      gun31.mirror = true;
      setRotation(gun31, 0.4810499F, 0F, 0F);
      gun32 = new ModelRenderer(this, 0, 0);
      gun32.addBox(0F, 0F, 0F, 1, 13, 5);
      gun32.setRotationPoint(-0.4F, -3.5F, -5.9F);
      gun32.setTextureSize(64, 32);
      gun32.mirror = true;
      setRotation(gun32, 0.4810499F, 0F, 0F);
      gun33 = new ModelRenderer(this, 0, 0);
      gun33.addBox(0F, 0F, 0F, 1, 1, 5);
      gun33.setRotationPoint(-0.4F, -5.8F, -6.5F);
      gun33.setTextureSize(64, 32);
      gun33.mirror = true;
      setRotation(gun33, 0F, 0F, 0F);
      gun34 = new ModelRenderer(this, 0, 0);
      gun34.addBox(0F, 0F, 0F, 1, 1, 5);
      gun34.setRotationPoint(-3.6F, -5.8F, -6.5F);
      gun34.setTextureSize(64, 32);
      gun34.mirror = true;
      setRotation(gun34, 0F, 0F, 0F);
      gun35 = new ModelRenderer(this, 0, 0);
      gun35.addBox(0F, 0F, 0F, 1, 3, 2);
      gun35.setRotationPoint(-3.6F, -4.8F, -6.5F);
      gun35.setTextureSize(64, 32);
      gun35.mirror = true;
      setRotation(gun35, 0.4461433F, 0F, 0F);
      gun36 = new ModelRenderer(this, 0, 0);
      gun36.addBox(0F, 0F, 0F, 1, 3, 2);
      gun36.setRotationPoint(-0.4F, -4.8F, -6.5F);
      gun36.setTextureSize(64, 32);
      gun36.mirror = true;
      setRotation(gun36, 0.4461433F, 0F, 0F);
      gun37 = new ModelRenderer(this, 0, 0);
      gun37.addBox(0F, 0F, 0F, 1, 1, 2);
      gun37.setRotationPoint(-0.4F, -4.8F, -5F);
      gun37.setTextureSize(64, 32);
      gun37.mirror = true;
      setRotation(gun37, 0F, 0F, 0F);
      gun38 = new ModelRenderer(this, 0, 0);
      gun38.addBox(0F, 0F, 0F, 1, 1, 2);
      gun38.setRotationPoint(-3.6F, -4.8F, -5F);
      gun38.setTextureSize(64, 32);
      gun38.mirror = true;
      setRotation(gun38, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    gun1.render(f5);
    gun2.render(f5);
    gun3.render(f5);
    gun4.render(f5);
    gun5.render(f5);
    gun6.render(f5);
    gun7.render(f5);
    gun8.render(f5);
    gun9.render(f5);
    gun10.render(f5);
    gun11.render(f5);
    gun31.render(f5);
    gun32.render(f5);
    gun33.render(f5);
    gun34.render(f5);
    gun35.render(f5);
    gun36.render(f5);
    gun37.render(f5);
    gun38.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
