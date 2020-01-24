// Date: 10/19/2018 6:38:05 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.vicmatskiv.weaponlib.ModelWithAttachments;

public class Bat extends ModelWithAttachments
{
  //fields
    ModelRenderer Handle1;
    ModelRenderer Handle2;
    ModelRenderer Handle3;
    ModelRenderer Handle4;
    ModelRenderer Handle5;
    ModelRenderer Handle6;
    ModelRenderer Bat1;
    ModelRenderer Bat2;
    ModelRenderer Bat3;
    ModelRenderer Bat4;
    ModelRenderer Bat5;
    ModelRenderer Bat6;
  
  public Bat()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      Handle1 = new ModelRenderer(this, 0, 0);
      Handle1.addBox(0F, 0F, 0F, 4, 1, 4);
      Handle1.setRotationPoint(0F, 19F, 0F);
      Handle1.setTextureSize(64, 32);
      Handle1.mirror = true;
      setRotation(Handle1, 0F, 0F, 0F);
      Handle2 = new ModelRenderer(this, 0, 0);
      Handle2.addBox(0F, 0F, 0F, 3, 1, 3);
      Handle2.setRotationPoint(0.5F, 18.7F, 0.5F);
      Handle2.setTextureSize(64, 32);
      Handle2.mirror = true;
      setRotation(Handle2, 0F, 0F, 0F);
      Handle3 = new ModelRenderer(this, 0, 0);
      Handle3.addBox(0F, 0F, 0F, 1, 12, 3);
      Handle3.setRotationPoint(1.5F, 6.7F, 0.5F);
      Handle3.setTextureSize(64, 32);
      Handle3.mirror = true;
      setRotation(Handle3, 0F, 0F, 0F);
      Handle4 = new ModelRenderer(this, 0, 0);
      Handle4.addBox(0F, 0F, 0F, 3, 12, 1);
      Handle4.setRotationPoint(0.5F, 6.7F, 1.5F);
      Handle4.setTextureSize(64, 32);
      Handle4.mirror = true;
      setRotation(Handle4, 0F, 0F, 0F);
      Handle5 = new ModelRenderer(this, 0, 0);
      Handle5.addBox(-0.5F, 0F, 1.4F, 1, 12, 3);
      Handle5.setRotationPoint(0F, 6.7F, 0F);
      Handle5.setTextureSize(64, 32);
      Handle5.mirror = true;
      setRotation(Handle5, 0F, 0.7679449F, 0F);
      Handle6 = new ModelRenderer(this, 0, 0);
      Handle6.addBox(0.2F, 0F, 0.6F, 1, 12, 3);
      Handle6.setRotationPoint(3F, 6.7F, 0F);
      Handle6.setTextureSize(64, 32);
      Handle6.mirror = true;
      setRotation(Handle6, 0F, -0.7679449F, 0F);
      Bat1 = new ModelRenderer(this, 0, 0);
      Bat1.addBox(0F, 0F, 0F, 2, 33, 4);
      Bat1.setRotationPoint(1F, -26F, 0F);
      Bat1.setTextureSize(64, 32);
      Bat1.mirror = true;
      setRotation(Bat1, 0F, 0F, 0F);
      Bat2 = new ModelRenderer(this, 0, 0);
      Bat2.addBox(0F, 0F, 0F, 4, 33, 2);
      Bat2.setRotationPoint(0F, -26F, 1F);
      Bat2.setTextureSize(64, 32);
      Bat2.mirror = true;
      setRotation(Bat2, 0F, 0F, 0F);
      Bat3 = new ModelRenderer(this, 0, 0);
      Bat3.addBox(0F, 0F, 0F, 2, 1, 2);
      Bat3.setRotationPoint(1F, -26.5F, 1F);
      Bat3.setTextureSize(64, 32);
      Bat3.mirror = true;
      setRotation(Bat3, 0F, 0F, 0F);
      Bat4 = new ModelRenderer(this, 0, 0);
      Bat4.addBox(0F, 0F, 0F, 5, 24, 2);
      Bat4.setRotationPoint(-0.5F, -24F, 1F);
      Bat4.setTextureSize(64, 32);
      Bat4.mirror = true;
      setRotation(Bat4, 0F, 0F, 0F);
      Bat5 = new ModelRenderer(this, 0, 0);
      Bat5.addBox(0F, 0F, 0F, 2, 24, 5);
      Bat5.setRotationPoint(1F, -24F, -0.5F);
      Bat5.setTextureSize(64, 32);
      Bat5.mirror = true;
      setRotation(Bat5, 0F, 0F, 0F);
      Bat6 = new ModelRenderer(this, 0, 0);
      Bat6.addBox(0F, 0F, 0F, 4, 22, 4);
      Bat6.setRotationPoint(0F, -24F, 0F);
      Bat6.setTextureSize(64, 32);
      Bat6.mirror = true;
      setRotation(Bat6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Handle1.render(f5);
    Handle2.render(f5);
    Handle3.render(f5);
    Handle4.render(f5);
    Handle5.render(f5);
    Handle6.render(f5);
    Bat1.render(f5);
    Bat2.render(f5);
    Bat3.render(f5);
    Bat4.render(f5);
    Bat5.render(f5);
    Bat6.render(f5);
  }
  
}
