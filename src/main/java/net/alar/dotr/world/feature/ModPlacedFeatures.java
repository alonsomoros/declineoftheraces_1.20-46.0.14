package net.alar.dotr.world.feature;

import net.alar.dotr.DOTR;
import net.alar.dotr.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> IRONWOOD_TREE_CHECKED_KEY = createKey("ironwood_tree_checked");
    public static final ResourceKey<PlacedFeature> IRONWOOD_TREE_PLACED_KEY = createKey("ironwood_tree_placed");

    public static final ResourceKey<PlacedFeature> USTHIL_ORE_PLACED_KEY = createKey("usthil_ore_placed");
    public static final ResourceKey<PlacedFeature> CLAITINE_ORE_PLACED_KEY = createKey("claitine_ore_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, IRONWOOD_TREE_CHECKED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.IRONWOOD_TREE_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.IRONWOOD_SAPLING.get())));
        register(context, IRONWOOD_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.IRONWOOD_TREE_SPAWN_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3,0.1f,2)));

        register(context, USTHIL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_USTHIL_ORE_KEY),
                commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80))));

        register(context, CLAITINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CLAITINE_ORE_KEY),
                commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80))));
    }

    public static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier modifier2) {
       return List.of(modifier, InSquarePlacement.spread(), modifier2, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int veinsPerChunk, PlacementModifier modifier) {
       return orePlacement(CountPlacement.of(veinsPerChunk), modifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int veinsPerChunk, PlacementModifier modifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(veinsPerChunk), modifier);
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(DOTR.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }


}
