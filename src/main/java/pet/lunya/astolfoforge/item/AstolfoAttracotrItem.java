package pet.lunya.astolfoforge.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AstolfoAttracotrItem extends Item {
	public AstolfoAttracotrItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}