package mod.alien.steel.tools;

import mod.alien.steel.Items;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class ItemTiers {
    public static IItemTier steelTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 1486;
        }

        @Override
        public float getEfficiency() {
            return 8;
        }

        @Override
        public float getAttackDamage() {
            return 8;
        }

        @Override
        public int getHarvestLevel() {
            return 4;
        }

        @Override
        public int getEnchantability() {
            return 10;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(Items.STEEL_INGOT.get());
        }
    };
}
