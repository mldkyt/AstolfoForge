/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pet.lunya.astolfoforge.init;

import pet.lunya.astolfoforge.client.renderer.*;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class AstolfoforgeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AstolfoforgeModEntities.ASTOLFO_CASUAL.get(), AstolfoCasualRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.ASTOLFO_SCHOOLGIRL.get(), AstolfoSchoolgirlRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.ASTOLFO_ARMOR.get(), AstolfoArmorRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.FELIX.get(), FelixRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.ASTOLFO_REPELLENT.get(), AstolfoRepellentRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.BOYKISSER.get(), BoykisserRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.HIDERI_KANZAKI.get(), HideriKanzakiRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.VENTI.get(), VentiRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.RIMURU.get(), RimuruRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.NAGISA_SHIOTA.get(), NagisaShiotaRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.SIEG.get(), SiegRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.BRIDGET.get(), BridgetRenderer::new);
	}
}