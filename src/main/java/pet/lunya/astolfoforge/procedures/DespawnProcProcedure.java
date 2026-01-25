package pet.lunya.astolfoforge.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class DespawnProcProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		double firstRun = 0;
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "selector")) {
				if (!entityiterator.level().isClientSide())
					entityiterator.discard();
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}