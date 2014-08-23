package com.blueyu2.snapdoors.block;

import com.blueyu2.snapdoors.SnapDoors;
import com.blueyu2.snapdoors.init.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.IconFlipped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Blueyu2 on 8/23/2014.
 */
public class BlockDoors extends BlockDoor {
    public IIcon[] iconTop;
    public IIcon[] iconBottom;

    public BlockDoors(String name, String type) {
        super(Material.wood);
        setHardness(3.0F);
        setStepSound(soundTypeWood);
        setBlockName(name);
        disableStats();
        setBlockTextureName(type);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return this.iconBottom[0];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
    {
        if (p_149673_5_ != 1 && p_149673_5_ != 0)
        {
            int i1 = this.func_150012_g(p_149673_1_, p_149673_2_, p_149673_3_, p_149673_4_);
            int j1 = i1 & 3;
            boolean flag = (i1 & 4) != 0;
            boolean flag1 = false;
            boolean flag2 = (i1 & 8) != 0;

            if (flag)
            {
                if (j1 == 0 && p_149673_5_ == 2)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 1 && p_149673_5_ == 5)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 2 && p_149673_5_ == 3)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 3 && p_149673_5_ == 4)
                {
                    flag1 = !flag1;
                }
            }
            else
            {
                if (j1 == 0 && p_149673_5_ == 5)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 1 && p_149673_5_ == 3)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 2 && p_149673_5_ == 4)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 3 && p_149673_5_ == 2)
                {
                    flag1 = !flag1;
                }

                if ((i1 & 16) != 0)
                {
                    flag1 = !flag1;
                }
            }

            return flag2 ? this.iconTop[flag1?1:0] : this.iconBottom[flag1?1:0];
        }
        else
        {
            return this.iconBottom[0];
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.iconTop = new IIcon[2];
        this.iconBottom = new IIcon[2];
        this.iconTop[0] = iconRegister.registerIcon(SnapDoors.modId + ":" + this.getTextureName() + "_upper");
        this.iconBottom[0] = iconRegister.registerIcon(SnapDoors.modId + ":" + this.getTextureName() + "_lower");
        this.iconTop[1] = new IconFlipped(this.iconTop[0], true, false);
        this.iconBottom[1] = new IconFlipped(this.iconBottom[0], true, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return this.getTextureName().equals("door_acacia") ? ModItems.acacia : (this.getTextureName().equals("door_birch") ? ModItems.birch : (this.getTextureName().equals("door_dark_oak") ? ModItems.dark : (this.getTextureName().equals("door_jungle") ? ModItems.jungle : (this.getTextureName().equals("door_spruce") ? ModItems.spruce : Items.wooden_door))));
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return (p_149650_1_ & 8) != 0 ? null : (this.getTextureName().equals("door_acacia") ? ModItems.acacia : (this.getTextureName().equals("door_birch") ? ModItems.birch : (this.getTextureName().equals("door_dark_oak") ? ModItems.dark : (this.getTextureName().equals("door_jungle") ? ModItems.jungle : (this.getTextureName().equals("door_spruce") ? ModItems.spruce : Items.wooden_door)))));
    }

}
