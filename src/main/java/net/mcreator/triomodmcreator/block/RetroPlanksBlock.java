
package net.mcreator.triomodmcreator.block;

import net.minecraft.block.material.Material;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroPlanksBlock extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:retro_planks")
	public static final Block block = null;

	public RetroPlanksBlock(TriomodmcreatorModElements instance) {
		super(instance, 6);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).harvestLevel(0)
					.harvestTool(ToolType.AXE).setRequiresTool());

			setRegistryName("retro_planks");
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
