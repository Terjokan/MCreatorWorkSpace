
package net.mcreator.durchfall.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DurchfallEffectMobEffect extends MobEffect {
	public DurchfallEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -10540032);
	}

	@Override
	public String getDescriptionId() {
		return "effect.durchfall.durchfall_effect";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
