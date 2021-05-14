package net.mcreator.triomodmcreator.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.triomodmcreator.item.HaraldiumrüstungArmorItem;
import net.mcreator.triomodmcreator.TriomodmcreatorModElements;
import net.mcreator.triomodmcreator.TriomodmcreatorMod;

import java.util.Map;

@TriomodmcreatorModElements.ModElement.Tag
public class HaraldiumrustungArmorHelmTickEreignisProcedure extends TriomodmcreatorModElements.ModElement {
	public HaraldiumrustungArmorHelmTickEreignisProcedure(TriomodmcreatorModElements instance) {
		super(instance, 35);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TriomodmcreatorMod.LOGGER.warn("Failed to load dependency entity for procedure HaraldiumrustungArmorHelmTickEreignis!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TriomodmcreatorMod.LOGGER.warn("Failed to load dependency itemstack for procedure HaraldiumrustungArmorHelmTickEreignis!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
				: ItemStack.EMPTY).getItem() == new ItemStack(HaraldiumrüstungArmorItem.helmet, (int) (1)).getItem())
				&& ((((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
						: ItemStack.EMPTY).getItem() == new ItemStack(HaraldiumrüstungArmorItem.body, (int) (1)).getItem())
						&& ((((entity instanceof LivingEntity)
								? ((LivingEntity) entity)
										.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
								: ItemStack.EMPTY).getItem() == new ItemStack(HaraldiumrüstungArmorItem.boots, (int) (1)).getItem())
								&& (((entity instanceof LivingEntity)
										? ((LivingEntity) entity)
												.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
										: ItemStack.EMPTY).getItem() == new ItemStack(HaraldiumrüstungArmorItem.legs, (int) (1)).getItem()))))) {
			((itemstack)).addEnchantment(Enchantments.PROTECTION, (int) 10);
		}
	}
}
