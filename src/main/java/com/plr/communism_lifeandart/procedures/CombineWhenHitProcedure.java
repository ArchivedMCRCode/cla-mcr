package com.plr.communism_lifeandart.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.communism_lifeandart.CommunismLifeandartModElements;
import com.plr.communism_lifeandart.CommunismLifeandartMod;

@CommunismLifeandartModElements.ModElement.Tag
public class CombineWhenHitProcedure extends CommunismLifeandartModElements.ModElement {
	public CombineWhenHitProcedure(CommunismLifeandartModElements instance) {
		super(instance, 123);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CommunismLifeandartMod.LOGGER.warn("Failed to load dependency entity for procedure CombineWhenHit!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				CommunismLifeandartMod.LOGGER.warn("Failed to load dependency sourceentity for procedure CombineWhenHit!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((entity.isBeingRidden())
				&& ((((entity.getMotion().getX()) > 0) || ((entity.getMotion().getZ()) > 0)) && (!(sourceentity.isPassenger()))))) {
			sourceentity.attackEntityFrom(DamageSource.GENERIC, (float) 8);
		}
	}
}
