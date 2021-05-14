package net.mcreator.triomodmcreator.procedures;

@TriomodmcreatorModElements.ModElement.Tag
public class SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurdeProcedure extends TriomodmcreatorModElements.ModElement {

	public SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurdeProcedure(TriomodmcreatorModElements instance) {
		super(instance, 67);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency itemstack for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency x for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency y for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency z for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency world for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}

		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new SanganEntity.CustomEntity(SanganEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);

			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

			world.addEntity(entityToSpawn);
		}
		((itemstack)).shrink((int) 1);

	}

}
