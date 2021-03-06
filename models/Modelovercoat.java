// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelovercoat extends EntityModel<Entity> {
	private final ModelRenderer coat;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public Modelovercoat() {
		textureWidth = 64;
		textureHeight = 64;

		coat = new ModelRenderer(this);
		coat.setRotationPoint(0.0F, 24.0F, 0.0F);
		coat.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 17.0F, 4.0F, 0.0F, false);
		coat.setTextureOffset(5, 42).addBox(-4.0F, 9.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		RightArm.setTextureOffset(16, 19).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		LeftArm.setTextureOffset(0, 19).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		coat.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}