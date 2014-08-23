package com.blueyu2.snapdoors.init;

import com.blueyu2.snapdoors.SnapDoors;
import com.blueyu2.snapdoors.block.BlockDoors;
import com.blueyu2.snapdoors.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Blueyu2 on 8/6/2014.
 */
@GameRegistry.ObjectHolder(SnapDoors.modId)
public class ModBlocks {
    public static final BlockDoors acacia = new BlockDoors(Names.Blocks.doorAcacia, "door_acacia");
    public static final BlockDoors birch = new BlockDoors(Names.Blocks.doorBirch, "door_birch");
    public static final BlockDoors dark = new BlockDoors(Names.Blocks.doorDark, "door_dark_oak");
    public static final BlockDoors jungle = new BlockDoors(Names.Blocks.doorJungle, "door_jungle");
    public static final BlockDoors spruce = new BlockDoors(Names.Blocks.doorSpruce, "door_spruce");

    public static void init(){
        GameRegistry.registerBlock(acacia, Names.Blocks.doorAcacia);
        GameRegistry.registerBlock(birch, Names.Blocks.doorBirch);
        GameRegistry.registerBlock(dark, Names.Blocks.doorDark);
        GameRegistry.registerBlock(jungle, Names.Blocks.doorJungle);
        GameRegistry.registerBlock(spruce, Names.Blocks.doorSpruce);
    }
}
