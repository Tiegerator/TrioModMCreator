
package net.mcreator.triomodmcreator.block;

import net.minecraft.block.material.Material;

@TriomodmcreatorModElements.ModElement.Tag
public class BaumABlock extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:baum_a")
	public static final Block block = null;

	public BaumABlock(TriomodmcreatorModElements instance) {
		super(instance, 9);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0));

			setRegistryName("baum_a");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
