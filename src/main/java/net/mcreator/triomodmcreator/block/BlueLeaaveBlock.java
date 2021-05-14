
package net.mcreator.triomodmcreator.block;

import net.minecraft.block.material.Material;

@TriomodmcreatorModElements.ModElement.Tag
public class BlueLeaaveBlock extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:blue_leaave")
	public static final Block block = null;

	public BlueLeaaveBlock(TriomodmcreatorModElements instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends LeavesBlock {

		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.VINE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).notSolid());

			setRegistryName("blue_leaave");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 10;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Blocks.AIR, (int) (1)));
		}

	}

}
