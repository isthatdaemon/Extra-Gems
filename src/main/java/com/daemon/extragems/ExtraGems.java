package com.daemon.extragems;

import com.daemon.extragems.block.ModBlocks;
import com.daemon.extragems.item.ModItemGroups;
import com.daemon.extragems.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraGems implements ModInitializer {
	public static final String MOD_ID = "extragems";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}