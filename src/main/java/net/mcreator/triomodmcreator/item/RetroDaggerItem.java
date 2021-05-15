
package net.mcreator.triomodmcreator.item;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroDaggerItem extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:retro_dagger")
	public static final Item block = null;

	public RetroDaggerItem(TriomodmcreatorModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3124;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
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
		}, 3, -2f, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)) {

		}.setRegistryName("retro_dagger"));
	}

}
