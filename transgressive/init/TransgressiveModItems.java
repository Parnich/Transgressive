/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.parnich.transgressive.init;

import net.parnich.transgressive.TransgressiveMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

public class TransgressiveModItems {
	public static Item TRANSGRESSIVE_ENERGY;

	public static void load() {
		TRANSGRESSIVE_ENERGY = register("transgressive_energy", new TransgressiveEnergyItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TransgressiveMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}