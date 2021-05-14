
package net.mcreator.triomodmcreator.item;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroPickaxeItem extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:retro_pickaxe")
	public static final Item block = null;

	public RetroPickaxeItem(TriomodmcreatorModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)) {

		}.setRegistryName("retro_pickaxe"));
	}

}
