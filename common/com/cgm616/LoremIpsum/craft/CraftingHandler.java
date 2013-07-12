package com.cgm616.LoremIpsum.craft;

import net.minecraftforge.oredict.ShapedOreRecipe;

import com.cgm616.LoremIpsum.block.ModBlocks;
import com.cgm616.LoremIpsum.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler {
	
	public static void craftInit()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockCorundum, true, new Object[]{
				"FFF","FFF","FFF", Character.valueOf('F'), "ingotCorundum"}));
	}

}
