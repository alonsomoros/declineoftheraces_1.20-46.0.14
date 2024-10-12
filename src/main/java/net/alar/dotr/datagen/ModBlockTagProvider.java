package net.alar.dotr.datagen;

import net.alar.dotr.DOTR;
import net.alar.dotr.block.ModBlocks;
import net.alar.dotr.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DOTR.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.CLAITINE_ORES)
                .add(ModBlocks.CLAITINE_ORE.get())
                .add(ModBlocks.DEEPSLATE_CLAITINE_ORE.get());

        this.tag(ModTags.Blocks.USTHIL_ORES)
                .add(ModBlocks.USTHIL_ORE.get())
                .add(ModBlocks.DEEPSLATE_USTHIL_ORE.get());

        this.tag(ModTags.Blocks.IRONWOOD_LOGS)
                .add(ModBlocks.IRONWOOD_LOG.get())
                .add(ModBlocks.STRIPPED_IRONWOOD_LOG.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.IRONWOOD_LOG.get())
                .add(ModBlocks.IRONWOOD_WOOD.get())
                .add(ModBlocks.STRIPPED_IRONWOOD_WOOD.get())
                .add(ModBlocks.STRIPPED_IRONWOOD_LOG.get())
                .add(ModBlocks.IRONWOOD_PLANKS.get())
                .add(ModBlocks.IRONWOOD_SLAB.get())
                .add(ModBlocks.IRONWOOD_STAIRS.get())
                .add(ModBlocks.IRONWOOD_FENCE.get())
                .add(ModBlocks.IRONWOOD_FENCE_GATE.get())
                .add(ModBlocks.IRONED_DIRT.get())
                .add(ModBlocks.IRONED_GRASS.get())
                .add(ModBlocks.CLAITINE_ORE.get())
                .add(ModBlocks.DEEPSLATE_CLAITINE_ORE.get())
                .add(ModBlocks.USTHIL_ORE.get())
                .add(ModBlocks.DEEPSLATE_USTHIL_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.IRONED_DIRT.get())
                .add(ModBlocks.IRONED_GRASS.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CLAITINE_ORE.get())
                .add(ModBlocks.DEEPSLATE_CLAITINE_ORE.get())
                .add(ModBlocks.USTHIL_ORE.get())
                .add(ModBlocks.DEEPSLATE_USTHIL_ORE.get())
                .add(ModBlocks.TECTITE.get())
                .add(ModBlocks.TECTITE_STAIRS.get())
                .add(ModBlocks.TECTITE_SLAB.get())
                .add(ModBlocks.SMOOTH_TECTITE.get())
                .add(ModBlocks.SMOOTH_TECTITE_STAIRS.get())
                .add(ModBlocks.SMOOTH_TECTITE_SLAB.get())
                .add(ModBlocks.TECTITE_BRICKS.get())
                .add(ModBlocks.TECTITE_BRICKS_STAIRS.get())
                .add(ModBlocks.TECTITE_BRICKS_SLAB.get())
                .add(ModBlocks.NATURAL_TECTITE.get())
                .add(ModBlocks.NATURAL_TECTITE_STAIRS.get())
                .add(ModBlocks.NATURAL_TECTITE_SLAB.get())
                .add(ModBlocks.CHISELED_TECTITE.get())
                .add(ModBlocks.TECTITE_PILLAR.get())
                .add(ModBlocks.APOPHYLLITE.get())
                .add(ModBlocks.APOPHYLLITE_STAIRS.get())
                .add(ModBlocks.APOPHYLLITE_SLAB.get())
                .add(ModBlocks.SMOOTH_APOPHYLLITE.get())
                .add(ModBlocks.SMOOTH_APOPHYLLITE_STAIRS.get())
                .add(ModBlocks.SMOOTH_APOPHYLLITE_SLAB.get())
                .add(ModBlocks.APOPHYLLITE_BRICKS.get())
                .add(ModBlocks.APOPHYLLITE_BRICKS_STAIRS.get())
                .add(ModBlocks.APOPHYLLITE_BRICKS_SLAB.get())
                .add(ModBlocks.NATURAL_APOPHYLLITE.get())
                .add(ModBlocks.NATURAL_APOPHYLLITE_STAIRS.get())
                .add(ModBlocks.NATURAL_APOPHYLLITE_SLAB.get())
                .add(ModBlocks.CHISELED_APOPHYLLITE.get())
                .add(ModBlocks.APOPHYLLITE_PILLAR.get())
                .add(ModBlocks.IRONFORGED_TECTITE.get())
                .add(ModBlocks.IRONFORGED_TECTITE_STAIRS.get())
                .add(ModBlocks.IRONFORGED_TECTITE_SLAB.get())
                .add(ModBlocks.IRONFORGED_SMOOTH_TECTITE.get())
                .add(ModBlocks.IRONFORGED_SMOOTH_TECTITE_STAIRS.get())
                .add(ModBlocks.IRONFORGED_SMOOTH_TECTITE_SLAB.get())
                .add(ModBlocks.IRONFORGED_TECTITE_BRICKS.get())
                .add(ModBlocks.IRONFORGED_TECTITE_BRICKS_STAIRS.get())
                .add(ModBlocks.IRONFORGED_TECTITE_BRICKS_SLAB.get())
                .add(ModBlocks.IRONFORGED_CHISELED_TECTITE.get())
                .add(ModBlocks.IRONFORGED_TECTITE_PILLAR.get())
                .add(ModBlocks.GOLDFORGED_TECTITE.get())
                .add(ModBlocks.GOLDFORGED_TECTITE_STAIRS.get())
                .add(ModBlocks.GOLDFORGED_TECTITE_SLAB.get())
                .add(ModBlocks.GOLDFORGED_SMOOTH_TECTITE.get())
                .add(ModBlocks.GOLDFORGED_SMOOTH_TECTITE_STAIRS.get())
                .add(ModBlocks.GOLDFORGED_SMOOTH_TECTITE_SLAB.get())
                .add(ModBlocks.GOLDFORGED_TECTITE_BRICKS.get())
                .add(ModBlocks.GOLDFORGED_TECTITE_BRICKS_STAIRS.get())
                .add(ModBlocks.GOLDFORGED_TECTITE_BRICKS_SLAB.get())
                .add(ModBlocks.GOLDFORGED_CHISELED_TECTITE.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.IRONWOOD_LOG.get())
                .add(ModBlocks.STRIPPED_IRONWOOD_LOG.get())
                .add(ModBlocks.IRONWOOD_WOOD.get())
                .add(ModBlocks.STRIPPED_IRONWOOD_WOOD.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.IRONED_DIRT.get())
                .add(ModBlocks.IRONED_GRASS.get());

        this.tag(BlockTags.SAPLINGS)
                .add(ModBlocks.IRONWOOD_SAPLING.get());

        this.tag(BlockTags.LEAVES)
                .add(ModBlocks.IRONWOOD_LEAVES.get());
    }
}
