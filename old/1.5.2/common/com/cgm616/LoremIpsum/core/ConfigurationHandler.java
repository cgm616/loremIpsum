package com.cgm616.LoremIpsum.core;

import java.io.File;
import java.util.logging.Level;

import com.cgm616.LoremIpsum.lib.BlockId;
import com.cgm616.LoremIpsum.lib.ItemId;
import com.cgm616.LoremIpsum.lib.Reference;
import com.cgm616.LoremIpsum.lib.Strings;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
	
	public static Configuration config;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		try
		{
			config.load();

			BlockId.oreCorundumId = config.get("Block Id", Strings.oreCorundumName, BlockId.oreCorundumIdDefault).getInt();
			BlockId.blockCorundumId = config.get("Block Id", Strings.blockCorundumName, BlockId.blockCorundumIdDefault).getInt();
			BlockId.oreSilverId = config.get("Block Id", Strings.oreSilverName, BlockId.oreSilverIdDefault).getInt();
			BlockId.blockSilverId = config.get("Block Id", Strings.blockSilverName, BlockId.blockSilverIdDefault).getInt();
			
			ItemId.ingotCorundumId = config.get("Item Id", Strings.ingotCorundumName, ItemId.ingotCorundumIdDefault).getInt();
			ItemId.ingotSilverId = config.get("Item Id", Strings.ingotSilverName, ItemId.ingotSilverIdDefault).getInt();
			ItemId.pureRodId = config.get("Item Id", Strings.pureRodName, ItemId.pureRodIdDefault).getInt();
			
			ItemId.pickaxeCorundumId = config.get("Tool Id", Strings.pickaxeCorundumName, ItemId.pickaxeCorundumIdDefault).getInt();
			ItemId.axeCorundumId = config.get("Tool Id", Strings.axeCorundumName, ItemId.axeCorundumIdDefault).getInt();
			ItemId.swordCorundumId = config.get("Tool Id", Strings.swordCorundumName, ItemId.swordCorundumIdDefault).getInt();
			ItemId.hoeCorundumId = config.get("Tool Id", Strings.hoeCorundumName, ItemId.hoeCorundumIdDefault).getInt();
			ItemId.shovelCorundumId = config.get("Tool Id", Strings.shovelCorundumName, ItemId.shovelCorundumIdDefault).getInt();
			
			FMLLog.log(Level.INFO, Reference.MOD_ID + ": " + "Config file loaded sucessfully.");
		}
		catch(Exception e)
		{
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + ": " + "Cannot load the config file.");
		}
		finally
		{
			config.save();
		}
	}

}
