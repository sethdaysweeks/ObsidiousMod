package sdw.obsidious.mod.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CustomToolMaterial implements ToolMaterial {
    public static final CustomToolMaterial INSTANCE = new CustomToolMaterial();
    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0F;
    }

    @Override
public float getAttackDamage() {
    return 4.0F;
}

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 15;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(RegisterItems.OBSIDIANCHUNK);
    }

}