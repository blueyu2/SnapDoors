package com.blueyu2.snapdoors;

import com.blueyu2.snapdoors.init.ModBlocks;
import com.blueyu2.snapdoors.init.ModItems;
import com.blueyu2.snapdoors.init.Recipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Blueyu2 on 8/23/2014.
 */
@Mod(modid = SnapDoors.modId, name = SnapDoors.modName, version = SnapDoors.modVersion)
public class SnapDoors {
    public static final String modId = "snapdoors";
    public static final String modName = "SnapDoors";
    public static final String modVersion = "1.7.10-1.1.0";

    @Mod.Instance(SnapDoors.modId)
    public static SnapDoors instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        Recipes.init();
    }
}
