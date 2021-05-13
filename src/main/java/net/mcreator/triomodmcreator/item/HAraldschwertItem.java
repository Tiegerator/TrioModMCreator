
package net.mcreator.triomodmcreator.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.triomodmcreator.TriomodmcreatorModElements;

@TriomodmcreatorModElements.ModElement.Tag
public class HAraldschwertItem extends TriomodmcreatorModElements.ModElement {
	@ObjectHolder("triomodmcreator:h_araldschwert")
	public static final Item block = null;
	public HAraldschwertItem(TriomodmcreatorModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("h_araldschwert"));
	}
}
