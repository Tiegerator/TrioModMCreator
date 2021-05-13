
package net.mcreator.triomodmcreator.item;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroGleveItem extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:retro_gleve")
	public static final Item block = null;

	public RetroGleveItem(TriomodmcreatorModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 6789;
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
				return Ingredient.fromStacks(new ItemStack(RetroGemItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)) {

		}.setRegistryName("retro_gleve"));
	}

}
