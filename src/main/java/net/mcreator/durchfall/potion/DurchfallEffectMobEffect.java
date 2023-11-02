
package net.mcreator.durchfall.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.durchfall.procedures.DurchfallEffectAktiveTickBedingungProcedure;

public class DurchfallEffectMobEffect extends MobEffect {
	public DurchfallEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -10540032);
	}

	@Override
	public String getDescriptionId() {
		return "effect.durchfall.durchfall_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DurchfallEffectAktiveTickBedingungProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
