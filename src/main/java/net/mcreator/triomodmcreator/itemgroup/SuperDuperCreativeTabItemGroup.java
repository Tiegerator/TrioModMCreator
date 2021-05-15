
package net.mcreator.triomodmcreator.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.triomodmcreator.block.DreckABlock;
import net.mcreator.triomodmcreator.TriomodmcreatorModElements;

@TriomodmcreatorModElements.ModElement.Tag
public class SuperDuperCreativeTabItemGroup extends TriomodmcreatorModElements.ModElement {
	public SuperDuperCreativeTabItemGroup(TriomodmcreatorModElements instance) {
		super(instance, 50);
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
