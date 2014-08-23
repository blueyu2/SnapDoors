package com.blueyu2.snapdoors.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * Created by Blueyu2 on 8/6/2014.
 */
public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.acacia), "ww", "ww", "ww", 'w', new ItemStack(Blocks.planks, 1, 4));
        GameRegistry.addRecipe(new ItemStack(ModItems.birch), "ww", "ww", "ww", 'w', new ItemStack(Blocks.planks, 1, 2));
        GameRegistry.addRecipe(new ItemStack(ModItems.dark), "ww", "ww", "ww", 'w', new ItemStack(Blocks.planks, 1, 5));
        GameRegistry.addRecipe(new ItemStack(ModItems.jungle), "ww", "ww", "ww", 'w', new ItemStack(Blocks.planks, 1, 3));
        GameRegistry.addRecipe(new ItemStack(ModItems.spruce), "ww", "ww", "ww", 'w', new ItemStack(Blocks.planks, 1, 1));
    }
}
