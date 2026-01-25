package pet.lunya.astolfoforge.procedures;

import pet.lunya.astolfoforge.init.AstolfoforgeModEntities;
import pet.lunya.astolfoforge.entity.*;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;

import java.util.Comparator;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class DuplicateCutiesProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments) {
		for (int index0 = 0; index0 < (int) DoubleArgumentType.getDouble(arguments, "amount"); index0++) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((DoubleArgumentType.getDouble(arguments, "radius")) / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (entityiterator instanceof AstolfoArmorEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.ASTOLFO_ARMOR.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof AstolfoCasualEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.ASTOLFO_CASUAL.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof AstolfoSchoolgirlEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.ASTOLFO_SCHOOLGIRL.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof BoykisserEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.BOYKISSER.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof FelixEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.FELIX.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof HideriKanzakiEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.HIDERI_KANZAKI.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof NagisaShiotaEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.NAGISA_SHIOTA.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof RimuruEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.RIMURU.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof VentiEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.VENTI.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof SiegEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.SIEG.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof BridgetEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoforgeModEntities.BRIDGET.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				}
			}
		}
	}
}