package com.cgm616.LoremIpsum.craft;

import java.util.logging.Level;

import com.cgm616.LoremIpsum.block.ModBlocks;
import com.cgm616.LoremIpsum.core.helper.DictionaryHelper;
import com.cgm616.LoremIpsum.item.ModItems;
import com.cgm616.LoremIpsum.lib.Reference;

import cpw.mods.fml.common.FMLLog;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class DictionaryHandler {

	public static void addOres() {
		
		try
		{
			OreDictionary.registerOre(DictionaryHelper.getName(ModItems.ingotCorundum), new ItemStack(ModItems.ingotCorundum));
			
			OreDictionary.registerOre(DictionaryHelper.getName(ModBlocks.oreCorundum), new ItemStack(ModBlocks.oreCorundum));
			OreDictionary.registerOre(DictionaryHelper.getName(ModBlocks.blockCorundum), new ItemStack(ModBlocks.blockCorundum));
			
			FMLLog.log(Level.INFO, Reference.MOD_ID + ": " + "OreDictionary implemented successfully.");
		}
		catch(Exception e)
		{
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + ": " + "Cannot implement the OreDictionary.");
		}
	}
	
}
