// Date: 1/2/2017 4:44:29 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AK12Mag extends ModelBase
{
  //fields
    ModelRenderer Mag1;
    ModelRenderer Mag2;
    ModelRenderer Mag3;
    ModelRenderer Mag4;
    ModelRenderer Mag5;
    ModelRenderer Mag6;
  
  public AK12Mag()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      Mag1 = new ModelRenderer(this, 0, 0);
      Mag1.addBox(0F, 0F, 0F, 2, 2, 7);
      Mag1.setRotationPoint(1.5F, 0.1F, -4.2F);
      Mag1.setTextureSize(64, 32);
      Mag1.mirror = true;
      setRotation(Mag1, -1.970466F, 0F, 0F);
      Mag2 = new ModelRenderer(this, 0, 0);
      Mag2.addBox(0F, 0F, 0F, 2, 7, 2);
      Mag2.setRotationPoint(1.5F, -12.7F, -3.3F);
      Mag2.setTextureSize(64, 32);
      Mag2.mirror = true;
      setRotation(Mag2, -0.1858931F, 0F, 0F);
      Mag3 = new ModelRenderer(this, 0, 0);
      Mag3.addBox(0F, 0F, 0F, 3, 5, 7);
      Mag3.setRotationPoint(1F, -5F, 1.4F);
      Mag3.setTextureSize(64, 32);
      Mag3.mirror = true;
      setRotation(Mag3, -1.858931F, 0F, 0F);
      Mag4 = new ModelRenderer(this, 0, 0);
      Mag4.addBox(0F, 0F, 0F, 2, 2, 7);
      Mag4.setRotationPoint(1.5F, -6F, -2.5F);
      Mag4.setTextureSize(64, 32);
      Mag4.mirror = true;
      setRotation(Mag4, -1.858931F, 0F, 0F);
      Mag5 = new ModelRenderer(this, 0, 0);
      Mag5.addBox(0F, 0F, 0F, 3, 7, 5);
      Mag5.setRotationPoint(1F, -12.7F, -2.2F);
      Mag5.setTextureSize(64, 32);
      Mag5.mirror = true;
      setRotation(Mag5, -0.1858931F, 0F, 0F);
      Mag6 = new ModelRenderer(this, 0, 0);
      Mag6.addBox(0F, 0F, 0F, 3, 5, 7);
      Mag6.setRotationPoint(1F, 1.6F, -0.5F);
      Mag6.setTextureSize(64, 32);
      Mag6.mirror = true;
      setRotation(Mag6, -1.970466F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Mag1.render(f5);
    Mag2.render(f5);
    Mag3.render(f5);
    Mag4.render(f5);
    Mag5.render(f5);
    Mag6.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
