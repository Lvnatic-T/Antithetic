package net.lvnatic.antithetic.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lvnatic.antithetic.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.METEOR)
                .add(ModBlocks.ROTOM_FROST)
                .add(ModBlocks.ROTOM_HEAT)
                .add(ModBlocks.ROTOM_MOW)
                .add(ModBlocks.ROTOM_WASH);

    getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ROTOM_FAN);
    }
}
