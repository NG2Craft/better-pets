package better.pets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import net.fabricmc.api.ModInitializer;
import better.pets.CustomItems.ModItems;
import better.pets.Effects.EffectHandler;
import better.pets.MobDrops.DropHandler;

public class BetterPets implements ModInitializer {
	public static final String MOD_ID = "better-pets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		DropHandler.modidfyLootTables();
		EffectHandler.initEffect();
		ModItems.registerModItems();

		LOGGER.info("[BetterPets] Mod geladen");

	}
}
