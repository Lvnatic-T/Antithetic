package net.lvnatic.antithetic.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lvnatic.antithetic.Antithetic;
import net.lvnatic.antithetic.block.custom.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.register;

public class ModBlocks {

    public static final Block METEOR = registerBlock("meteor",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(50.0F, 1200.0F))
    );

    public static final Block ROTOM_FAN = registerBlock("rotom_fan",
            new RotomFan(AbstractBlock.Settings.create()
                    .strength(1.5F)
                    .nonOpaque()
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            )
    );

    public static final Block ROTOM_FROST = registerBlock("rotom_frost",
            new RotomFrost(AbstractBlock.Settings.create()
                    .strength(1.5F)
                    .nonOpaque()
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            )
    );

    public static final Block ROTOM_HEAT = registerBlock("rotom_heat",
            new RotomHeat(AbstractBlock.Settings.create()
                    .strength(1.5F)
                    .nonOpaque()
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            )
    );

    public static final Block ROTOM_MOW = registerBlock("rotom_mow",
            new RotomMow(AbstractBlock.Settings.create()
                    .strength(1.5F)
                    .nonOpaque()
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            )
    );

    public static final Block ROTOM_WASH = registerBlock("rotom_wash",
            new RotomWash(AbstractBlock.Settings.create()
                    .strength(1.5F)
                    .nonOpaque()
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            )
    );


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Antithetic.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Antithetic.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Antithetic.LOGGER.info("Registering modded Blocks for " + Antithetic.MOD_ID);
    }
}
