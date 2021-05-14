package net.mcreator.triomodmcreator.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.triomodmcreator.TriomodmcreatorModElements;
import net.mcreator.triomodmcreator.TriomodmcreatorMod;

import java.util.Map;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroRapierLivingEntityIsHitWithToolProcedure extends TriomodmcreatorModElements.ModElement {
	public RetroRapierLivingEntityIsHitWithToolProcedure(TriomodmcreatorModElements instance) {
		super(instance, 81);
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
