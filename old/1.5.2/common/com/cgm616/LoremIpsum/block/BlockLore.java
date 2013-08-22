package com.cgm616.LoremIpsum.block;

import java.util.Random;

import com.cgm616.LoremIpsum.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockLore extends Block{
	
	private int idDropping;
	private int numDropping;
	
	public BlockLore(int par1, Material par2Material, int idDrop, int numDrop) {
		super(par1, par2Material);
		this.idDropping = idDrop;
		this.numDropping = numDrop;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){

		this.blockIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	public int idDropped(int par1, Random rand, int par2)
	{
		return this.idDropping;
	}
	
	public int quantityDropped(Random rand)
	{
		return this.numDropping;
	}

}
