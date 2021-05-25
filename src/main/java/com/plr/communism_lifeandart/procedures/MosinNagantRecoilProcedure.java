package com.plr.communism_lifeandart.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.communism_lifeandart.CommunismLifeandartModElements;
import com.plr.communism_lifeandart.CommunismLifeandartMod;

@CommunismLifeandartModElements.ModElement.Tag
public class MosinNagantRecoilProcedure extends CommunismLifeandartModElements.ModElement {
	public MosinNagantRecoilProcedure(CommunismLifeandartModElements instance) {
		super(instance, 124);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CommunismLifeandartMod.LOGGER.warn("Failed to load dependency entity for procedure MosinNagantRecoil!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.rotationPitch = (float) (((entity.rotationPitch) - 2));
	}
}
