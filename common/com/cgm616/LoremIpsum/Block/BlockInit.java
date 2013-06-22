package com.cgm616.LoremIpsum.Block;

import com.cgm616.LoremIpsum.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockInit {
	
	public static void blocksInit() 
	{
		Reference.oreCorundum = new ModBlock(Reference.oreCorundumId, Material.iron, "corundumOre", CreativeTabs.tabMaterials, Reference.oreCorundumId, 1).setUnlocalizedName("CorundumOre").setLightValue(1.0F).setHardness(2.5F).setResistance(37F).setStepSound(Block.soundStoneFootstep);
	}
	public static void blockRegisters()
	{
		GameRegistry.registerBlock(Reference.oreCorundum, "oreCorundum");
	}
	public static void languageRegisters()
	{
		
	}

}
