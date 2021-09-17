package sdw.obsidious.mod.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianToolMaterial implements ToolMaterial {
    public static final ObsidianToolMaterial INSTANCE = new ObsidianToolMaterial();
    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }

    @Override
public float getAttackDamage() {
    return 4.0F;
}

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.OBSIDIANCHUNK);
    }

}