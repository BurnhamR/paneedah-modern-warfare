// Date: 2/18/2019 6:57:19 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CeilingLampAlt extends ModelBase
{
  //fields
    ModelRenderer light1;
    ModelRenderer light2;
    ModelRenderer light3;
    ModelRenderer light4;
    ModelRenderer light5;
    ModelRenderer light6;
    ModelRenderer light7;
  
  public CeilingLampAlt()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      light1 = new ModelRenderer(this, 0, 0);
      light1.addBox(0F, 0F, 0F, 32, 2, 7);
      light1.setRotationPoint(-16F, 14F, -3.5F);
      light1.setTextureSize(128, 128);
      light1.mirror = true;
      setRotation(light1, 0F, 0F, 0F);
      light2 = new ModelRenderer(this, 0, 20);
      light2.addBox(0F, 0F, 0F, 30, 2, 2);
      light2.setRotationPoint(-15F, 16.5F, -2.5F);
      light2.setTextureSize(128, 128);
      light2.mirror = true;
      setRotation(light2, 0.7853982F, 0F, 0F);
      light3 = new ModelRenderer(this, 0, 20);
      light3.addBox(0F, 0F, 0F, 30, 2, 2);
      light3.setRotationPoint(-15F, 16.5F, -0.5F);
      light3.setTextureSize(128, 128);
      light3.mirror = true;
      setRotation(light3, 0.7853982F, 0F, 0F);
      light4 = new ModelRenderer(this, 0, 40);
      light4.addBox(0F, 0F, 0F, 1, 4, 1);
      light4.setRotationPoint(-15F, 10F, -2F);
      light4.setTextureSize(128, 128);
      light4.mirror = true;
      setRotation(light4, 0F, 0.7853982F, 0F);
      light5 = new ModelRenderer(this, 0, 40);
      light5.addBox(0F, 0F, 0F, 1, 4, 1);
      light5.setRotationPoint(-15F, 10F, 2F);
      light5.setTextureSize(128, 128);
      light5.mirror = true;
      setRotation(light5, 0F, 0.7853982F, 0F);
      light6 = new ModelRenderer(this, 0, 40);
      light6.addBox(0F, 0F, 0F, 1, 4, 1);
      light6.setRotationPoint(15F, 10F, 2F);
      light6.setTextureSize(128, 128);
      light6.mirror = true;
      setRotation(light6, 0F, -2.356194F, 0F);
      light7 = new ModelRenderer(this, 0, 40);
      light7.addBox(0F, 0F, 0F, 1, 4, 1);
      light7.setRotationPoint(15F, 10F, -2F);
      light7.setTextureSize(128, 128);
      light7.mirror = true;
      setRotation(light7, 0F, -2.356194F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    light1.render(f5);
    light2.render(f5);
    light3.render(f5);
    light4.render(f5);
    light5.render(f5);
    light6.render(f5);
    light7.render(f5);
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
