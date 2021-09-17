package sdw.obsidious.mod.items;


import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.FoodComponent;
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
// All items must be defined in part 1, then registered in part 2, then assigned a texture in resources/assets/obsidious/models and texture folder. dont 4get lang
//  _____________________________________PART 1 ITEM CREATION___________________________________


// Obsidian armor
public static final ArmorMaterial OBSIDIAN = new CustomArmorMaterial(); 
public static final Item OBSIDIANHELMET = new ArmorItem(OBSIDIAN,EquipmentSlot.HEAD,new Item.Settings().group(obsidiousmod.MODTAB));
public static final Item OBSIDIANBOOTS = new ArmorItem(OBSIDIAN,EquipmentSlot.FEET,new Item.Settings().group(obsidiousmod.MODTAB));
public static final Item OBSIDIANLEGGINGS = new ArmorItem(OBSIDIAN,EquipmentSlot.LEGS,new Item.Settings().group(obsidiousmod.MODTAB));
public static final Item OBSIDIANCHESTPLATE = new ArmorItem(OBSIDIAN,EquipmentSlot.CHEST,new Item.Settings().group(obsidiousmod.MODTAB));


//Obsidian chunk
public static final Item OBSIDIANCHUNK = new Item(new Item.Settings().group(obsidiousmod.MODTAB));


//Obsidian Food  
public static final FoodComponent.Builder FOOD1 = new FoodComponent.Builder().hunger(6).saturationModifier(8F).alwaysEdible()
.statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,20*30), 1F);
public static final Item OBSIDISUB = new Item(new Item.Settings().group(obsidiousmod.MODTAB).food(FOOD1.build()));

public static final FoodComponent.Builder AQUAFOOD1 = new FoodComponent.Builder().hunger(6).saturationModifier(8F).alwaysEdible()
.statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,20*30), 1F);
public static final Item OBSIDISUBMARINE = new Item(new Item.Settings().group(obsidiousmod.MODTAB).food(AQUAFOOD1.build()));

public static final FoodComponent.Builder FIREFOOD1 = new FoodComponent.Builder().hunger(6).saturationModifier(8F).alwaysEdible()
.statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,20*30), 1F);
public static final Item SPICY_OBSIDISUB = new Item(new Item.Settings().group(obsidiousmod.MODTAB).food(FIREFOOD1.build()));


//Obsidian Tools, the rest are in the /java.../obsidious/mod/items/tools folder cuz they special
public static final ToolMaterial OBSIDIANTOOL = new ObsidianToolMaterial();
public static ToolItem OBSIDIANSHOVEL = new ShovelItem(OBSIDIANTOOL, -1.0F, -1.0F, new Item.Settings().group(obsidiousmod.MODTAB));
public static ToolItem OBSIDIANSWORD = new SwordItem(OBSIDIANTOOL, 4, -1.0F, new Item.Settings().group(obsidiousmod.MODTAB));




// _____________________________________PART 2 ITEM register___________________________________
public static void register() {

//obsidian armor register
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_helmet"), OBSIDIANHELMET);
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_chestplate"), OBSIDIANCHESTPLATE);
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_boots"), OBSIDIANBOOTS);
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_leggings"), OBSIDIANLEGGINGS);


//obsidian chunk register
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_chunk"), OBSIDIANCHUNK);  


//Obsidian Food register
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidisub"), OBSIDISUB);
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidisubmarine"), OBSIDISUBMARINE);
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "spicy_obsidisub"), SPICY_OBSIDISUB);
        

//obsidian tools register
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_pickaxe"), new obsidianpickaxe(OBSIDIANTOOL));
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_axe"), new obsidianaxe(OBSIDIANTOOL));
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_hoe"), new obsidianhoe(OBSIDIANTOOL));
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_sword"), OBSIDIANSWORD);
Registry.register(Registry.ITEM, new Identifier("obsidiousmod", "obsidian_shovel"), OBSIDIANSHOVEL);


    }
}
