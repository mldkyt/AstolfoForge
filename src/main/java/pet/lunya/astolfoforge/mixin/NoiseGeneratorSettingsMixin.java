package pet.lunya.astolfoforge.mixin;

import pet.lunya.astolfoforge.init.AstolfoforgeModBiomes;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements AstolfoforgeModBiomes.AstolfoforgeModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> astolfoforge_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.astolfoforge_dimensionTypeReference != null) {
			retval = AstolfoforgeModBiomes.adaptSurfaceRule(retval, this.astolfoforge_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setastolfoforgeDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.astolfoforge_dimensionTypeReference = dimensionType;
	}
}