package com.plr.communism_lifeandart.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.plr.communism_lifeandart.item.WrenchItem;
import com.plr.communism_lifeandart.item.CombineDonGeneratorItem;
import com.plr.communism_lifeandart.CommunismLifeandartModElements;
import com.plr.communism_lifeandart.CommunismLifeandartMod;

@CommunismLifeandartModElements.ModElement.Tag
public class CombineWhenclickedProcedure extends CommunismLifeandartModElements.ModElement {
	public CombineWhenclickedProcedure(CommunismLifeandartModElements instance) {
		super(instance, 120);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CommunismLifeandartMod.LOGGER.warn("Failed to load dependency entity for procedure CombineWhenclicked!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				CommunismLifeandartMod.LOGGER.warn("Failed to load dependency sourceentity for procedure CombineWhenclicked!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				CommunismLifeandartMod.LOGGER.warn("Failed to load dependency itemstack for procedure CombineWhenclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((sourceentity.isSneaking())) {
			if (((itemstack).getItem() == new ItemStack(WrenchItem.block, (int) (1)).getItem())) {
				if (!entity.world.isRemote())
					entity.remove();
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(CombineDonGeneratorItem.block, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
				}
			}
		}
	}
}
