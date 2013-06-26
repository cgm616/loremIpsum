package com.cgm616.LoremIpsum.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
	
	public static Block oreCorundum;
	
	public static void blocksInit()
	{
		oreCorundum = new BlockLore(800, Material.rock).setCreativeTab(CreativeTabs.tabBlock).setHardness(10.0F).setUnlocalizedName("CorundumOre").setLightValue(1.0F).setStepSound(Block.soundStoneFootstep).setResistance(37F);
		gameRegisters();
	}
	public static void gameRegisters()
	{
		GameRegistry.registerBlock(oreCorundum,"CorundumOre");
	}

}
