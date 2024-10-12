package net.alar.dotr.datagen;

import net.alar.dotr.DOTR;
import net.alar.dotr.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DOTR.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SILVER_ROSE_GARDEN_BUSH);
        blockWithItem(ModBlocks.IRONWOOD_SAPLING);
        blockWithItem(ModBlocks.IRONWOOD_LEAVES);
        blockWithItem(ModBlocks.IRONWOOD_LOG);
        blockWithItem(ModBlocks.STRIPPED_IRONWOOD_LOG);
        blockWithItem(ModBlocks.IRONWOOD_WOOD);
        blockWithItem(ModBlocks.STRIPPED_IRONWOOD_WOOD);
        blockWithItem(ModBlocks.IRONWOOD_PLANKS);
        blockWithItem(ModBlocks.IRONWOOD_SLAB);
        blockWithItem(ModBlocks.IRONWOOD_STAIRS);
        blockWithItem(ModBlocks.IRONWOOD_FENCE);
        blockWithItem(ModBlocks.IRONWOOD_FENCE_GATE);
        blockWithItem(ModBlocks.IRONWOOD_DOOR);
        blockWithItem(ModBlocks.IRONWOOD_TRAPDOOR);

        blockWithItem(ModBlocks.TECTITE);
        blockWithItem(ModBlocks.TECTITE_STAIRS);
        blockWithItem(ModBlocks.TECTITE_SLAB);
        blockWithItem(ModBlocks.TECTITE_WALL);
        blockWithItem(ModBlocks.SMOOTH_TECTITE);
        blockWithItem(ModBlocks.SMOOTH_TECTITE_STAIRS);
        blockWithItem(ModBlocks.SMOOTH_TECTITE_SLAB);
        blockWithItem(ModBlocks.TECTITE_BRICKS);
        blockWithItem(ModBlocks.TECTITE_BRICKS_STAIRS);
        blockWithItem(ModBlocks.TECTITE_BRICKS_SLAB);
        blockWithItem(ModBlocks.TECTITE_BRICKS_WALL);
        blockWithItem(ModBlocks.NATURAL_TECTITE);
        blockWithItem(ModBlocks.NATURAL_TECTITE_STAIRS);
        blockWithItem(ModBlocks.NATURAL_TECTITE_SLAB);
        blockWithItem(ModBlocks.NATURAL_TECTITE_WALL);
        blockWithItem(ModBlocks.CHISELED_TECTITE);
        blockWithItem(ModBlocks.TECTITE_PILLAR);
        blockWithItem(ModBlocks.APOPHYLLITE);
        blockWithItem(ModBlocks.APOPHYLLITE_STAIRS);
        blockWithItem(ModBlocks.APOPHYLLITE_SLAB);
        blockWithItem(ModBlocks.APOPHYLLITE_WALL);
        blockWithItem(ModBlocks.SMOOTH_APOPHYLLITE);
        blockWithItem(ModBlocks.SMOOTH_APOPHYLLITE_STAIRS);
        blockWithItem(ModBlocks.SMOOTH_APOPHYLLITE_SLAB);
        blockWithItem(ModBlocks.APOPHYLLITE_BRICKS);
        blockWithItem(ModBlocks.APOPHYLLITE_BRICKS_STAIRS);
        blockWithItem(ModBlocks.APOPHYLLITE_BRICKS_SLAB);
        blockWithItem(ModBlocks.APOPHYLLITE_BRICKS_WALL);
        blockWithItem(ModBlocks.NATURAL_APOPHYLLITE);
        blockWithItem(ModBlocks.NATURAL_APOPHYLLITE_STAIRS);
        blockWithItem(ModBlocks.NATURAL_APOPHYLLITE_SLAB);
        blockWithItem(ModBlocks.NATURAL_APOPHYLLITE_WALL);
        blockWithItem(ModBlocks.CHISELED_APOPHYLLITE);
        blockWithItem(ModBlocks.APOPHYLLITE_PILLAR);
        blockWithItem(ModBlocks.IRONFORGED_TECTITE);
        blockWithItem(ModBlocks.IRONFORGED_TECTITE_STAIRS);
        blockWithItem(ModBlocks.IRONFORGED_TECTITE_SLAB);
        blockWithItem(ModBlocks.IRONFORGED_TECTITE_WALL);
        blockWithItem(ModBlocks.IRONFORGED_SMOOTH_TECTITE);
        blockWithItem(ModBlocks.IRONFORGED_SMOOTH_TECTITE_STAIRS);
        blockWithItem(ModBlocks.IRONFORGED_SMOOTH_TECTITE_SLAB);
        blockWithItem(ModBlocks.IRONFORGED_TECTITE_BRICKS);
        blockWithItem(ModBlocks.IRONFORGED_TECTITE_BRICKS_STAIRS);
        blockWithItem(ModBlocks.IRONFORGED_TECTITE_BRICKS_SLAB);
        blockWithItem(ModBlocks.IRONFORGED_TECTITE_BRICKS_WALL);
        blockWithItem(ModBlocks.IRONFORGED_CHISELED_TECTITE);
        blockWithItem(ModBlocks.IRONFORGED_TECTITE_PILLAR);
        blockWithItem(ModBlocks.GOLDFORGED_TECTITE);
        blockWithItem(ModBlocks.GOLDFORGED_TECTITE_STAIRS);
        blockWithItem(ModBlocks.GOLDFORGED_TECTITE_SLAB);
        blockWithItem(ModBlocks.GOLDFORGED_TECTITE_WALL);
        blockWithItem(ModBlocks.GOLDFORGED_SMOOTH_TECTITE);
        blockWithItem(ModBlocks.GOLDFORGED_SMOOTH_TECTITE_STAIRS);
        blockWithItem(ModBlocks.GOLDFORGED_SMOOTH_TECTITE_SLAB);
        blockWithItem(ModBlocks.GOLDFORGED_TECTITE_BRICKS);
        blockWithItem(ModBlocks.GOLDFORGED_TECTITE_BRICKS_STAIRS);
        blockWithItem(ModBlocks.GOLDFORGED_TECTITE_BRICKS_SLAB);
        blockWithItem(ModBlocks.GOLDFORGED_TECTITE_BRICKS_WALL);
        blockWithItem(ModBlocks.GOLDFORGED_CHISELED_TECTITE);
        blockWithItem(ModBlocks.GOLDFORGED_TECTITE_PILLAR);
        blockWithItem(ModBlocks.GOLDFORGED_APOPHYLLITE);
        blockWithItem(ModBlocks.GOLDFORGED_APOPHYLLITE_STAIRS);
        blockWithItem(ModBlocks.GOLDFORGED_APOPHYLLITE_SLAB);
        blockWithItem(ModBlocks.GOLDFORGED_APOPHYLLITE_WALL);
        blockWithItem(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE);
        blockWithItem(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE_STAIRS);
        blockWithItem(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE_SLAB);
        blockWithItem(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS);
        blockWithItem(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_STAIRS);
        blockWithItem(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_SLAB);
        blockWithItem(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_WALL);
        blockWithItem(ModBlocks.GOLDFORGED_CHISELED_APOPHYLLITE);
        blockWithItem(ModBlocks.GOLDFORGED_APOPHYLLITE_PILLAR);
        blockWithItem(ModBlocks.DIAMONDFORGED_APOPHYLLITE);
        blockWithItem(ModBlocks.DIAMONDFORGED_APOPHYLLITE_STAIRS);
        blockWithItem(ModBlocks.DIAMONDFORGED_APOPHYLLITE_SLAB);
        blockWithItem(ModBlocks.DIAMONDFORGED_APOPHYLLITE_WALL);
        blockWithItem(ModBlocks.DIAMONDFORGED_SMOOTH_APOPHYLLITE);
        blockWithItem(ModBlocks.DIAMONDFORGED_SMOOTH_APOPHYLLITE_STAIRS);
        blockWithItem(ModBlocks.DIAMONDFORGED_SMOOTH_APOPHYLLITE_SLAB);
        blockWithItem(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS);
        blockWithItem(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS_STAIRS);
        blockWithItem(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS_SLAB);
        blockWithItem(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS_WALL);
        blockWithItem(ModBlocks.DIAMONDFORGED_CHISELED_APOPHYLLITE);
        blockWithItem(ModBlocks.DIAMONDFORGED_APOPHYLLITE_PILLAR);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
