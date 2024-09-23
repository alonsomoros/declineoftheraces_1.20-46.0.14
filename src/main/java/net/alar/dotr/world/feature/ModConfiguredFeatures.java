package net.alar.dotr.world.feature;

import com.google.common.base.Suppliers;
import net.alar.dotr.DOTR;
import net.alar.dotr.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, DOTR.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BALONCESTITA_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BALONCESTITA_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BALONCESTITA_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_BALONCESTITA_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHERRACK_BALONCESTITA_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_BALONCESTITA_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ENDSTONE_BALONCESTITA_BLOCK.get().defaultBlockState())
    ));


    public static final RegistryObject<ConfiguredFeature<?,?>> BALONCESTITA_ORE = CONFIGURED_FEATURES.register("baloncestita_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BALONCESTITA_ORES.get(), 15))); // Vein size

    public static final RegistryObject<ConfiguredFeature<?,?>> NETHER_BALONCESTITA_ORE = CONFIGURED_FEATURES.register("nether_baloncestita_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_BALONCESTITA_ORES.get(), 15)));

    public static final RegistryObject<ConfiguredFeature<?,?>> END_BALONCESTITA_ORE = CONFIGURED_FEATURES.register("end_baloncestita_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_BALONCESTITA_ORES.get(), 15)));


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}