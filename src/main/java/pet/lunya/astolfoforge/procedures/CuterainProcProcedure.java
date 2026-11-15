package pet.lunya.astolfoforge.procedures;

import pet.lunya.astolfoforge.init.AstolfoforgeModEntities;
import pet.lunya.astolfoforge.AstolfoforgeMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class CuterainProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments) {
		double i = 0;
		double offX = 0;
		double offZ = 0;
		double randomEnt = 0;
		for (int _i1 = 0; _i1 < (int) DoubleArgumentType.getDouble(arguments, "iterations"); _i1++) {
			i = i + 1;
			randomEnt = Mth.nextInt(RandomSource.create(), 1, 14);
			if (randomEnt == 0) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.ASTOLFO_CASUAL.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 1) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.ASTOLFO_SCHOOLGIRL.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 2) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.ASTOLFO_ARMOR.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 3) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.FELIX.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 4) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.BOYKISSER.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 5) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.HIDERI_KANZAKI.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 6) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.VENTI.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 7) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.RIMURU.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 8) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.NAGISA_SHIOTA.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 9) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.SIEG.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 10) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.BRIDGET.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 11) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.MAHIRO.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 12) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.ONIMAI.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 13) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.YUURI.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			} else if (randomEnt == 14) {
				AstolfoforgeMod.queueServerWork((int) i, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AstolfoforgeModEntities.YURI.get().spawn(_level,
								BlockPos.containing(x + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range")),
										y + DoubleArgumentType.getDouble(arguments, "height"),
										z + Mth.nextInt(RandomSource.create(), (int) (0 - DoubleArgumentType.getDouble(arguments, "range")), (int) DoubleArgumentType.getDouble(arguments, "range"))),
								EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			}
		}
	}
}