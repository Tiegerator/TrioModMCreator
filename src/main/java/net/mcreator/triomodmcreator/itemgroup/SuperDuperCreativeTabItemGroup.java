
package net.mcreator.triomodmcreator.itemgroup;

@TriomodmcreatorModElements.ModElement.Tag
public class SuperDuperCreativeTabItemGroup extends TriomodmcreatorModElements.ModElement {

	public SuperDuperCreativeTabItemGroup(TriomodmcreatorModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsuper_duper_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DreckABlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;

}
