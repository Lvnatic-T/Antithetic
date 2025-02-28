package net.lvnatic.antithetic;

import net.fabricmc.api.ModInitializer;

import net.lvnatic.antithetic.block.ModBlocks;
import net.lvnatic.antithetic.item.ModItemGroups;
import net.lvnatic.antithetic.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Antithetic implements ModInitializer {
	public static final String MOD_ID = "antithetic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}