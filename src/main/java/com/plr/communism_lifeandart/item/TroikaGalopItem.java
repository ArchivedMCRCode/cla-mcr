
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
public class TroikaGalopItem extends CommunismLifeandartModElements.ModElement {
	@ObjectHolder("communism_lifeandart:troika_galop")
	public static final Item block = null;
	public TroikaGalopItem(CommunismLifeandartModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, CommunismLifeandartModElements.sounds.get(new ResourceLocation("communism_lifeandart:troika_galop")),
					new Item.Properties().group(CommunismLifeAndArtItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("troika_galop");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
