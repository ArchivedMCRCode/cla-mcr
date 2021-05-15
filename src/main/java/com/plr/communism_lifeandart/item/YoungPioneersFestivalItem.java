
package com.plr.communism_lifeandart.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import com.plr.communism_lifeandart.itemgroup.CommunismLifeAndArtItemGroup;
import com.plr.communism_lifeandart.CommunismLifeandartModElements;

@CommunismLifeandartModElements.ModElement.Tag
public class YoungPioneersFestivalItem extends CommunismLifeandartModElements.ModElement {
	@ObjectHolder("communism_lifeandart:young_pioneers_festival")
	public static final Item block = null;
	public YoungPioneersFestivalItem(CommunismLifeandartModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, CommunismLifeandartModElements.sounds.get(new ResourceLocation("communism_lifeandart:young_pioneers_day")),
					new Item.Properties().group(CommunismLifeAndArtItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("young_pioneers_festival");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
