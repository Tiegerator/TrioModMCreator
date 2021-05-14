// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelsangan extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;

	public Modelsangan() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, -2.0F);
		body.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(1.5F, 23.0F, -2.8333F);
		leg1.setTextureOffset(12, 26).addBox(-1.5F, -3.0F, -0.1667F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		leg1.setTextureOffset(6, 0).addBox(0.5F, 0.0F, -1.1667F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leg1.setTextureOffset(0, 2).addBox(-1.5F, 0.0F, -1.1667F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.5F, 23.0F, -2.8333F);
		leg2.setTextureOffset(0, 26).addBox(-1.5F, -3.0F, -0.1667F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		leg2.setTextureOffset(0, 6).addBox(0.5F, 0.0F, -1.1667F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leg2.setTextureOffset(0, 0).addBox(-1.5F, 0.0F, -1.1667F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(8.25F, 16.5F, -3.75F);
		right_arm.setTextureOffset(16, 20).addBox(-3.25F, -1.5F, 1.75F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(30, 0).addBox(-1.25F, -1.5F, -1.25F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(3, 5).addBox(-0.25F, 0.5F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 4).addBox(-0.25F, -1.5F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-8.25F, 16.5F, -3.75F);
		left_arm.setTextureOffset(0, 20).addBox(-1.75F, -1.5F, 1.75F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(24, 26).addBox(-1.75F, -1.5F, -1.25F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(3, 3).addBox(-0.75F, -1.5F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(3, 1).addBox(-0.75F, 0.5F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}