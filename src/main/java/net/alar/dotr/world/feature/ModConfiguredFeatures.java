package net.alar.dotr.world.feature;

import com.google.common.base.Suppliers;
import net.alar.dotr.DOTR;
import net.alar.dotr.block.ModBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.Bootstrap;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;


import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRONWOOD_TREE_KEY = registerKey("ironwood_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRONWOOD_TREE_SPAWN_KEY = registerKey("ironwood_tree_spawn");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_USTHIL_ORE_KEY = registerKey("overworld_usthil_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CLAITINE_ORE_KEY = registerKey("overworld_claitine_ore");

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_USTHIL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.USTHIL_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_USTHIL_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CLAITINE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.CLAITINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_CLAITINE_ORE.get().defaultBlockState())
    ));

    public static void bootstrap(BootstapContext<ConfiguredFeature<?,?>> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        register(context, IRONWOOD_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.IRONWOOD_LOG.get()),
                new StraightTrunkPlacer(5, 2, 4),
                BlockStateProvider.simple(ModBlocks.IRONWOOD_LEAVES.get()),
                new SpruceFoliagePlacer(UniformInt.of(4, 5), UniformInt.of(0, 2), UniformInt.of(1, 3)),
                new TwoLayersFeatureSize(2, 0, 2)
        ).build());

        register(context, IRONWOOD_TREE_SPAWN_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
                new WeightedPlacedFeature(placedFeatures.getOrThrow(ModPlacedFeatures.IRONWOOD_TREE_CHECKED_KEY), 0.5F)
        ), placedFeatures.getOrThrow(ModPlacedFeatures.IRONWOOD_TREE_CHECKED_KEY)));

        register(context, OVERWORLD_USTHIL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_USTHIL_ORES.get(), 12));
        register(context, OVERWORLD_CLAITINE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_CLAITINE_ORES.get(), 12));

    }

    public static ResourceKey<ConfiguredFeature<?,?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(DOTR.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}