package net.mcreator.triomodmcreator.procedures;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroRapierLivingEntityIsHitWithToolProcedure extends TriomodmcreatorModElements.ModElement {

	public RetroRapierLivingEntityIsHitWithToolProcedure(TriomodmcreatorModElements instance) {
		super(instance, 68);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TriomodmcreatorMod.LOGGER.warn("Failed to load dependency entity for procedure RetroRapierLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TriomodmcreatorMod.LOGGER.warn("Failed to load dependency itemstack for procedure RetroRapierLivingEntityIsHitWithTool!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");

		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getTotalArmorValue() : 0) == 0)) {
			((itemstack)).setDamage((int) 8);
		} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getTotalArmorValue() : 0) > 0)) {
			((itemstack)).setDamage((int) 5);
		}

	}

}
