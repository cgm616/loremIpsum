package com.cgm616.LoremIpsum;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.cgm616.LoremIpsum.block.ModBlocks;
import com.cgm616.LoremIpsum.core.ConfigurationHandler;
import com.cgm616.LoremIpsum.core.LocalizationHandler;
import com.cgm616.LoremIpsum.core.common.CommonProxy;
import com.cgm616.LoremIpsum.craft.CraftingHandler;
import com.cgm616.LoremIpsum.creativetab.TabLoremIpsum;
import com.cgm616.LoremIpsum.item.ModItems;
import com.cgm616.LoremIpsum.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(
		modid = Reference.MOD_ID,
		name = Reference.MOD_NAME,
		version = Reference.VERSION
)
@NetworkMod(
		channels = {Reference.CHANNEL_NAME},
		serverSideRequired = false,
		clientSideRequired = true
)
public class LoremIpsum {
	
	@SidedProxy(clientSide="com.cgm616.LoremIpsum.core.client.ClientProxy", serverSide="com.cgm616.LoremIpsum.core.common.CommonProxy")
    public static CommonProxy proxy;
	
    @Instance
    public static LoremIpsum instance = new LoremIpsum();
    
    public static CreativeTabs loremIpsumTab = new TabLoremIpsum(CreativeTabs.getNextID(), "Basic" + Reference.MOD_ID);
    
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
		ModBlocks.blockInit();
		ModItems.itemInit();
		LocalizationHandler.loadLanguages();
		CraftingHandler.craftInit();
	}
	
	@cpw.mods.fml.common.Mod.Init
	public void Init(FMLInitializationEvent event)
	{
		
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
