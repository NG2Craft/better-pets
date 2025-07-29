package better.pets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance; //new Import for giving the instance of the effect
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.CowEntity;


public class BetterPets implements ModInitializer {
	public static final String MOD_ID = "better-pets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[BetterPets] Mod geladen");

		ServerLivingEntityEvents.ALLOW_DAMAGE.register((LivingEntity entity, DamageSource source, float amount) -> {
			Entity attacker = source.getAttacker();

			// Wenn der Angreifer ein gezähmter Wolf ist
			if (attacker instanceof WolfEntity wolf && wolf.isTamed()) {
				// Wenn der Besitzer ein Spieler ist
				if (wolf.getOwner() instanceof PlayerEntity owner) {
					// Stärke I Effekt für 10 Sekunden
					owner.addStatusEffect(new StatusEffectInstance(
						StatusEffects.STRENGTH,
						10 * 20, // 10 Sekunden in Ticks
						0        // Stärke I
					));
				}
			}

			return true;
		});
	}
}
