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
			ItemId.ingotCorundumId = config.get("Item Id", Strings.ingotCorundumName, ItemId.ingotCorundumIdDefault).getInt();
			
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
