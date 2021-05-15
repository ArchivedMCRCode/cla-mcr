package com.plr.communism_lifeandart.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.communism_lifeandart.CommunismLifeandartModElements;
import com.plr.communism_lifeandart.CommunismLifeandartMod;

@CommunismLifeandartModElements.ModElement.Tag
public class KvassWhenDrunkProcedure extends CommunismLifeandartModElements.ModElement {
	public KvassWhenDrunkProcedure(CommunismLifeandartModElements instance) {
		super(instance, 51);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CommunismLifeandartMod.LOGGER.warn("Failed to load dependency entity for procedure KvassWhenDrunk!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 60, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 240, (int) 1));
	}
}
