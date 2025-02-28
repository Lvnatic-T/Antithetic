package net.lvnatic.antithetic.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lvnatic.antithetic.Antithetic;
import net.lvnatic.antithetic.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MEGA_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Antithetic.MOD_ID, "mega_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BLAZIKENITE))
                    .displayName(Text.translatable("itemgroup.antithetic.mega_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ABOMASITE);
                        entries.add(ModItems.ABSOLITE);
                        entries.add(ModItems.AERODACTYLITE);
                        entries.add(ModItems.AGGRONITE);
                        entries.add(ModItems.ALAKAZITE);
                        entries.add(ModItems.ALTARIANITE);
                        entries.add(ModItems.AMPHAROSITE);
                        entries.add(ModItems.AUDINITE);
                        entries.add(ModItems.BANETTITE);
                        entries.add(ModItems.BEEDRILLITE);
                        entries.add(ModItems.BLASTOISINITE);
                        entries.add(ModItems.BLAZIKENITE);
                        entries.add(ModItems.CAMERUPTITE);
                        entries.add(ModItems.CHARIZARDITE_Y);
                        entries.add(ModItems.CHARIZARDITE_X);
                        entries.add(ModItems.DIANCITE);
                        entries.add(ModItems.GALLADITE);
                        entries.add(ModItems.GARCHOMPITE);
                        entries.add(ModItems.GARDEVOIRITE);
                        entries.add(ModItems.GENGARITE);
                        entries.add(ModItems.GLALITITE);
                        entries.add(ModItems.GYARADOSITE);
                        entries.add(ModItems.HERACRONITE);
                        entries.add(ModItems.HOUNDOOMINITE);
                        entries.add(ModItems.KANGASKHANITE);
                        entries.add(ModItems.LATIOSITE);
                        entries.add(ModItems.LATIASITE);
                        entries.add(ModItems.LOPUNNITE);
                        entries.add(ModItems.LUCARIONITE);
                        entries.add(ModItems.MANECTITE);
                        entries.add(ModItems.MAWILITE);
                        entries.add(ModItems.MEDICHAMITE);
                        entries.add(ModItems.METAGROSSITE);
                        entries.add(ModItems.MEWTWONITE_X);
                        entries.add(ModItems.MEWTWONITE_Y);
                        entries.add(ModItems.PIDGEOTITE);
                        entries.add(ModItems.PINSIRITE);
                        entries.add(ModItems.SABLENITE);
                        entries.add(ModItems.SALAMENCITE);
                        entries.add(ModItems.SCEPTILITE);
                        entries.add(ModItems.SCIZORITE);
                        entries.add(ModItems.SHARPEDONITE);
                        entries.add(ModItems.SLOWBRONITE);
                        entries.add(ModItems.STEELIXITE);
                        entries.add(ModItems.SWAMPERTITE);
                        entries.add(ModItems.TYRANITARITE);
                        entries.add(ModItems.VENUSAURITE);
                    }).build());

    public static final ItemGroup PLATE_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Antithetic.MOD_ID, "plate_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DRACOPLATE))
                    .displayName(Text.translatable("itemgroup.antithetic.plate_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLANKPLATE);
                        entries.add(ModItems.DRACOPLATE);
                        entries.add(ModItems.DREADPLATE);
                        entries.add(ModItems.EARTHPLATE);
                        entries.add(ModItems.FISTPLATE);
                        entries.add(ModItems.FLAMEPLATE);
                        entries.add(ModItems.ICICLEPLATE);
                        entries.add(ModItems.INSECTPLATE);
                        entries.add(ModItems.IRONPLATE);
                        entries.add(ModItems.MEADOWPLATE);
                        entries.add(ModItems.MINDPLATE);
                        entries.add(ModItems.PIXIEPLATE);
                        entries.add(ModItems.SKYPLATE);
                        entries.add(ModItems.SPLASHPLATE);
                        entries.add(ModItems.SPOOKYPLATE);
                        entries.add(ModItems.STONEPLATE);
                        entries.add(ModItems.TOXICPLATE);
                        entries.add(ModItems.ZAPPLATE);
                        entries.add(ModItems.BLANKMEMORY);
                        entries.add(ModItems.BUGMEMORY);
                        entries.add(ModItems.DARKMEMORY);
                        entries.add(ModItems.DRAGONMEMORY);
                        entries.add(ModItems.ELECTRICMEMORY);
                        entries.add(ModItems.FAIRYMEMORY);
                        entries.add(ModItems.FIGHTINGMEMORY);
                        entries.add(ModItems.FIREMEMORY);
                        entries.add(ModItems.FLYINGMEMORY);
                        entries.add(ModItems.GHOSTMEMORY);
                        entries.add(ModItems.GRASSMEMORY);
                        entries.add(ModItems.GROUNDMEMORY);
                        entries.add(ModItems.ICEMEMORY);
                        entries.add(ModItems.POISONMEMORY);
                        entries.add(ModItems.PSYCHICMEMORY);
                        entries.add(ModItems.ROCKMEMORY);
                        entries.add(ModItems.STEELMEMORY);
                        entries.add(ModItems.WATERMEMORY);
                        entries.add(ModItems.BLANKDRIVE);
                        entries.add(ModItems.BURNDRIVE);
                        entries.add(ModItems.CHILLDRIVE);
                        entries.add(ModItems.DOUSEDRIVE);
                        entries.add(ModItems.SHOCKDRIVE);
                    }).build());

    public static final ItemGroup OTHER_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Antithetic.MOD_ID, "other_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GRACIDEA))
                    .displayName(Text.translatable("itemgroup.antithetic.other_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CORNERSTONEMASK);
                        entries.add(ModItems.HEARTHFLAMEMASK);
                        entries.add(ModItems.WELLSPRINGMASK);
                        entries.add(ModItems.GRACIDEA);
                        entries.add(ModItems.ADAMANTORB);
                        entries.add(ModItems.GRISEOUSORB);
                        entries.add(ModItems.LUSTROUSORB);
                        entries.add(ModItems.REDORB);
                        entries.add(ModItems.BLUEORB);
                        entries.add(ModItems.RUSTEDSWORD);
                        entries.add(ModItems.RUSTEDSHIELD);
                        entries.add(ModItems.PRISON_BOTTLE);
                        entries.add(ModItems.REVEALGLASS);
                        entries.add(ModItems.REINSOFUNITY);
                        entries.add(ModItems.SCROLL_OF_DARKNESS);
                        entries.add(ModItems.SCROLL_OF_WATERS);
                        entries.add(ModItems.DNASPLICER);
                        entries.add(ModItems.BULB);
                        entries.add(ModBlocks.ROTOM_FAN);
                        entries.add(ModBlocks.ROTOM_FROST);
                        entries.add(ModBlocks.ROTOM_HEAT);
                        entries.add(ModBlocks.ROTOM_MOW);
                        entries.add(ModBlocks.ROTOM_WASH);
                    }).build());


    public static void registerItemGroups() {
        Antithetic.LOGGER.info("Registering Item Groups for " + Antithetic.MOD_ID);

    }
}
