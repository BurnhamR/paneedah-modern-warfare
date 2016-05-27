package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AngledGrip;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemGrip extends ItemAttachment<Weapon>
{
	private static final float RECOIL_REDUCTION_FACTOR = .5f;
	
	public ItemGrip() {
		super(ModernWarfareMod.MODID, AttachmentCategory.GRIP, new AngledGrip(), "AngledGrip.png", null,
				(attachment, weapon, player) -> {
					weapon.changeRecoil(player, RECOIL_REDUCTION_FACTOR);
				},
				(attachment, weapon, player) -> {
					weapon.changeRecoil(player, 1);
				});
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AngledGrip"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "AngledGrip");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}