package com.cgm616.LoremIpsum.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;

import com.cgm616.LoremIpsum.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemLorePureRod extends ItemLore{
	
	public ItemLorePureRod(int par1) {
		super(par1);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register)
	{
		this.itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	@Override
    public boolean itemInteractionForEntity(ItemStack itemstack, EntityLiving entity)
    {
        if (entity.worldObj.isRemote)
        {
            return false;
        }
        if (entity instanceof EntityZombie)
        {
        	EntityZombie target = (EntityZombie)entity;
        	if(target.isVillager())
        	{
        		int spawnPosX = (int)target.lastTickPosX;
        		int spawnPosY = (int)target.lastTickPosY;
        		int spawnPosZ = (int)target.lastTickPosZ;
        		float spawnYOffset = target.yOffset;
        		float spawnEyeHeight = target.getEyeHeight();
        		target.setDead();
        		
        		EntityLiving entityliving = new EntityVillager(Minecraft.getMinecraft().theWorld);
        		entityliving.setPositionAndRotation(spawnPosX, spawnPosY - spawnYOffset + spawnEyeHeight, spawnPosZ, Minecraft.getMinecraft().theWorld.rand.nextFloat() * 360F, 0.0F);
        		entityliving.rotationYawHead = entityliving.rotationYaw;
                entityliving.renderYawOffset = entityliving.rotationYaw;
        		entityliving.initCreature();
        		Minecraft.getMinecraft().theWorld.spawnEntityInWorld(entityliving);
                entityliving.spawnExplosionParticle();
                entityliving.playLivingSound();
                return true;
        	}
        	return false;
        }
        return false;
    }
}
