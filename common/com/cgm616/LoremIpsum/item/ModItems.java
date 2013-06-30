package com.cgm616.LoremIpsum.item;

import com.cgm616.LoremIpsum.LoremIpsum;
import com.cgm616.LoremIpsum.lib.ItemId;
import com.cgm616.LoremIpsum.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;

public class ModItems {
	
	public static Item ingotCorundum;
	
	public static void itemInit()
	{
		ingotCorundum = new ItemLore(ItemId.ingotCorundumId).setCreativeTab(LoremIpsum.loremIpsumTab).setUnlocalizedName(Strings.ingotCorundumName);
	}
	public static void gameRegisters()
	{
		GameRegistry.registerItem(ingotCorundum,"CorundumIngot");
	}

}
