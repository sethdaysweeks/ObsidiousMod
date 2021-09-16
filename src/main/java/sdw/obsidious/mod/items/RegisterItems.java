package sdw.obsidious.mod.items;


import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import sdw.obsidious.mod.obsidiousmod;
import sdw.obsidious.mod.items.tools.obsidianaxe;
import sdw.obsidious.mod.items.tools.obsidianhoe;
import sdw.obsidious.mod.items.tools.obsidianpickaxe;


public class RegisterItems {
//Obsidian chunk
public static final Item OBSIDIANCHUNK = new Item(new Item.Settings().group(obsidiousmod.MODTAB));

    

// Obsidian armor
public static final ArmorMaterial OBSIDIAN = new CustomArmorMaterial();


public static final Item OBSIDIANHELMET = new ArmorItem(OBSIDIAN,EquipmentSlot.HEAD,new Item.Settings().group(obsidiousmod.MODTAB));
public static final Item OBSIDIANBOOTS = new ArmorItem(OBSIDIAN,EquipmentSlot.FEET,new Item.Settings().group(obsidiousmod.MODTAB));
public static final Item OBSIDIANLEGGINGS = new ArmorItem(OBSIDIAN,EquipmentSlot.LEGS,new Item.Settings().group(obsidiousmod.MODTAB));
public static final Item OBSIDIANCHESTPLATE = new ArmorItem(OBSIDIAN,EquipmentSlot.CHEST,new Item.Settings().group(obsidiousmod.MODTAB));


//Obsidian Tools, the rest are in the obsidious/mod/items/tools folder

public static final ToolMaterial OBSIDIANTOOL = new CustomToolMaterial();
public static ToolItem OBSIDIANSHOVEL = new ShovelItem(OBSIDIANTOOL, -1.0F, -1.0F, new Item.Settings().group(obsidiousmod.MODTAB));
public static ToolItem OBSIDIANSWORD = new SwordItem(OBSIDIANTOOL, 4, -1.0F, new Item.Settings().group(obsidiousmod.MODTAB));





public static void register() {
//obsidian chunk register
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_chunk"), OBSIDIANCHUNK);  
        



//obsidian armor register

Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_helmet"), OBSIDIANHELMET);
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_chestplate"), OBSIDIANCHESTPLATE);
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_boots"), OBSIDIANBOOTS);
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_leggings"), OBSIDIANLEGGINGS);


//obsidian tools register

Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_pickaxe"), new obsidianpickaxe(OBSIDIANTOOL));
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_axe"), new obsidianaxe(OBSIDIANTOOL));
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_hoe"), new obsidianhoe(OBSIDIANTOOL));
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_sword"), OBSIDIANSWORD);
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_shovel"), OBSIDIANSHOVEL);
}}
