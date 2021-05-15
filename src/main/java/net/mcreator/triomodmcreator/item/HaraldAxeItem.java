
package net.mcreator.triomodmcreator.item;

@TriomodmcreatorModElements.ModElement.Tag
public class HaraldAxeItem extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:harald_axe")
	public static final Item block = null;

	public HaraldAxeItem(TriomodmcreatorModElements instance) {
		super(instance, 68);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HaraldiumbarrenItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {

		}.setRegistryName("harald_axe"));
	}

}
