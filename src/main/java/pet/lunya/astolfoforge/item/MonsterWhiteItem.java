package pet.lunya.astolfoforge.item;

import pet.lunya.astolfoforge.procedures.MonsterWhitePlayerFinishesUsingItemProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class MonsterWhiteItem extends Item {
	public MonsterWhiteItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0f).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		MonsterWhitePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}