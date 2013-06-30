package com.cgm616.LoremIpsum.creativetab;

import com.cgm616.LoremIpsum.item.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabLoremIpsum extends CreativeTabs {

	public TabLoremIpsum(int par1, String par2Str) {
		super(par1, par2Str);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack()
	{
		return new ItemStack(ModItems.ingotCorundum, 42, 0);
	}

}
