package com.cgm616.LoremIpsum.block;

import com.cgm616.LoremIpsum.LoremIpsum;
import com.cgm616.LoremIpsum.lib.BlockId;
import com.cgm616.LoremIpsum.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block oreCorundum;
	
	public static void blockInit()
	{
		oreCorundum = new BlockLore(BlockId.oreCorundumId, Material.rock).setCreativeTab(LoremIpsum.loremIpsumTab).setHardness(10.0F).setUnlocalizedName(Strings.oreCorundumName).setLightValue(1.0F).setStepSound(Block.soundStoneFootstep).setResistance(37F);
		gameRegisters();
	}
	public static void gameRegisters()
	{
		GameRegistry.registerBlock(oreCorundum,"CorundumOre");
	}

}
