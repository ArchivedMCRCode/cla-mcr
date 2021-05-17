/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package com.plr.communism_lifeandart;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class CommunismLifeandartModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public CommunismLifeandartModElements() {
		sounds.put(new ResourceLocation("communism_lifeandart", "internationale_cn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "internationale_cn")));
		sounds.put(new ResourceLocation("communism_lifeandart", "troika_galop"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "troika_galop")));
		sounds.put(new ResourceLocation("communism_lifeandart", "an_evening_outside_moscow"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "an_evening_outside_moscow")));
		sounds.put(new ResourceLocation("communism_lifeandart", "internationale_ru"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "internationale_ru")));
		sounds.put(new ResourceLocation("communism_lifeandart", "cccp_anthem"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "cccp_anthem")));
		sounds.put(new ResourceLocation("communism_lifeandart", "katyusha"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "katyusha")));
		sounds.put(new ResourceLocation("communism_lifeandart", "we_are_your_firm_successor_the_cyl"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "we_are_your_firm_successor_the_cyl")));
		sounds.put(new ResourceLocation("communism_lifeandart", "we_are_tomorrows_soviet_people"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "we_are_tomorrows_soviet_people")));
		sounds.put(new ResourceLocation("communism_lifeandart", "ppsh41shot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "ppsh41shot")));
		sounds.put(new ResourceLocation("communism_lifeandart", "mosin_nagant_shot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "mosin_nagant_shot")));
		sounds.put(new ResourceLocation("communism_lifeandart", "charginghorn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "charginghorn")));
		sounds.put(new ResourceLocation("communism_lifeandart", "ak47shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "ak47shoot")));
		sounds.put(new ResourceLocation("communism_lifeandart", "no_communist_party_no_new_china"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "no_communist_party_no_new_china")));
		sounds.put(new ResourceLocation("communism_lifeandart", "young_pioneers_day"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "young_pioneers_day")));
		sounds.put(new ResourceLocation("communism_lifeandart", "happywind"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "happywind")));
		sounds.put(new ResourceLocation("communism_lifeandart", "varchavianka"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "varchavianka")));
		sounds.put(new ResourceLocation("communism_lifeandart", "our_triumphant_satellite"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "our_triumphant_satellite")));
		sounds.put(new ResourceLocation("communism_lifeandart", "engine_combine"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("communism_lifeandart", "engine_combine")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("communism_lifeandart").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == CommunismLifeandartModElements.ModElement.class)
						elements.add((CommunismLifeandartModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(CommunismLifeandartModElements.ModElement::initElements);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
	private int messageID = 0;
	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		CommunismLifeandartMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final CommunismLifeandartModElements elements;
		protected final int sortid;
		public ModElement(CommunismLifeandartModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
