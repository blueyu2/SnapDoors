package com.blueyu2.snapdoors.item;

import com.blueyu2.snapdoors.SnapDoors;
import com.blueyu2.snapdoors.init.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * Created by Blueyu2 on 8/23/2014.
 */
public class ItemDoors extends ItemDoor {
    public String type;

    public ItemDoors(String name, String type) {
        super(Material.wood);
        setUnlocalizedName(name);
        setTextureName(type);
        this.type = type;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
            itemIcon = iconRegister.registerIcon(SnapDoors.modId + ":" + this.getIconString());
    }

    @Override
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        if (p_77648_7_ != 1)
        {
            return false;
        }
        else
        {
            ++p_77648_5_;
            Block block;
            if (this.type.equals("door_acacia"))
            {
                block = ModBlocks.acacia;
            }
            else if (this.type.equals("door_birch"))
            {
                block = ModBlocks.birch;
            }
            else if (this.type.equals("door_dark_oak"))
            {
                block = ModBlocks.dark;
            }
            else if (this.type.equals("door_jungle"))
            {
                block = ModBlocks.jungle;
            }
            else if (this.type.equals("door_spruce"))
            {
                block = ModBlocks.spruce;
            }
            else
            {
                block = Blocks.wooden_door;
            }

            if (p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) && p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_ + 1, p_77648_6_, p_77648_7_, p_77648_1_))
            {
                if (!block.canPlaceBlockAt(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_))
                {
                    return false;
                }
                else
                {
                    int i1 = MathHelper.floor_double((double) ((p_77648_2_.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
                    placeDoorBlock(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, i1, block);
                    --p_77648_1_.stackSize;
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }
}
