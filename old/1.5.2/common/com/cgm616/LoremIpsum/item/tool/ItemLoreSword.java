package com.cgm616.LoremIpsum.item.tool;

import com.cgm616.LoremIpsum.lib.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemLoreSword extends ItemSword{

	public ItemLoreSword(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setMaxStackSize(1);
	}
	
	@Override
	public void registerIcons(IconRegister register){

		this.itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}

}