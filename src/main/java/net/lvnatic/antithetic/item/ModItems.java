package net.lvnatic.antithetic.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lvnatic.antithetic.Antithetic;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BURNDRIVE = registerItem("burndrive", new Item(new Item.Settings()));
    public static final Item CHILLDRIVE = registerItem("chilldrive", new Item(new Item.Settings()));
    public static final Item DOUSEDRIVE = registerItem("dousedrive", new Item(new Item.Settings()));
    public static final Item SHOCKDRIVE = registerItem("shockdrive", new Item(new Item.Settings()));

    public static final Item CORNERSTONEMASK = registerItem("cornerstonemask", new Item(new Item.Settings()));
    public static final Item HEARTHFLAMEMASK = registerItem("hearthflamemask", new Item(new Item.Settings()));
    public static final Item WELLSPRINGMASK = registerItem("wellspringmask", new Item(new Item.Settings()));

    public static final Item ABOMASITE = registerItem("abomasite", new Item(new Item.Settings()));
    public static final Item ABSOLITE = registerItem("absolite", new Item(new Item.Settings()));
    public static final Item AERODACTYLITE = registerItem("aerodactylite", new Item(new Item.Settings()));
    public static final Item AGGRONITE = registerItem("aggronite", new Item(new Item.Settings()));
    public static final Item ALAKAZITE = registerItem("alakazite", new Item(new Item.Settings()));
    public static final Item ALTARIANITE = registerItem("altarianite", new Item(new Item.Settings()));
    public static final Item AMPHAROSITE = registerItem("ampharosite", new Item(new Item.Settings()));
    public static final Item AUDINITE = registerItem("audinite", new Item(new Item.Settings()));
    public static final Item BANETTITE = registerItem("banettite", new Item(new Item.Settings()));
    public static final Item BEEDRILLITE = registerItem("beedrillite", new Item(new Item.Settings()));
    public static final Item BLASTOISINITE = registerItem("blastoisinite", new Item(new Item.Settings()));
    public static final Item BLAZIKENITE = registerItem("blazikenite", new Item(new Item.Settings()));
    public static final Item CAMERUPTITE = registerItem("cameruptite", new Item(new Item.Settings()));
    public static final Item CHARIZARDITE_X = registerItem("charizardite_x", new Item(new Item.Settings()));
    public static final Item CHARIZARDITE_Y = registerItem("charizardite_y", new Item(new Item.Settings()));
    public static final Item DIANCITE = registerItem("diancite", new Item(new Item.Settings()));
    public static final Item GALLADITE = registerItem("galladite", new Item(new Item.Settings()));
    public static final Item GARCHOMPITE = registerItem("garchompite", new Item(new Item.Settings()));
    public static final Item GARDEVOIRITE = registerItem("gardevoirite", new Item(new Item.Settings()));
    public static final Item GENGARITE = registerItem("gengarite", new Item(new Item.Settings()));
    public static final Item GLALITITE = registerItem("glalitite", new Item(new Item.Settings()));
    public static final Item GYARADOSITE = registerItem("gyaradosite", new Item(new Item.Settings()));
    public static final Item HERACRONITE = registerItem("heracronite", new Item(new Item.Settings()));
    public static final Item HOUNDOOMINITE = registerItem("houndoominite", new Item(new Item.Settings()));
    public static final Item KANGASKHANITE = registerItem("kangaskhanite", new Item(new Item.Settings()));
    public static final Item LATIOSITE = registerItem("latiosite", new Item(new Item.Settings()));
    public static final Item LATIASITE = registerItem("latiasite", new Item(new Item.Settings()));
    public static final Item LOPUNNITE = registerItem("lopunnite", new Item(new Item.Settings()));
    public static final Item LUCARIONITE = registerItem("lucarionite", new Item(new Item.Settings()));
    public static final Item MANECTITE = registerItem("manectite", new Item(new Item.Settings()));
    public static final Item MAWILITE = registerItem("mawilite", new Item(new Item.Settings()));
    public static final Item MEDICHAMITE = registerItem("medichamite", new Item(new Item.Settings()));
    public static final Item METAGROSSITE = registerItem("metagrossite", new Item(new Item.Settings()));
    public static final Item MEWTWONITE_X = registerItem("mewtwonite_x", new Item(new Item.Settings()));
    public static final Item MEWTWONITE_Y = registerItem("mewtwonite_y", new Item(new Item.Settings()));
    public static final Item PIDGEOTITE = registerItem("pidgeotite", new Item(new Item.Settings()));
    public static final Item PINSIRITE = registerItem("pinsirite", new Item(new Item.Settings()));
    public static final Item SABLENITE = registerItem("sablenite", new Item(new Item.Settings()));
    public static final Item SALAMENCITE = registerItem("salamencite", new Item(new Item.Settings()));
    public static final Item SCEPTILITE = registerItem("sceptilite", new Item(new Item.Settings()));
    public static final Item SCIZORITE = registerItem("scizorite", new Item(new Item.Settings()));
    public static final Item SHARPEDONITE = registerItem("sharpedonite", new Item(new Item.Settings()));
    public static final Item SLOWBRONITE = registerItem("slowbronite", new Item(new Item.Settings()));
    public static final Item STEELIXITE = registerItem("steelixite", new Item(new Item.Settings()));
    public static final Item SWAMPERTITE = registerItem("swampertite", new Item(new Item.Settings()));
    public static final Item TYRANITARITE = registerItem("tyranitarite", new Item(new Item.Settings()));
    public static final Item VENUSAURITE = registerItem("venusaurite", new Item(new Item.Settings()));

    public static final Item BUGMEMORY = registerItem("bugmemory", new Item(new Item.Settings()));
    public static final Item DARKMEMORY = registerItem("darkmemory", new Item(new Item.Settings()));
    public static final Item DRAGONMEMORY = registerItem("dragonmemory", new Item(new Item.Settings()));
    public static final Item ELECTRICMEMORY = registerItem("electricmemory", new Item(new Item.Settings()));
    public static final Item FAIRYMEMORY = registerItem("fairymemory", new Item(new Item.Settings()));
    public static final Item FIGHTINGMEMORY = registerItem("fightingmemory", new Item(new Item.Settings()));
    public static final Item FIREMEMORY = registerItem("firememory", new Item(new Item.Settings()));
    public static final Item FLYINGMEMORY = registerItem("flyingmemory", new Item(new Item.Settings()));
    public static final Item GHOSTMEMORY = registerItem("ghostmemory", new Item(new Item.Settings()));
    public static final Item GRASSMEMORY = registerItem("grassmemory", new Item(new Item.Settings()));
    public static final Item GROUNDMEMORY = registerItem("groundmemory", new Item(new Item.Settings()));
    public static final Item ICEMEMORY = registerItem("icememory", new Item(new Item.Settings()));
    public static final Item POISONMEMORY = registerItem("poisonmemory", new Item(new Item.Settings()));
    public static final Item PSYCHICMEMORY = registerItem("psychicmemory", new Item(new Item.Settings()));
    public static final Item ROCKMEMORY = registerItem("rockmemory", new Item(new Item.Settings()));
    public static final Item STEELMEMORY = registerItem("steelmemory", new Item(new Item.Settings()));
    public static final Item WATERMEMORY = registerItem("watermemory", new Item(new Item.Settings()));

    public static final Item ADAMANTORB = registerItem("adamantorb", new Item(new Item.Settings()));
    public static final Item GRISEOUSORB = registerItem("griseousorb", new Item(new Item.Settings()));
    public static final Item LUSTROUSORB = registerItem("lustrousorb", new Item(new Item.Settings()));
    public static final Item REDORB = registerItem("redorb", new Item(new Item.Settings()));
    public static final Item BLUEORB = registerItem("blueorb", new Item(new Item.Settings()));

    public static final Item BLANKPLATE = registerItem("blankplate", new Item(new Item.Settings()));
    public static final Item DRACOPLATE = registerItem("dracoplate", new Item(new Item.Settings()));
    public static final Item DREADPLATE = registerItem("dreadplate", new Item(new Item.Settings()));
    public static final Item EARTHPLATE = registerItem("earthplate", new Item(new Item.Settings()));
    public static final Item FISTPLATE = registerItem("fistplate", new Item(new Item.Settings()));
    public static final Item FLAMEPLATE = registerItem("flameplate", new Item(new Item.Settings()));
    public static final Item ICICLEPLATE = registerItem("icicleplate", new Item(new Item.Settings()));
    public static final Item INSECTPLATE = registerItem("insectplate", new Item(new Item.Settings()));
    public static final Item IRONPLATE = registerItem("ironplate", new Item(new Item.Settings()));
    public static final Item MEADOWPLATE = registerItem("meadowplate", new Item(new Item.Settings()));
    public static final Item MINDPLATE = registerItem("mindplate", new Item(new Item.Settings()));
    public static final Item PIXIEPLATE = registerItem("pixieplate", new Item(new Item.Settings()));
    public static final Item SKYPLATE = registerItem("skyplate", new Item(new Item.Settings()));
    public static final Item SPLASHPLATE = registerItem("splashplate", new Item(new Item.Settings()));
    public static final Item SPOOKYPLATE = registerItem("spookyplate", new Item(new Item.Settings()));
    public static final Item STONEPLATE = registerItem("stoneplate", new Item(new Item.Settings()));
    public static final Item TOXICPLATE = registerItem("toxicplate", new Item(new Item.Settings()));
    public static final Item ZAPPLATE = registerItem("zapplate", new Item(new Item.Settings()));

    public static final Item RUSTEDSWORD = registerItem("rustedsword", new Item(new Item.Settings()));
    public static final Item RUSTEDSHIELD = registerItem("rustedshield", new Item(new Item.Settings()));
    public static final Item GRACIDEA = registerItem("gracidea", new Item(new Item.Settings()));
    public static final Item PRISON_BOTTLE = registerItem("prison_bottle", new Item(new Item.Settings()));
    public static final Item REVEALGLASS = registerItem("revealglass", new Item(new Item.Settings()));
    public static final Item SCROLL_OF_DARKNESS = registerItem("scroll_of_darkness", new Item(new Item.Settings()));
    public static final Item SCROLL_OF_WATERS = registerItem("scroll_of_waters", new Item(new Item.Settings()));
    public static final Item DNASPLICER = registerItem("dnasplicer", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Antithetic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Antithetic.LOGGER.info ("Registering modded items for " + Antithetic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->  {

        });
    }
}