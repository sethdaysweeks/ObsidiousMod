package sdw.obsidious.mod.items.tools;



import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

import net.minecraft.item.ToolMaterial;
import sdw.obsidious.mod.obsidiousmod;


public class obsidianpickaxe extends PickaxeItem {


    public obsidianpickaxe(ToolMaterial OBSIDIANTOOL) {
        super(OBSIDIANTOOL, (int) 1.0, -2.0F, new Item.Settings().group(obsidiousmod.MODTAB));
    }
    
}


