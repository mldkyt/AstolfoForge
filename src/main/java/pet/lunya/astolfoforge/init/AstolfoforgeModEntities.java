/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pet.lunya.astolfoforge.init;

import pet.lunya.astolfoforge.entity.*;
import pet.lunya.astolfoforge.AstolfoforgeMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class AstolfoforgeModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, AstolfoforgeMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<AstolfoCasualEntity>> ASTOLFO_CASUAL = register("astolfo_casual",
			EntityType.Builder.<AstolfoCasualEntity>of(AstolfoCasualEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AstolfoSchoolgirlEntity>> ASTOLFO_SCHOOLGIRL = register("astolfo_schoolgirl",
			EntityType.Builder.<AstolfoSchoolgirlEntity>of(AstolfoSchoolgirlEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AstolfoArmorEntity>> ASTOLFO_ARMOR = register("astolfo_armor",
			EntityType.Builder.<AstolfoArmorEntity>of(AstolfoArmorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FelixEntity>> FELIX = register("felix",
			EntityType.Builder.<FelixEntity>of(FelixEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AstolfoRepellentEntity>> ASTOLFO_REPELLENT = register("astolfo_repellent",
			EntityType.Builder.<AstolfoRepellentEntity>of(AstolfoRepellentEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoykisserEntity>> BOYKISSER = register("boykisser",
			EntityType.Builder.<BoykisserEntity>of(BoykisserEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HideriKanzakiEntity>> HIDERI_KANZAKI = register("hideri_kanzaki",
			EntityType.Builder.<HideriKanzakiEntity>of(HideriKanzakiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<VentiEntity>> VENTI = register("venti",
			EntityType.Builder.<VentiEntity>of(VentiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RimuruEntity>> RIMURU = register("rimuru",
			EntityType.Builder.<RimuruEntity>of(RimuruEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NagisaShiotaEntity>> NAGISA_SHIOTA = register("nagisa_shiota",
			EntityType.Builder.<NagisaShiotaEntity>of(NagisaShiotaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SiegEntity>> SIEG = register("sieg",
			EntityType.Builder.<SiegEntity>of(SiegEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BridgetEntity>> BRIDGET = register("bridget",
			EntityType.Builder.<BridgetEntity>of(BridgetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(AstolfoforgeMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		AstolfoCasualEntity.init(event);
		AstolfoSchoolgirlEntity.init(event);
		AstolfoArmorEntity.init(event);
		FelixEntity.init(event);
		AstolfoRepellentEntity.init(event);
		BoykisserEntity.init(event);
		HideriKanzakiEntity.init(event);
		VentiEntity.init(event);
		RimuruEntity.init(event);
		NagisaShiotaEntity.init(event);
		SiegEntity.init(event);
		BridgetEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ASTOLFO_CASUAL.get(), AstolfoCasualEntity.createAttributes().build());
		event.put(ASTOLFO_SCHOOLGIRL.get(), AstolfoSchoolgirlEntity.createAttributes().build());
		event.put(ASTOLFO_ARMOR.get(), AstolfoArmorEntity.createAttributes().build());
		event.put(FELIX.get(), FelixEntity.createAttributes().build());
		event.put(ASTOLFO_REPELLENT.get(), AstolfoRepellentEntity.createAttributes().build());
		event.put(BOYKISSER.get(), BoykisserEntity.createAttributes().build());
		event.put(HIDERI_KANZAKI.get(), HideriKanzakiEntity.createAttributes().build());
		event.put(VENTI.get(), VentiEntity.createAttributes().build());
		event.put(RIMURU.get(), RimuruEntity.createAttributes().build());
		event.put(NAGISA_SHIOTA.get(), NagisaShiotaEntity.createAttributes().build());
		event.put(SIEG.get(), SiegEntity.createAttributes().build());
		event.put(BRIDGET.get(), BridgetEntity.createAttributes().build());
	}
}