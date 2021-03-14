package mod.alien.steel;

import mod.alien.steel.tools.ItemTiers;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
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

    public static final RegistryObject<Item> STEAL_AXE = Registration.ITEMS.register("steel_axe", () ->
            new AxeItem(ItemTiers.steelTier, 1, 2, new Item.Properties().group(ItemGroup.TOOLS)));



    public static void register() {
        STEAL_AXE.get();

        System.out.println("\n\n\n\n\nRegistering Items\n\n\n\n\n\n\n");
    }
}
