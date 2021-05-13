
package net.mcreator.triomodmcreator.item;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroGemItem extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:retro_gem")
	public static final Item block = null;

	public RetroGemItem(TriomodmcreatorModElements instance) {
		super(instance, 10);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("retro_gem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
