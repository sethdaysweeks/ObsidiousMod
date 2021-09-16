package sdw.obsidious.mod.items.tools;



import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;


import net.minecraft.item.ToolMaterial;
import sdw.obsidious.mod.obsidiousmod;


public class obsidianhoe extends HoeItem {

    public obsidianhoe(ToolMaterial OBSIDIANTOOL) {
        super(OBSIDIANTOOL, (int) -3.0, 0F, new Item.Settings().group(obsidiousmod.MODTAB));
    }
    
}


