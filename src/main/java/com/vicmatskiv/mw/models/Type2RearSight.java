// Date: 3/13/2019 2:14:42 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Type2RearSight extends ModelBase
{
  //fields
    ModelRenderer sight1;
    ModelRenderer sight2;
    ModelRenderer sight3;
    ModelRenderer sight4;
    ModelRenderer sight5;
    ModelRenderer sight6;
    ModelRenderer sight7;
    ModelRenderer sight8;
    ModelRenderer sight9;
    ModelRenderer sight10;
    ModelRenderer sight11;
  
  public Type2RearSight()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      sight1 = new ModelRenderer(this, 0, 0);
      sight1.addBox(0F, 0F, 0F, 6, 4, 5);
      sight1.setRotationPoint(0F, 0F, 0F);
      sight1.setTextureSize(64, 32);
      sight1.mirror = true;
      setRotation(sight1, 0F, 0F, 0F);
      sight2 = new ModelRenderer(this, 0, 0);
      sight2.addBox(0F, 0F, 0F, 6, 3, 4);
      sight2.setRotationPoint(0F, 0F, 5F);
      sight2.setTextureSize(64, 32);
      sight2.mirror = true;
      setRotation(sight2, -1.152537F, 0F, 0F);
      sight3 = new ModelRenderer(this, 0, 0);
      sight3.addBox(0F, 0F, 0F, 5, 1, 4);
      sight3.setRotationPoint(0.5F, 0F, 5.5F);
      sight3.setTextureSize(64, 32);
      sight3.mirror = true;
      setRotation(sight3, -1.152537F, 0F, 0F);
      sight4 = new ModelRenderer(this, 0, 0);
      sight4.addBox(0F, 0F, 0F, 5, 1, 1);
      sight4.setRotationPoint(0.5F, 0F, 4.5F);
      sight4.setTextureSize(64, 32);
      sight4.mirror = true;
      setRotation(sight4, 0F, 0F, 0F);
      sight5 = new ModelRenderer(this, 0, 0);
      sight5.addBox(0F, 0F, 0F, 1, 2, 3);
      sight5.setRotationPoint(0F, -1.5F, 0F);
      sight5.setTextureSize(64, 32);
      sight5.mirror = true;
      setRotation(sight5, 0F, 0F, 0F);
      sight6 = new ModelRenderer(this, 0, 0);
      sight6.addBox(0F, 0F, 0F, 1, 2, 3);
      sight6.setRotationPoint(5F, -1.5F, 0F);
      sight6.setTextureSize(64, 32);
      sight6.mirror = true;
      setRotation(sight6, 0F, 0F, 0F);
      sight7 = new ModelRenderer(this, 0, 0);
      sight7.addBox(0F, 0F, 0F, 1, 2, 1);
      sight7.setRotationPoint(0.5F, -1.5F, 0F);
      sight7.setTextureSize(64, 32);
      sight7.mirror = true;
      setRotation(sight7, 0F, 0F, 0F);
      sight8 = new ModelRenderer(this, 0, 0);
      sight8.addBox(0F, 0F, 0F, 1, 2, 1);
      sight8.setRotationPoint(4.5F, -1.5F, 0F);
      sight8.setTextureSize(64, 32);
      sight8.mirror = true;
      setRotation(sight8, 0F, 0F, 0F);
      sight9 = new ModelRenderer(this, 0, 0);
      sight9.addBox(0F, 0F, 0F, 1, 2, 3);
      sight9.setRotationPoint(0F, -1.5F, 3F);
      sight9.setTextureSize(64, 32);
      sight9.mirror = true;
      setRotation(sight9, -0.669215F, 0F, 0F);
      sight10 = new ModelRenderer(this, 0, 0);
      sight10.addBox(0F, 0F, 0F, 1, 2, 3);
      sight10.setRotationPoint(5F, -1.5F, 3F);
      sight10.setTextureSize(64, 32);
      sight10.mirror = true;
      setRotation(sight10, -0.669215F, 0F, 0F);
      sight11 = new ModelRenderer(this, 0, 20);
      sight11.addBox(0F, 0F, 0.2F, 3, 1, 2);
      sight11.setRotationPoint(0.7F, 0F, 5.6F);
      sight11.setTextureSize(64, 32);
      sight11.mirror = true;
      setRotation(sight11, -1.152537F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    sight1.render(f5);
    sight2.render(f5);
    sight3.render(f5);
    sight4.render(f5);
    sight5.render(f5);
    sight6.render(f5);
    sight7.render(f5);
    sight8.render(f5);
    sight9.render(f5);
    sight10.render(f5);
    sight11.render(f5);
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
