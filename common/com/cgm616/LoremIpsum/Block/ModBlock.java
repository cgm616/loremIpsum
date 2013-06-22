package com.cgm616.LoremIpsum.Block;

import java.util.Random;

import com.cgm616.LoremIpsum.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlock extends Block{

	// private String blockTextureFront, blockTextureSide, blockTextureBottom, blockTextureTop;
	private String blockTexture;
	private int idDropping;
	private int numDropping;
	// private Icon side, bottom, front, top;
	
	public ModBlock(int id, Material par2Material, String textureName,CreativeTabs tab, int idDrop, int numDropped) {
		super(id, par2Material);
		this.blockTexture = textureName;
		this.setCreativeTab(tab);
		this.idDropping = idDrop;
		this.numDropping = numDropped;
	}
	
	

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconreg)
	{
		this.blockIcon = iconreg.registerIcon(Reference.MOD_ID + ":" + this.blockTexture);
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
