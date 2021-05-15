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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		right.render(matrixStack, buffer, packedLight, packedOverlay);
		left.render(matrixStack, buffer, packedLight, packedOverlay);
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