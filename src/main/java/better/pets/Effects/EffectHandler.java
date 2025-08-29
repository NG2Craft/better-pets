package better.pets.Effects;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.Entity;
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance; //new Import for giving the instance of the effect
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.entity.passive.CowEntity;


public class EffectHandler {

	public static boolean initEffect () {
		ServerLivingEntityEvents.ALLOW_DAMAGE.register((entity, source, amount) -> {
			Entity attacker = source.getAttacker();

			// Wenn der Angreifer ein gezähmter Wolf ist
			if (attacker instanceof WolfEntity wolf && wolf.isTamed()) {
				// Wenn der Besitzer ein Spieler ist
				if (wolf.getOwner() instanceof PlayerEntity owner) {
					// Stärke I Effekt für 10 Sekunden
					owner.addStatusEffect(new StatusEffectInstance(
						StatusEffects.STRENGTH,
						//TODO: more Effects, apply on multiple skins, with varios breeding combinations
						10 * 20, // 10 Sekunden in Ticks
						0        // Stärke I
					));
				}
			}
			return true;
			
		});
		return true;
	}
}
