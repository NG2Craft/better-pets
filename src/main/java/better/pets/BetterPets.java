package better.pets;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public class BetterPets implements ModInitializer {
	public static final String MOD_ID = "better-pets";

	
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[BetterPets] Mod geladen, test");

		ServerLivingEntityEvents.ALLOW_DAMAGE.register((LivingEntity entity, DamageSource source, float amount) -> {
			LOGGER.info("[BetterPets] Schaden erkannt an: " + entity.getName().getString());
			
			Entity attacker = source.getAttacker();
			if (attacker != null) {
				LOGGER.info("Attacker: " + attacker.getName().getString());
			} else {
				LOGGER.info("Attacker: nicht erkannt");
			}
			
			return true; 
		});

	}
}
