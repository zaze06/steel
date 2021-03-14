package mod.alien.steel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
    //



    public static void register() {
        System.out.println("\n\n\n\n\nRegistering Items\n\n\n\n\n\n\n");
    }
}
