
package net.mcreator.triomodmcreator.item;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroHammerItem extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:retro_hammer")
	public static final Item block = null;

	public RetroHammerItem(TriomodmcreatorModElements instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5600;
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
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RetroGemItem.block, (int) (1)));
			}
		}, 3, -3.4f, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)) {

		}.setRegistryName("retro_hammer"));
	}

}
