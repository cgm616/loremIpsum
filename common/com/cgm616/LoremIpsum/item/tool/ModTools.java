package com.cgm616.LoremIpsum.item.tool;

import com.cgm616.LoremIpsum.LoremIpsum;
import com.cgm616.LoremIpsum.lib.ItemId;
import com.cgm616.LoremIpsum.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class ModTools {
	
	public static Item pickaxeCorundum;
    public static Item shovelCorundum;
    public static Item swordCorundum;
    public static Item axeCorundum;
    public static Item hoeCorundum;
	
	public static EnumToolMaterial CORUNDUM = EnumHelper.addToolMaterial("Corundum", 4, 2000, 10.0F, 10, 18);
	
	public static void toolInit()
	{
		pickaxeCorundum = new ItemLorePickaxe(ItemId.pickaxeCorundumId, CORUNDUM).setUnlocalizedName(Strings.pickaxeCorundumName).setCreativeTab(LoremIpsum.loremIpsumTab);
		shovelCorundum = new ItemLoreShovel(ItemId.shovelCorundumId, CORUNDUM).setUnlocalizedName(Strings.shovelCorundumName).setCreativeTab(LoremIpsum.loremIpsumTab);
		swordCorundum = new ItemLoreSword(ItemId.swordCorundumId, CORUNDUM).setUnlocalizedName(Strings.swordCorundumName).setCreativeTab(LoremIpsum.loremIpsumTab);
		axeCorundum = new ItemLoreAxe(ItemId.axeCorundumId, CORUNDUM).setUnlocalizedName(Strings.axeCorundumName).setCreativeTab(LoremIpsum.loremIpsumTab);
		hoeCorundum = new ItemLoreHoe(ItemId.hoeCorundumId, CORUNDUM).setUnlocalizedName(Strings.hoeCorundumName).setCreativeTab(LoremIpsum.loremIpsumTab);
		
		gameRegisters();
	}
		public static void gameRegisters()
		{
			GameRegistry.registerItem(pickaxeCorundum, Strings.pickaxeCorundumName);
			GameRegistry.registerItem(axeCorundum, Strings.axeCorundumName);
			GameRegistry.registerItem(swordCorundum, Strings.swordCorundumName);
			GameRegistry.registerItem(shovelCorundum, Strings.shovelCorundumName);
			GameRegistry.registerItem(hoeCorundum, Strings.hoeCorundumName);
		}


}
