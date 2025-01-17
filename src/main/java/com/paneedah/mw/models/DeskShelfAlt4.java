// Date: 2/16/2019 8:21:03 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DeskShelfAlt4 extends ModelBase
{
  //fields
    ModelRenderer shelf1;
    ModelRenderer shelf2;
    ModelRenderer shelf3;
    ModelRenderer shelf4;
    ModelRenderer shelf6;
    ModelRenderer shelf7;
    ModelRenderer shelf11;
    ModelRenderer shelf12;
    ModelRenderer shelf13;
    ModelRenderer shelf14;
  
  public DeskShelfAlt4()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      shelf1 = new ModelRenderer(this, 0, 0);
      shelf1.addBox(0F, 0F, 0F, 15, 2, 8);
      shelf1.setRotationPoint(-7F, 15F, 0F);
      shelf1.setTextureSize(64, 32);
      shelf1.mirror = true;
      setRotation(shelf1, 0F, 0F, 0F);
      shelf2 = new ModelRenderer(this, 0, 50);
      shelf2.addBox(0F, 0F, 0F, 2, 5, 5);
      shelf2.setRotationPoint(-6.5F, 10F, 2.5F);
      shelf2.setTextureSize(64, 32);
      shelf2.mirror = true;
      setRotation(shelf2, 0F, 0F, 0F);
      shelf3 = new ModelRenderer(this, 0, 90);
      shelf3.addBox(0F, 0F, 0F, 2, 6, 4);
      shelf3.setRotationPoint(-2.5F, 9.5F, 3F);
      shelf3.setTextureSize(64, 32);
      shelf3.mirror = true;
      setRotation(shelf3, 0F, 0F, 0F);
      shelf4 = new ModelRenderer(this, 0, 70);
      shelf4.addBox(0F, 0F, 0F, 1, 4, 4);
      shelf4.setRotationPoint(-3.4F, 11F, 3.5F);
      shelf4.setTextureSize(64, 32);
      shelf4.mirror = true;
      setRotation(shelf4, 0F, 0F, 0.2974289F);
      shelf6 = new ModelRenderer(this, 0, 30);
      shelf6.addBox(0F, 0F, 0F, 8, 4, 4);
      shelf6.setRotationPoint(-2F, 20F, 4F);
      shelf6.setTextureSize(64, 32);
      shelf6.mirror = true;
      setRotation(shelf6, 0F, 0.5205006F, 0F);
      shelf7 = new ModelRenderer(this, 40, 30);
      shelf7.addBox(0F, 0F, 0F, 4, 2, 1);
      shelf7.setRotationPoint(0.5F, 19F, 3.5F);
      shelf7.setTextureSize(64, 32);
      shelf7.mirror = true;
      setRotation(shelf7, -0.3717861F, 0F, 0F);
      shelf11 = new ModelRenderer(this, 0, 110);
      shelf11.addBox(0F, 0F, 0F, 1, 15, 14);
      shelf11.setRotationPoint(-8F, 9F, -6F);
      shelf11.setTextureSize(64, 32);
      shelf11.mirror = true;
      setRotation(shelf11, 0F, 0F, 0F);
      shelf12 = new ModelRenderer(this, 0, 0);
      shelf12.addBox(0F, 0F, 0F, 4, 5, 1);
      shelf12.setRotationPoint(-4F, 19F, -4F);
      shelf12.setTextureSize(64, 32);
      shelf12.mirror = true;
      setRotation(shelf12, -0.2974289F, 0F, 0F);
      shelf13 = new ModelRenderer(this, 0, 0);
      shelf13.addBox(0F, 0F, 0F, 2, 3, 1);
      shelf13.setRotationPoint(-3F, 21F, -4.5F);
      shelf13.setTextureSize(64, 32);
      shelf13.mirror = true;
      setRotation(shelf13, 0.1858931F, 0F, 0F);
      shelf14 = new ModelRenderer(this, 50, 0);
      shelf14.addBox(0F, 0.5F, -0.1F, 2, 4, 1);
      shelf14.setRotationPoint(-3F, 19F, -4F);
      shelf14.setTextureSize(64, 32);
      shelf14.mirror = true;
      setRotation(shelf14, -0.2974289F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    shelf1.render(f5);
    shelf2.render(f5);
    shelf3.render(f5);
    shelf4.render(f5);
    shelf6.render(f5);
    shelf7.render(f5);
    shelf11.render(f5);
    shelf12.render(f5);
    shelf13.render(f5);
    shelf14.render(f5);
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
