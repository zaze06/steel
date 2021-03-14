package com.alien.tag;

import com.alien.steel.Items;
import com.alien.steel.Main;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends net.minecraft.data.ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(Tags.Items.DUST_STEEL).add(Items.STEEL_DUST.get());
        getOrCreateBuilder(Tags.Items.DUST_COAL).add(Items.COAL_DUST.get());
        getOrCreateBuilder(Tags.Items.DUST_IRON).add(Items.IRON_DUST.get());
        getOrCreateBuilder(Tags.Items.INGOT_STEEL).add(Items.STEEL_INGOT.get());
    }
}
