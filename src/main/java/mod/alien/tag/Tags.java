package mod.alien.tag;

import mod.alien.steel.Main;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class Tags {
    public static final class Items{
        public static final ITag.INamedTag<Item> INGOT_STEEL = forge("ingots/steel");

        public static final ITag.INamedTag<Item> DUST_STEEL = forge("dust/steel");
        public static final ITag.INamedTag<Item> DUST_IRON = forge("dust/iron");
        public static final ITag.INamedTag<Item> DUST_COAL = forge("dust/coal");

        public static ITag.INamedTag<Item> forge(String path){
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        public static ITag.INamedTag<Item> mod(String path){
            return ItemTags.makeWrapperTag(new ResourceLocation(Main.MODID, path).toString());
        }
    }
}
