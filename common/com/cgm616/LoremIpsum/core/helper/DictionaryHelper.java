package com.cgm616.LoremIpsum.core.helper;

import java.util.logging.Level;

import com.cgm616.LoremIpsum.lib.Reference;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class DictionaryHelper {
	
	public static String name;
	public static String[] names;
	public static String[] keys;
	public static String key;
	
	public static String getName(Block block)
	{
		name = block.getUnlocalizedName();
		if(name.endsWith("Block"))
		{
			keys = name.split("tile.");
			names = keys[1].split("Block");
			key = names[0];
			name = "block" + key;
		}
		if(name.endsWith("Ore"))
		{
			keys = name.split("tile.");
			names = keys[1].split("Ore");
			key = names[0];
			name = "ore" + key;
		}
		FMLLog.log(Level.INFO, Reference.MOD_ID + ": " + "The name of the block " + block.getUnlocalizedName() + " in the OreDictionary is " + name);
		return name;
	}
	public static String getName(Item item)
	{
		name = item.getUnlocalizedName();
		if(name.endsWith("Ingot"))
		{
			keys = name.split("item.");
			names = keys[1].split("Ingot");
			key = names[0];
			name = "ingot" + key;
		}
		FMLLog.log(Level.INFO, Reference.MOD_ID + ": " + "The name of the item " + item.getUnlocalizedName() + " in the OreDictionary is " + name);
		return name;
	}
}
