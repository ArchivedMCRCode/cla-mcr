package com.plr.communism_lifeandart.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.communism_lifeandart.CommunismLifeandartModElements;
import com.plr.communism_lifeandart.CommunismLifeandartMod;

@CommunismLifeandartModElements.ModElement.Tag
public class CondensedMilkPackWhenDrunkProcedure extends CommunismLifeandartModElements.ModElement {
	public CondensedMilkPackWhenDrunkProcedure(CommunismLifeandartModElements instance) {
		super(instance, 88);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CommunismLifeandartMod.LOGGER.warn("Failed to load dependency entity for procedure CondensedMilkPackWhenDrunk!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 300, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LUCK, (int) 300, (int) 1));
	}
}
