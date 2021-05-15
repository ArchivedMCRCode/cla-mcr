
package com.plr.communism_lifeandart.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.plr.communism_lifeandart.item.CCCPItem;
import com.plr.communism_lifeandart.CommunismLifeandartModElements;

@CommunismLifeandartModElements.ModElement.Tag
public class CommunismLifeAndArtItemGroup extends CommunismLifeandartModElements.ModElement {
	public CommunismLifeAndArtItemGroup(CommunismLifeandartModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcommunism_life_and_art") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CCCPItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
