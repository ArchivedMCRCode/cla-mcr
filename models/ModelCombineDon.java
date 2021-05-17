// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelCombineDon extends EntityModel<Entity> {
	private final ModelRenderer harvester;
	private final ModelRenderer connection_r1;
	private final ModelRenderer harvester5_r1;
	private final ModelRenderer harvester4_r1;
	private final ModelRenderer harvester3_r1;
	private final ModelRenderer harvester2_r1;
	private final ModelRenderer harvester1_r1;
	private final ModelRenderer bearing2_r1;
	private final ModelRenderer bearing4_r1;
	private final ModelRenderer mainbody;

	public ModelCombineDon() {
		textureWidth = 256;
		textureHeight = 256;

		harvester = new ModelRenderer(this);
		harvester.setRotationPoint(0.0F, 24.0F, 0.0F);
		harvester.setTextureOffset(76, 43).addBox(-23.0F, -8.0F, -23.0F, 46.0F, 4.0F, 6.0F, 0.0F, false);
		harvester.setTextureOffset(25, 24).addBox(-22.0F, -10.0F, -19.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		harvester.setTextureOffset(24, 8).addBox(20.0F, -10.0F, -19.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		harvester.setTextureOffset(93, 16).addBox(-22.0F, -8.0F, -27.0F, 44.0F, 1.0F, 1.0F, 0.0F, false);
		harvester.setTextureOffset(17, 24).addBox(-23.0F, -9.0F, -28.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		harvester.setTextureOffset(9, 24).addBox(22.0F, -9.0F, -28.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		connection_r1 = new ModelRenderer(this);
		connection_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		harvester.addChild(connection_r1);
		setRotationAngle(connection_r1, 0.0436F, 0.0F, 0.0F);
		connection_r1.setTextureOffset(124, 18).addBox(-7.0F, -8.0F, -17.0F, 14.0F, 3.0F, 9.0F, 0.0F, false);

		harvester5_r1 = new ModelRenderer(this);
		harvester5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		harvester.addChild(harvester5_r1);
		setRotationAngle(harvester5_r1, 0.8727F, 0.0F, 0.0F);
		harvester5_r1.setTextureOffset(76, 79).addBox(-22.0F, -25.5F, -15.0F, 44.0F, 1.0F, 3.0F, 0.0F, false);

		harvester4_r1 = new ModelRenderer(this);
		harvester4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		harvester.addChild(harvester4_r1);
		setRotationAngle(harvester4_r1, 2.1991F, 0.0F, 0.0F);
		harvester4_r1.setTextureOffset(93, 0).addBox(-22.0F, -17.5F, 18.0F, 44.0F, 1.0F, 3.0F, 0.0F, false);

		harvester3_r1 = new ModelRenderer(this);
		harvester3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		harvester.addChild(harvester3_r1);
		setRotationAngle(harvester3_r1, -2.8274F, 0.0F, 0.0F);
		harvester3_r1.setTextureOffset(93, 4).addBox(-22.0F, 14.5F, 19.5F, 44.0F, 1.0F, 3.0F, 0.0F, false);

		harvester2_r1 = new ModelRenderer(this);
		harvester2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		harvester.addChild(harvester2_r1);
		setRotationAngle(harvester2_r1, -1.5708F, 0.0F, 0.0F);
		harvester2_r1.setTextureOffset(93, 8).addBox(-22.0F, 26.0F, -11.0F, 44.0F, 1.0F, 3.0F, 0.0F, false);

		harvester1_r1 = new ModelRenderer(this);
		harvester1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		harvester.addChild(harvester1_r1);
		setRotationAngle(harvester1_r1, -0.3142F, 0.0F, 0.0F);
		harvester1_r1.setTextureOffset(93, 12).addBox(-22.0F, 1.0F, -31.0F, 44.0F, 1.0F, 3.0F, 0.0F, false);

		bearing2_r1 = new ModelRenderer(this);
		bearing2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		harvester.addChild(bearing2_r1);
		setRotationAngle(bearing2_r1, -0.3054F, 0.0F, 0.0F);
		bearing2_r1.setTextureOffset(0, 0).addBox(-23.0F, -4.0F, -24.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		bearing2_r1.setTextureOffset(0, 6).addBox(22.0F, -4.0F, -24.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		bearing4_r1 = new ModelRenderer(this);
		bearing4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		harvester.addChild(bearing4_r1);
		setRotationAngle(bearing4_r1, 0.3927F, 0.0F, 0.0F);
		bearing4_r1.setTextureOffset(0, 24).addBox(-24.0F, -18.0F, -22.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		bearing4_r1.setTextureOffset(24, 0).addBox(23.0F, -18.0F, -22.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		mainbody = new ModelRenderer(this);
		mainbody.setRotationPoint(0.0F, 24.0F, 0.0F);
		mainbody.setTextureOffset(0, 43).addBox(-9.0F, -17.0F, -8.0F, 18.0F, 13.0F, 40.0F, 0.0F, false);
		mainbody.setTextureOffset(0, 43).addBox(9.0F, -12.0F, -7.0F, 6.0F, 12.0F, 12.0F, 0.0F, false);
		mainbody.setTextureOffset(0, 0).addBox(-15.0F, -12.0F, -7.0F, 6.0F, 12.0F, 12.0F, 0.0F, false);
		mainbody.setTextureOffset(61, 139).addBox(9.0F, -11.0F, 21.0F, 6.0F, 11.0F, 11.0F, 0.0F, false);
		mainbody.setTextureOffset(124, 83).addBox(-15.0F, -11.0F, 21.0F, 6.0F, 11.0F, 11.0F, 0.0F, false);
		mainbody.setTextureOffset(144, 105).addBox(9.0F, -11.0F, 7.0F, 4.0F, 7.0F, 13.0F, 0.0F, false);
		mainbody.setTextureOffset(72, 111).addBox(9.0F, -15.0F, 7.0F, 4.0F, 4.0F, 24.0F, 0.0F, false);
		mainbody.setTextureOffset(92, 83).addBox(-13.0F, -15.0F, 7.0F, 4.0F, 4.0F, 24.0F, 0.0F, false);
		mainbody.setTextureOffset(0, 144).addBox(-13.0F, -11.0F, 7.0F, 4.0F, 7.0F, 13.0F, 0.0F, false);
		mainbody.setTextureOffset(93, 18).addBox(0.0F, -27.0F, 11.0F, 8.0F, 8.0F, 15.0F, 0.0F, false);
		mainbody.setTextureOffset(111, 122).addBox(-8.0F, -35.0F, 11.0F, 8.0F, 16.0F, 17.0F, 0.0F, false);
		mainbody.setTextureOffset(0, 96).addBox(-9.0F, -49.0F, -8.0F, 18.0F, 30.0F, 18.0F, 0.0F, false);
		mainbody.setTextureOffset(76, 53).addBox(-12.0F, -16.0F, 32.0F, 24.0F, 12.0F, 14.0F, 0.0F, false);
		mainbody.setTextureOffset(0, 0).addBox(-13.0F, -19.0F, -9.0F, 26.0F, 2.0F, 41.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		harvester.render(matrixStack, buffer, packedLight, packedOverlay);
		mainbody.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}