package net.schiavona.esoterica;

import net.fabricmc.api.ModInitializer;
import net.schiavona.esoterica.block.ModBlocks;
import net.schiavona.esoterica.block.ModSlabs;
import net.schiavona.esoterica.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esoterica implements ModInitializer {

	public static final String MOD_ID = "esoterica";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSlabs.registerModSlabs();

	}
}
