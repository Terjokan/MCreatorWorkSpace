
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.durchfall.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.durchfall.item.DurchfallItem;
import net.mcreator.durchfall.DurchfallMod;

public class DurchfallModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DurchfallMod.MODID);
	public static final RegistryObject<Item> DURCHFALL = REGISTRY.register("durchfall", () -> new DurchfallItem());
}
