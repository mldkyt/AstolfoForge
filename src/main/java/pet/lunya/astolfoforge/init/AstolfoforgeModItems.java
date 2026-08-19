/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pet.lunya.astolfoforge.init;

import pet.lunya.astolfoforge.item.MonsterWhiteItem;
import pet.lunya.astolfoforge.item.AstolfoItemItem;
import pet.lunya.astolfoforge.item.AstolfoAttracotrItem;
import pet.lunya.astolfoforge.AstolfoforgeMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

public class AstolfoforgeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AstolfoforgeMod.MODID);
	public static final DeferredItem<Item> ASTOLFO_CASUAL_SPAWN_EGG;
	public static final DeferredItem<Item> ASTOLFO_SCHOOLGIRL_SPAWN_EGG;
	public static final DeferredItem<Item> ASTOLFO_ARMOR_SPAWN_EGG;
	public static final DeferredItem<Item> FELIX_SPAWN_EGG;
	public static final DeferredItem<Item> MONSTER_WHITE;
	public static final DeferredItem<Item> ASTOLFO_ITEM;
	public static final DeferredItem<Item> ASTOLFO_ATTRACOTR;
	public static final DeferredItem<Item> ASTOLFO_REPELLENT_SPAWN_EGG;
	public static final DeferredItem<Item> BOYKISSER_SPAWN_EGG;
	public static final DeferredItem<Item> HIDERI_KANZAKI_SPAWN_EGG;
	public static final DeferredItem<Item> VENTI_SPAWN_EGG;
	public static final DeferredItem<Item> RIMURU_SPAWN_EGG;
	public static final DeferredItem<Item> NAGISA_SHIOTA_SPAWN_EGG;
	public static final DeferredItem<Item> SIEG_SPAWN_EGG;
	public static final DeferredItem<Item> BRIDGET_SPAWN_EGG;
	public static final DeferredItem<Item> ASTOLFO_FLOWER;
	public static final DeferredItem<Item> MAHIRO_SPAWN_EGG;
	public static final DeferredItem<Item> ONIMAI_SPAWN_EGG;
	public static final DeferredItem<Item> YUURI_SPAWN_EGG;
	public static final DeferredItem<Item> YURI_SPAWN_EGG;
	static {
		ASTOLFO_CASUAL_SPAWN_EGG = register("astolfo_casual_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.ASTOLFO_CASUAL.get())));
		ASTOLFO_SCHOOLGIRL_SPAWN_EGG = register("astolfo_schoolgirl_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.ASTOLFO_SCHOOLGIRL.get())));
		ASTOLFO_ARMOR_SPAWN_EGG = register("astolfo_armor_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.ASTOLFO_ARMOR.get())));
		FELIX_SPAWN_EGG = register("felix_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.FELIX.get())));
		MONSTER_WHITE = register("monster_white", MonsterWhiteItem::new);
		ASTOLFO_ITEM = register("astolfo_item", AstolfoItemItem::new);
		ASTOLFO_ATTRACOTR = register("astolfo_attracotr", AstolfoAttracotrItem::new);
		ASTOLFO_REPELLENT_SPAWN_EGG = register("astolfo_repellent_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.ASTOLFO_REPELLENT.get())));
		BOYKISSER_SPAWN_EGG = register("boykisser_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.BOYKISSER.get())));
		HIDERI_KANZAKI_SPAWN_EGG = register("hideri_kanzaki_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.HIDERI_KANZAKI.get())));
		VENTI_SPAWN_EGG = register("venti_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.VENTI.get())));
		RIMURU_SPAWN_EGG = register("rimuru_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.RIMURU.get())));
		NAGISA_SHIOTA_SPAWN_EGG = register("nagisa_shiota_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.NAGISA_SHIOTA.get())));
		SIEG_SPAWN_EGG = register("sieg_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.SIEG.get())));
		BRIDGET_SPAWN_EGG = register("bridget_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.BRIDGET.get())));
		ASTOLFO_FLOWER = block(AstolfoforgeModBlocks.ASTOLFO_FLOWER);
		MAHIRO_SPAWN_EGG = register("mahiro_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.MAHIRO.get())));
		ONIMAI_SPAWN_EGG = register("onimai_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.ONIMAI.get())));
		YUURI_SPAWN_EGG = register("yuuri_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.YUURI.get())));
		YURI_SPAWN_EGG = register("yuri_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AstolfoforgeModEntities.YURI.get())));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}
}