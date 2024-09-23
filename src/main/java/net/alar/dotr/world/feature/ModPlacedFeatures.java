package net.alar.dotr.world.feature;

import net.alar.dotr.DOTR;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, DOTR.MOD_ID);


    // Overworld
    public static final RegistryObject<PlacedFeature> BALONCESTITA_ORE_PLACED = PLACED_FEATURES.register("baloncestita_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BALONCESTITA_ORE.getHolder().get(),
                    commonOrePlacement(15,
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80)))));

    // Nether
    public static final RegistryObject<PlacedFeature> NETHER_BALONCESTITA_ORE_PLACED = PLACED_FEATURES.register("nether_baloncestita_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_BALONCESTITA_ORE.getHolder().get(),
                    commonOrePlacement(15,
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(130)))));

    // End
    public static final RegistryObject<PlacedFeature> END_BALONCESTITA_ORE_PLACED = PLACED_FEATURES.register("end_baloncestita_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_BALONCESTITA_ORE.getHolder().get(),
                    commonOrePlacement(15,
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(70)))));




    public static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier modifier2) {
       return List.of(modifier, InSquarePlacement.spread(), modifier2, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int veinsPerChunk, PlacementModifier modifier) {
       return orePlacement(CountPlacement.of(veinsPerChunk), modifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int veinsPerChunk, PlacementModifier modifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(veinsPerChunk), modifier);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }


}
