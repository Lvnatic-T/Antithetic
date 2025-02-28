package net.lvnatic.antithetic.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lvnatic.antithetic.block.ModBlocks;
import net.lvnatic.antithetic.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FROST);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_HEAT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
