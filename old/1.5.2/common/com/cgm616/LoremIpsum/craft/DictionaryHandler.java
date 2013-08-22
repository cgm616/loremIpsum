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
			OreDictionary.registerOre(DictionaryHelper.getName(ModItems.ingotSilver), new ItemStack(ModItems.ingotSilver));
			
			OreDictionary.registerOre(DictionaryHelper.getName(ModBlocks.oreCorundum), new ItemStack(ModBlocks.oreCorundum));
			OreDictionary.registerOre(DictionaryHelper.getName(ModBlocks.blockCorundum), new ItemStack(ModBlocks.blockCorundum));
			OreDictionary.registerOre(DictionaryHelper.getName(ModBlocks.oreSilver), new ItemStack(ModBlocks.oreSilver));
			OreDictionary.registerOre(DictionaryHelper.getName(ModBlocks.blockSilver), new ItemStack(ModBlocks.blockSilver));
			
			FMLLog.log(Level.INFO, Reference.MOD_ID + ": " + "OreDictionary implemented successfully.");
			
			FMLLog.log(Level.FINEST, Reference.MOD_ID + ": " + "The name " + DictionaryHelper.getName(ModItems.ingotCorundum) + "was successfully added to the OreDictionary");
			FMLLog.log(Level.FINEST, Reference.MOD_ID + ": " + "The name " + DictionaryHelper.getName(ModBlocks.oreCorundum) + "was successfully added to the OreDictionary");
			FMLLog.log(Level.FINEST, Reference.MOD_ID + ": " + "The name " + DictionaryHelper.getName(ModBlocks.blockCorundum) + "was successfully added to the OreDictionary");
			FMLLog.log(Level.FINEST, Reference.MOD_ID + ": " + "The name " + DictionaryHelper.getName(ModItems.ingotSilver) + "was successfully added to the OreDictionary");
			FMLLog.log(Level.FINEST, Reference.MOD_ID + ": " + "The name " + DictionaryHelper.getName(ModBlocks.oreSilver) + "was successfully added to the OreDictionary");
			FMLLog.log(Level.FINEST, Reference.MOD_ID + ": " + "The name " + DictionaryHelper.getName(ModBlocks.blockSilver) + "was successfully added to the OreDictionary");
		}
		catch(Exception e)
		{
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + ": " + "Cannot implement the OreDictionary.");
		}
	}
	
}
