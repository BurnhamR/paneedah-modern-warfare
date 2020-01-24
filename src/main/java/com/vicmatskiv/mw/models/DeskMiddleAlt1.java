// Date: 2/16/2019 7:17:00 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DeskMiddleAlt1 extends ModelBase
{
  //fields
    ModelRenderer desk1;
    ModelRenderer desk3;
    ModelRenderer desk4;
    ModelRenderer desk5;
  
  public DeskMiddleAlt1()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      desk1 = new ModelRenderer(this, 0, 0);
      desk1.addBox(0F, 0F, 0F, 16, 15, 1);
      desk1.setRotationPoint(-8F, 8F, 6.5F);
      desk1.setTextureSize(64, 32);
      desk1.mirror = true;
      setRotation(desk1, 0F, 0F, 0F);
      desk3 = new ModelRenderer(this, 0, 0);
      desk3.addBox(0F, 0F, 0F, 16, 4, 13);
      desk3.setRotationPoint(-8F, 8F, -6.5F);
      desk3.setTextureSize(64, 32);
      desk3.mirror = true;
      setRotation(desk3, 0F, 0F, 0F);
      desk4 = new ModelRenderer(this, 0, 50);
      desk4.addBox(0F, 0F, 0F, 5, 10, 12);
      desk4.setRotationPoint(-7F, 14F, -6F);
      desk4.setTextureSize(64, 32);
      desk4.mirror = true;
      setRotation(desk4, 0F, 0F, 0F);
      desk5 = new ModelRenderer(this, 0, 50);
      desk5.addBox(0F, 0F, 0F, 4, 1, 1);
      desk5.setRotationPoint(-6.5F, 16F, -6.1F);
      desk5.setTextureSize(64, 32);
      desk5.mirror = true;
      setRotation(desk5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    desk1.render(f5);
    desk3.render(f5);
    desk4.render(f5);
    desk5.render(f5);
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
