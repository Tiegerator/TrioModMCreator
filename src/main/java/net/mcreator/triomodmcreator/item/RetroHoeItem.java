
package net.mcreator.triomodmcreator.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.triomodmcreator.itemgroup.SuperDuperCreativeTabItemGroup;
import net.mcreator.triomodmcreator.TriomodmcreatorModElements;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroHoeItem extends TriomodmcreatorModElements.ModElement {
	@ObjectHolder("triomodmcreator:retro_hoe")
	public static final Item block = null;
	public RetroHoeItem(TriomodmcreatorModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 5600;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RetroGemItem.block, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)) {
		}.setRegistryName("retro_hoe"));
	}
}
