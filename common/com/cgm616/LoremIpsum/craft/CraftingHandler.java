package com.cgm616.LoremIpsum.craft;

import java.util.logging.Level;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.cgm616.LoremIpsum.block.ModBlocks;
import com.cgm616.LoremIpsum.core.helper.DictionaryHelper;
import com.cgm616.LoremIpsum.item.ModItems;
import com.cgm616.LoremIpsum.lib.Reference;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler {
	
	public static void craftInit()
	{
		try
		{
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockCorundum, true, new Object[]{
				"FFF","FFF","FFF", Character.valueOf('F'), DictionaryHelper.getName(ModItems.ingotCorundum)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingotCorundum, 9), true, new Object[]{
				"F  ","   ","   ", Character.valueOf('F'), DictionaryHelper.getName(ModBlocks.blockCorundum)}));
		
		FMLLog.log(Level.INFO, Reference.MOD_ID + ": " + "Crafting recipes added successfully.");
		}
		catch(Exception e)
		{
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + ": " + "Cannot add crafting recipes.");
		}
	}

}
