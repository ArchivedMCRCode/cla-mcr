// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modeltophat extends EntityModel<Entity> {
	private final ModelRenderer hat;

	public Modeltophat() {
		textureWidth = 64;
		textureHeight = 64;

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 24.0F, 0.0F);
		hat.setTextureOffset(0, 0).addBox(-6.0F, -9.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		hat.setTextureOffset(0, 13).addBox(-4.0F, -17.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		hat.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}