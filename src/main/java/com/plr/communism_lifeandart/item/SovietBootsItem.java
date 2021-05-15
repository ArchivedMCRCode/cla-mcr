
package com.plr.communism_lifeandart.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import com.plr.communism_lifeandart.itemgroup.CommunismLifeAndArtItemGroup;
import com.plr.communism_lifeandart.CommunismLifeandartModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@CommunismLifeandartModElements.ModElement.Tag
public class SovietBootsItem extends CommunismLifeandartModElements.ModElement {
	@ObjectHolder("communism_lifeandart:soviet_boots_helmet")
	public static final Item helmet = null;
	@ObjectHolder("communism_lifeandart:soviet_boots_chestplate")
	public static final Item body = null;
	@ObjectHolder("communism_lifeandart:soviet_boots_leggings")
	public static final Item legs = null;
	@ObjectHolder("communism_lifeandart:soviet_boots_boots")
	public static final Item boots = null;
	public SovietBootsItem(CommunismLifeandartModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{3, 0, 0, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "soviet_boots";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(CommunismLifeAndArtItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new Modelsovietboots().left;
				armorModel.bipedRightLeg = new Modelsovietboots().right;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "communism_lifeandart:textures/sovietboots.png";
			}
		}.setRegistryName("soviet_boots_boots"));
	}
	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelsovietboots extends EntityModel<Entity> {
		private final ModelRenderer right;
		private final ModelRenderer left;
		public Modelsovietboots() {
			textureWidth = 64;
			textureHeight = 64;
			right = new ModelRenderer(this);
			right.setRotationPoint(0.0F, 24.0F, 0.0F);
			right.setTextureOffset(0, 0).addBox(-2.0F, 5.0F, -3.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);
			right.setTextureOffset(0, 10).addBox(-2.0F, 10.0F, -5.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);
			left = new ModelRenderer(this);
			left.setRotationPoint(0.0F, 24.0F, 0.0F);
			left.setTextureOffset(0, 20).addBox(-2.0F, 5.0F, -3.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);
			left.setTextureOffset(0, 31).addBox(-2.0F, 10.0F, -5.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			right.render(matrixStack, buffer, packedLight, packedOverlay);
			left.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
