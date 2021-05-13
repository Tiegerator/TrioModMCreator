
package net.mcreator.triomodmcreator.item;

@TriomodmcreatorModElements.ModElement.Tag
public class HAraldschwertItem extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:h_araldschwert")
	public static final Item block = null;

	public HAraldschwertItem(TriomodmcreatorModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 750;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HaraldiumbarrenItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab).isImmuneToFire()) {

		}.setRegistryName("h_araldschwert"));
	}

}
