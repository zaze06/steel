package mod.alien.steel;

import mod.alien.steel.tools.ItemTiers;
import net.minecraft.command.arguments.ItemArgument;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

public class Items {

    public static final RegistryObject<Item> STEEL_INGOT = Registration.ITEMS.register("steel_ingot", () ->
            new Item(new Item.Properties().maxStackSize(64)));//.group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> STEEL_DUST = Registration.ITEMS.register("steel_dust", () ->
            new Item(new Item.Properties().maxStackSize(16).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> IRON_DUST = Registration.ITEMS.register("iron_dust", () ->
            new Item(new Item.Properties().maxStackSize(16).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> COAL_DUST = Registration.ITEMS.register("coal_dust", () ->
            new Item(new Item.Properties().maxStackSize(16).group(ItemGroup.MATERIALS)));
    // tools

    public static final RegistryObject<Item> STEEL_AXE = Registration.ITEMS.register("steel_axe", () ->
            new AxeItem(ItemTiers.steelTier, 6, 2, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> STEEL_PICKAXE = Registration.ITEMS.register("steel_pickaxe", () ->
            new PickaxeItem(ItemTiers.steelTier, 1, 2, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> STEEL_SHOVEL = Registration.ITEMS.register("steel_shovel", () ->
            new ShovelItem(ItemTiers.steelTier, 1, 2, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> STEEL_HOE = Registration.ITEMS.register("steel_hoe", () ->
            new HoeItem(ItemTiers.steelTier, 1, 2, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> STEEL_SWORD = Registration.ITEMS.register("steel_sword", () ->
            new SwordItem(ItemTiers.steelTier, 3, 2, new Item.Properties().group(ItemGroup.COMBAT)));

    //armor

    public static final RegistryObject<Item> STEEL_HELMET = Registration.ITEMS.register("steel_helmet", () ->
            new ArmorItem(ArmorMats.Steel, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = Registration.ITEMS.register("steel_chestplaye", () ->
            new ArmorItem(ArmorMats.Steel, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = Registration.ITEMS.register("steel_leggings", () ->
            new ArmorItem(ArmorMats.Steel, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> STEEL_BOOTS = Registration.ITEMS.register("steel_boots", () ->
            new ArmorItem(ArmorMats.Steel, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));


    public static void register() {}
}
