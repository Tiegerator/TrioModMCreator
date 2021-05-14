
package net.mcreator.triomodmcreator.block;

import net.minecraft.block.material.Material;

@TriomodmcreatorModElements.ModElement.Tag
public class RetroGemBlockBlock extends TriomodmcreatorModElements.ModElement {

	@ObjectHolder("triomodmcreator:retro_gem_block")
	public static final Block block = null;

	public RetroGemBlockBlock(TriomodmcreatorModElements instance) {
		super(instance, 19);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(SuperDuperCreativeTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1f, 30f).setLightLevel(s -> 0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());

			setRegistryName("retro_gem_block");
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
