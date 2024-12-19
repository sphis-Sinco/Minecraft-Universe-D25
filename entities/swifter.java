// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class swifter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "swifter"), "main");
	private final ModelPart rightleg;
	private final ModelPart rightlegOuter;
	private final ModelPart leftLegOuter;
	private final ModelPart body;
	private final ModelPart bodyOuter;
	private final ModelPart leftLeg;
	private final ModelPart rightArm;
	private final ModelPart rightArmOuter;
	private final ModelPart leftArmOuter;
	private final ModelPart leftArm;
	private final ModelPart head;
	private final ModelPart headOuter;
	private final ModelPart backpack;

	public swifter(ModelPart root) {
		this.rightleg = root.getChild("rightleg");
		this.rightlegOuter = root.getChild("rightlegOuter");
		this.leftLegOuter = root.getChild("leftLegOuter");
		this.body = root.getChild("body");
		this.bodyOuter = root.getChild("bodyOuter");
		this.leftLeg = root.getChild("leftLeg");
		this.rightArm = root.getChild("rightArm");
		this.rightArmOuter = root.getChild("rightArmOuter");
		this.leftArmOuter = root.getChild("leftArmOuter");
		this.leftArm = root.getChild("leftArm");
		this.head = root.getChild("head");
		this.headOuter = root.getChild("headOuter");
		this.backpack = root.getChild("backpack");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightlegOuter = partdefinition.addOrReplaceChild("rightlegOuter", CubeListBuilder.create().texOffs(8, 0).addBox(-3.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftLegOuter = partdefinition.addOrReplaceChild("leftLegOuter", CubeListBuilder.create().texOffs(8, 0).addBox(1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 10).addBox(-5.0F, -20.0F, -2.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bodyOuter = partdefinition.addOrReplaceChild("bodyOuter", CubeListBuilder.create().texOffs(28, 11).addBox(-5.0F, -20.0F, -2.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(0, 26).addBox(-8.0F, -20.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightArmOuter = partdefinition.addOrReplaceChild("rightArmOuter", CubeListBuilder.create().texOffs(14, 26).addBox(-8.0F, -20.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftArmOuter = partdefinition.addOrReplaceChild("leftArmOuter", CubeListBuilder.create().texOffs(14, 26).addBox(5.0F, -20.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(0, 26).addBox(5.0F, -20.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 38).addBox(-5.0F, -30.0F, -4.0F, 10.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hat = head.addOrReplaceChild("Hat", CubeListBuilder.create().texOffs(72, 0).addBox(-7.0F, -31.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(96, 15).addBox(-4.0F, -37.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition headOuter = partdefinition.addOrReplaceChild("headOuter", CubeListBuilder.create().texOffs(36, 38).addBox(-5.0F, -30.0F, -4.0F, 10.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition backpack = partdefinition.addOrReplaceChild("backpack", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, -19.0F, 2.0F, 8.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightlegOuter.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLegOuter.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bodyOuter.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArmOuter.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArmOuter.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headOuter.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backpack.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}