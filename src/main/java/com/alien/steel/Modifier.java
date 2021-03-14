package com.alien.steel;

import net.minecraft.item.*;
import net.minecraft.item.Items;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.lang.reflect.Field;

public class Modifier {
    static Field maxDamage = ObfuscationReflectionHelper.findField(Item.class, "field_77699_b");
    static Field ArmorPoints = ObfuscationReflectionHelper.findField(ArmorMaterial.class, "field_78049_g");
    public static void moddify() {
        try{
            // Diamond
            maxDamage.setInt(Items.DIAMOND_AXE, 3);
            maxDamage.setInt(Items.DIAMOND_PICKAXE, 3);
            maxDamage.setInt(Items.DIAMOND_SWORD, 10);
            maxDamage.setInt(Items.DIAMOND_SHOVEL, 20);
            maxDamage.setInt(Items.DIAMOND_HOE, 15);

            //ArmorPoints.set(ArmorMaterial.DIAMOND, new int[]{1, 1, 1, 1});
            
            maxDamage.setInt(Items.DIAMOND_HELMET, 50);
            ArmorPoints.setInt(Items.DIAMOND_HELMET, 1);
            maxDamage.setInt(Items.DIAMOND_CHESTPLATE, 80);
            ArmorPoints.setInt(Items.DIAMOND_CHESTPLATE, 2);
            maxDamage.setInt(Items.DIAMOND_LEGGINGS, 70);
            ArmorPoints.setInt(Items.DIAMOND_LEGGINGS, 1);
            maxDamage.setInt(Items.DIAMOND_BOOTS, 40);
            ArmorPoints.setInt(Items.DIAMOND_BOOTS, 1);

            // Iron
            int ironDur = 912;
            int ironIng = 113;

            maxDamage.setInt(Items.IRON_AXE, ironDur);
            maxDamage.setInt(Items.IRON_HOE, ironDur);
            maxDamage.setInt(Items.IRON_SWORD, ironDur);
            maxDamage.setInt(Items.IRON_PICKAXE, ironDur);
            maxDamage.setInt(Items.IRON_SHOVEL, ironDur);

            maxDamage.setInt(Items.IRON_HELMET, ironIng*5);
            ArmorPoints.setInt(Items.IRON_HELMET, 2);
            maxDamage.setInt(Items.IRON_CHESTPLATE, ironIng*8);
            ArmorPoints.setInt(Items.IRON_CHESTPLATE, 7);
            maxDamage.setInt(Items.IRON_LEGGINGS, ironIng*7);
            ArmorPoints.setInt(Items.IRON_LEGGINGS, 5);
            maxDamage.setInt(Items.IRON_BOOTS, ironIng*4);
            ArmorPoints.setInt(Items.IRON_BOOTS, 2);

            //

        }catch (Exception e){

        }
    }
}
