package com.blueyu2.snapdoors.init;

import com.blueyu2.snapdoors.SnapDoors;
import com.blueyu2.snapdoors.item.ItemDoors;
import com.blueyu2.snapdoors.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Blueyu2 on 8/8/2014.
 */
@GameRegistry.ObjectHolder(SnapDoors.modId)
public class ModItems {
    //public static final ItemSM crushedOre = new ItemCrushedOre();
    public static final ItemDoors acacia = new ItemDoors(Names.Items.itemAcacia, "door_acacia");
    public static final ItemDoors birch = new ItemDoors(Names.Items.itemBirch, "door_birch");
    public static final ItemDoors dark = new ItemDoors(Names.Items.itemDark, "door_dark_oak");
    public static final ItemDoors jungle = new ItemDoors(Names.Items.itemJungle, "door_jungle");
    public static final ItemDoors spruce = new ItemDoors(Names.Items.itemSpruce, "door_spruce");

    public static void init(){
        //GameRegistry.registerItem(crushedOre, ItemCrushedOre.itemName);
        GameRegistry.registerItem(acacia, Names.Items.itemAcacia);
        GameRegistry.registerItem(birch, Names.Items.itemBirch);
        GameRegistry.registerItem(dark, Names.Items.itemDark);
        GameRegistry.registerItem(jungle, Names.Items.itemJungle);
        GameRegistry.registerItem(spruce, Names.Items.itemSpruce);

    }
}
