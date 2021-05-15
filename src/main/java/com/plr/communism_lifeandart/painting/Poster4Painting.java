
package com.plr.communism_lifeandart.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import com.plr.communism_lifeandart.CommunismLifeandartModElements;

@CommunismLifeandartModElements.ModElement.Tag
public class Poster4Painting extends CommunismLifeandartModElements.ModElement {
	public Poster4Painting(CommunismLifeandartModElements instance) {
		super(instance, 74);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(64, 96).setRegistryName("poster_4"));
	}
}
