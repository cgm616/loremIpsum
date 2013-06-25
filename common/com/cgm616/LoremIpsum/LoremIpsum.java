package com.cgm616.LoremIpsum;

import com.cgm616.LoremIpsum.block.ModBlocks;
import com.cgm616.LoremIpsum.core.LocalizationHandler;
import com.cgm616.LoremIpsum.core.common.CommonProxy;
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
		serverSideRequired = false,
		clientSideRequired = true
)
public class LoremIpsum {
	
	@SidedProxy(clientSide="com.cgm616.LoremIpsum.core.client.ClientProxy", serverSide="com.cgm616.LoremIpsum.core.common.CommonProxy")
    public static CommonProxy proxy;
	
    @Instance
    public static LoremIpsum instance = new LoremIpsum();
    
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		
		ModBlocks.blocksInit();
		LocalizationHandler.loadLanguages();
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
