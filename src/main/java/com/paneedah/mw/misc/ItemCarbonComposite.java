package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemCarbonComposite extends Item {

    public ItemCarbonComposite() {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "CarbonComposite"); 
        //setTextureName(ModernWarfareMod.MODID + ":" + "carboncomposite");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
