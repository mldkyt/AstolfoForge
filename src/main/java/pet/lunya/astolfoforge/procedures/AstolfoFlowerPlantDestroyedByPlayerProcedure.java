package pet.lunya.astolfoforge.procedures;

import pet.lunya.astolfoforge.init.AstolfoforgeModEntities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class AstolfoFlowerPlantDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 16); index0++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = AstolfoforgeModEntities.ASTOLFO_ARMOR.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 16); index1++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = AstolfoforgeModEntities.ASTOLFO_CASUAL.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 16); index2++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = AstolfoforgeModEntities.ASTOLFO_SCHOOLGIRL.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}