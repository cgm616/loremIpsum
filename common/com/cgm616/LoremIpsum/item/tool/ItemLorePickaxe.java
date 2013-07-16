package com.cgm616.LoremIpsum.item.tool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

import com.cgm616.LoremIpsum.lib.Reference;

public class ItemLorePickaxe extends ItemPickaxe{

	public ItemLorePickaxe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setMaxStackSize(1);
	}
	
	@Override
	public void registerIcons(IconRegister register){

		this.itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}

}