package net.mcreator.triomodmcreator.procedures;

@TriomodmcreatorModElements.ModElement.Tag
public class ReigekiRightClickedInAirProcedure extends TriomodmcreatorModElements.ModElement {

	public ReigekiRightClickedInAirProcedure(TriomodmcreatorModElements instance) {
		super(instance, 91);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TriomodmcreatorMod.LOGGER.warn("Failed to load dependency itemstack for procedure ReigekiRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TriomodmcreatorMod.LOGGER.warn("Failed to load dependency x for procedure ReigekiRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TriomodmcreatorMod.LOGGER.warn("Failed to load dependency y for procedure ReigekiRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TriomodmcreatorMod.LOGGER.warn("Failed to load dependency z for procedure ReigekiRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TriomodmcreatorMod.LOGGER.warn("Failed to load dependency world for procedure ReigekiRightClickedInAir!");
			return;
		}

		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (x + 8), (int) y, (int) z)));
			_ent.setEffectOnly(false);
			((World) world).addEntity(_ent);
		}
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (x - 8), (int) y, (int) z)));
			_ent.setEffectOnly(false);
			((World) world).addEntity(_ent);
		}
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) (z + 8))));
			_ent.setEffectOnly(false);
			((World) world).addEntity(_ent);
		}
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) (z - 8))));
			_ent.setEffectOnly(false);
			((World) world).addEntity(_ent);
		}
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (x + 8), (int) y, (int) (z + 8))));
			_ent.setEffectOnly(false);
			((World) world).addEntity(_ent);
		}
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (x + 8), (int) y, (int) (z - 8))));
			_ent.setEffectOnly(false);
			((World) world).addEntity(_ent);
		}
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (x - 8), (int) y, (int) (z + 8))));
			_ent.setEffectOnly(false);
			((World) world).addEntity(_ent);
		}
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (x - 8), (int) y, (int) (z - 8))));
			_ent.setEffectOnly(false);
			((World) world).addEntity(_ent);
		}
		((itemstack)).shrink((int) 1);

	}

}
