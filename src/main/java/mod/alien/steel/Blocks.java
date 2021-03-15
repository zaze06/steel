package mod.alien.steel;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class Blocks {

    public static final RegistryObject<Block> STEEL_BLOCK = register("steel_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON)
                .hardnessAndResistance(7,8)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .setRequiresTool()
                .slipperiness(4)
            ), new Item.Properties().maxStackSize(64));

    public static void register() {
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String Name, Supplier<T> Block) {

        return Registration.BLOCKS.register(Name, Block);
    }

    private static <T extends Block> RegistryObject<T> register(String Name, Supplier<T> Block, Item.Properties ItemProperties){
        RegistryObject<T> ret = registerNoItem(Name, Block);
        Registration.ITEMS.register(Name, () -> new BlockItem(ret.get(), ItemProperties));
        return ret;
    }
}
