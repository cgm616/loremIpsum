package com.cgm616.LoremIpsum.Block;

import com.cgm616.LoremIpsum.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLore extends Block
{
	public static BlockLore(int id, Material material)
	{
		super(id, material);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconreg)
	{
		this.blockIcon = iconreg.registerIcon(Reference.MOD_ID + ":" + this.blockTexture);
	}
	
	
}
