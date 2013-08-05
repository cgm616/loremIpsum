package com.cgm616.LoremIpsum.item;

import com.cgm616.LoremIpsum.LoremIpsum;
import com.cgm616.LoremIpsum.lib.ItemId;
import com.cgm616.LoremIpsum.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;

public class ModItems {
	
	public static Item ingotCorundum;
	public static Item ingotSilver;
	public static Item pureRod;
	
	public static void itemInit()
	{
		ingotCorundum = new ItemLore(ItemId.ingotCorundumId).setCreativeTab(LoremIpsum.loremIpsumTab).setUnlocalizedName(Strings.ingotCorundumName);
		ingotSilver = new ItemLore(ItemId.ingotSilverId).setCreativeTab(LoremIpsum.loremIpsumTab).setUnlocalizedName(Strings.ingotSilverName);
		pureRod = new ItemLorePureRod(ItemId.pureRodId).setCreativeTab(LoremIpsum.loremIpsumTab).setUnlocalizedName(Strings.pureRodName);
	}
	public static void gameRegisters()
	{
		GameRegistry.registerItem(ingotCorundum, Strings.ingotCorundumName);
		GameRegistry.registerItem(ingotSilver, Strings.ingotSilverName);
		GameRegistry.registerItem(pureRod, Strings.pureRodName);
	}

}
