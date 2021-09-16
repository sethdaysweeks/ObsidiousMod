package sdw.obsidious.mod.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;


public class CustomArmorMaterial implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] {6, 12, 16, 6};
	private static final int[] PROTECTION_VALUES = new int[] {6, 12, 16, 6}; 
 
	// In which A is helmet, B chestplate, C leggings and D boots. 
	// For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}

    @Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 0;
	}

 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 15;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(RegisterItems.OBSIDIANCHUNK);
	}
 
	@Override
	public String getName() {
		// Must be all lowercase
		return "obsidian";
	}
 
	@Override
	public float getToughness() {
		return 5;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 0;
	}

}
