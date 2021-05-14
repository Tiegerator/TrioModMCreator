package net.mcreator.triomodmcreator.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.triomodmcreator.entity.SanganEntity;
import net.mcreator.triomodmcreator.TriomodmcreatorModElements;
import net.mcreator.triomodmcreator.TriomodmcreatorMod;

import java.util.Map;

@TriomodmcreatorModElements.ModElement.Tag
public class SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurdeProcedure extends TriomodmcreatorModElements.ModElement {
	public SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurdeProcedure(TriomodmcreatorModElements instance) {
		super(instance, 70);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency entity for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency itemstack for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency x for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency y for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency z for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TriomodmcreatorMod.LOGGER
						.warn("Failed to load dependency world for procedure SanganCardWennMitDerRechtenMaustasteAufEinenBlockGeklicktWurde!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		ItemStack emeralds = ItemStack.EMPTY;
		ItemStack tool = ItemStack.EMPTY;
		boolean found = false;
		double generator_distance = 0;
		double fireHeight = 0;
		double enchant_levels = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new SanganEntity.CustomEntity(SanganEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			((itemstack)).shrink((int) 1);
		} else if ((new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new SanganEntity.CustomEntity(SanganEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
