
package net.mcreator.triomodmcreator.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.triomodmcreator.itemgroup.SuperDuperCreativeTabItemGroup;
import net.mcreator.triomodmcreator.TriomodmcreatorModElements;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroKatanaItem extends TriomodmcreatorModElements.ModElement {
	@ObjectHolder("triomodmcreator:retro_katana")
	public static final Item block = null;
	public RetroKatanaItem(TriomodmcreatorModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 6000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RetroGemItem.block, (int) (1)));
			}
		}, 3, -1.9f, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)) {
		}.setRegistryName("retro_katana"));
	}
}
