
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.durchfall.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.durchfall.potion.DurchfallEffectMobEffect;
import net.mcreator.durchfall.DurchfallMod;

public class DurchfallModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DurchfallMod.MODID);
	public static final RegistryObject<MobEffect> DURCHFALL_EFFECT = REGISTRY.register("durchfall_effect", () -> new DurchfallEffectMobEffect());
}
