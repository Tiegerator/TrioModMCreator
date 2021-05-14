
package net.mcreator.triomodmcreator.block;

import net.minecraft.block.material.Material;

@TriomodmcreatorModElements.ModElement.Tag
public class BlueGrassBlock extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:blue_grass")
	public static final Block block = null;

	public BlueGrassBlock(TriomodmcreatorModElements instance) {
		super(instance, 11);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0).harvestLevel(0)
					.harvestTool(ToolType.SHOVEL).setRequiresTool());

			setRegistryName("blue_grass");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(BlueDirtBlock.block, (int) (1)));
		}

	}

}
