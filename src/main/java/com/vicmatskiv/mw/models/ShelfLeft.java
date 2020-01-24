// Date: 2/16/2019 2:24:47 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ShelfLeft extends ModelBase
{
  //fields
    ModelRenderer shelf1;
    ModelRenderer shelf2;
    ModelRenderer shelf3;
  
  public ShelfLeft()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      shelf1 = new ModelRenderer(this, 0, 0);
      shelf1.addBox(0F, 0F, 0F, 16, 2, 10);
      shelf1.setRotationPoint(-8F, 21F, -5F);
      shelf1.setTextureSize(128, 128);
      shelf1.mirror = true;
      setRotation(shelf1, 0F, 0F, 0F);
      shelf2 = new ModelRenderer(this, 0, 0);
      shelf2.addBox(0F, 0F, 0F, 2, 16, 2);
      shelf2.setRotationPoint(-8.1F, 8F, -5.1F);
      shelf2.setTextureSize(128, 128);
      shelf2.mirror = true;
      setRotation(shelf2, 0F, 0F, 0F);
      shelf3 = new ModelRenderer(this, 0, 0);
      shelf3.addBox(0F, 0F, 0F, 2, 16, 2);
      shelf3.setRotationPoint(-8.1F, 8F, 3.1F);
      shelf3.setTextureSize(128, 128);
      shelf3.mirror = true;
      setRotation(shelf3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    shelf1.render(f5);
    shelf2.render(f5);
    shelf3.render(f5);
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
