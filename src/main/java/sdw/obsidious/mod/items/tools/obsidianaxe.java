package sdw.obsidious.mod.items.tools;



import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;


import net.minecraft.item.ToolMaterial;
import sdw.obsidious.mod.obsidiousmod;


public class obsidianaxe extends AxeItem {


    public obsidianaxe(ToolMaterial OBSIDIANTOOL) {
        super(OBSIDIANTOOL, (int) 5.0, -3.0F, new Item.Settings().group(obsidiousmod.MODTAB));
    }


    
}


