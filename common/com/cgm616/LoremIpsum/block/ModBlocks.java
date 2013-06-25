package com.cgm616.LoremIpsum.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block oreCorundum;
	
	public static void blocksInit()
	{
		oreCorundum = new OreCorundum(800, Material.rock);
		GameRegistry.registerBlock(oreCorundum, "oreCorundum");
	}

}
