
package com.plr.communism_lifeandart.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.plr.communism_lifeandart.CommunismLifeandartModElements;

@CommunismLifeandartModElements.ModElement.Tag
public class AshplantItem extends CommunismLifeandartModElements.ModElement {
	@ObjectHolder("communism_lifeandart:ashplant")
	public static final Item block = null;
	public AshplantItem(CommunismLifeandartModElements instance) {
		super(instance, 113);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.2f, new Item.Properties().group(null)) {
		}.setRegistryName("ashplant"));
	}
}
