
package net.mcreator.triomodmcreator.item;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroSwordItem extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:retro_sword")
	public static final Item block = null;

	public RetroSwordItem(TriomodmcreatorModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RetroGemItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)) {

		}.setRegistryName("retro_sword"));
	}

}
