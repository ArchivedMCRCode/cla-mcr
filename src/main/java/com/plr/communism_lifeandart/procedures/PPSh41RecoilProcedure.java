package com.plr.communism_lifeandart.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.communism_lifeandart.CommunismLifeandartModElements;
import com.plr.communism_lifeandart.CommunismLifeandartMod;

@CommunismLifeandartModElements.ModElement.Tag
public class PPSh41RecoilProcedure extends CommunismLifeandartModElements.ModElement {
	public PPSh41RecoilProcedure(CommunismLifeandartModElements instance) {
		super(instance, 125);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CommunismLifeandartMod.LOGGER.warn("Failed to load dependency entity for procedure PPSh41Recoil!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.rotationPitch = (float) (((entity.rotationPitch) - 1));
	}
}
