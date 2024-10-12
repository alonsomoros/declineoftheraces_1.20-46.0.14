package net.alar.dotr.block;

import net.alar.dotr.DOTR;
import net.alar.dotr.block.custom.HealingBlock;
import net.alar.dotr.block.custom.IronedDirt;
import net.alar.dotr.block.custom.ModFlammableRotatedPillarBlock;
import net.alar.dotr.block.custom.SilverRoseGarden;
import net.alar.dotr.block.custom.TectitePillarBlock;
import net.alar.dotr.fluid.ModFluids;
import net.alar.dotr.item.ModItems;
import net.alar.dotr.world.feature.tree.IronwoodTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DOTR.MOD_ID);

    // Tierra de hierro

    public static final RegistryObject<Block> IRONED_DIRT = registerBlock("ironed_dirt",
            () -> new IronedDirt(BlockBehaviour.Properties.copy(Blocks.DIRT).randomTicks().requiresCorrectToolForDrops().strength(3.0F, 6.0F)));

    public static final RegistryObject<Block> IRONED_GRASS = registerBlock("ironed_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).randomTicks().requiresCorrectToolForDrops().strength(3.0F, 6.0F)));

    // Madera

    public static final RegistryObject<Block> IRONWOOD_LEAVES = registerBlock("ironwood_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .noOcclusion().requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return false;
                }
            });

    public static final RegistryObject<Block> IRONWOOD_LOG = registerBlock("ironwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3.0F, 1200.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> IRONWOOD_WOOD = registerBlock("ironwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3.0F, 1200.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STRIPPED_IRONWOOD_LOG = registerBlock("stripped_ironwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3.0F, 1200.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STRIPPED_IRONWOOD_WOOD = registerBlock("stripped_ironwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3.0F, 1200.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> IRONWOOD_PLANKS = registerBlock("ironwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)));


    // Derivados de madera

    public static final RegistryObject<Block> IRONWOOD_SLAB = registerBlock("ironwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)));

    public static final RegistryObject<Block> IRONWOOD_STAIRS = registerBlock("ironwood_stairs",
            () -> new StairBlock(() -> IRONWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)));

    public static final RegistryObject<Block> IRONWOOD_FENCE = registerBlock("ironwood_fence",
            () -> new FenceBlock(
                    BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).strength(3.0F, 1200.0F).requiresCorrectToolForDrops().noOcclusion()
            ));

    public static final RegistryObject<Block> IRONWOOD_FENCE_GATE = registerBlock("ironwood_fence_gate",
            () -> new FenceGateBlock(
                    BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F).noOcclusion(),
                    WoodType.OAK));

    public static final RegistryObject<Block> IRONWOOD_DOOR = registerBlock("ironwood_door",
            () -> new DoorBlock(
                    BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).strength(3.0F, 1200.0F).requiresCorrectToolForDrops(),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> IRONWOOD_TRAPDOOR = registerBlock("ironwood_trapdoor",
            () -> new TrapDoorBlock(
                    BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).strength(3.0F, 1200.0F).requiresCorrectToolForDrops(),
                    BlockSetType.OAK

            ));

    // Saplings

    public static final RegistryObject<Block> IRONWOOD_SAPLING = registerBlock("ironwood_sapling",
            () -> new SaplingBlock(new IronwoodTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    // Plantas

    public static final RegistryObject<Block> SILVER_ROSE_GARDEN_BUSH = registerBlock("silver_rose_garden_bush",
            () -> new SilverRoseGarden(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noCollission().instabreak().sound(SoundType.GRASS)));

    // Minerales

    // Usthil

    public static final RegistryObject<Block> USTHIL_ORE = registerBlock("usthil_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DEEPSLATE_USTHIL_ORE = registerBlock("deepslate_usthil_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE).requiresCorrectToolForDrops().strength(4.5F, 7.0f)));

    // Claitine

    public static final RegistryObject<Block> CLAITINE_ORE = registerBlock("claitine_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DEEPSLATE_CLAITINE_ORE = registerBlock("deepslate_claitine_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE).requiresCorrectToolForDrops().strength(4.5F, 7.0f)));

    // Tectita Normal

    public static final RegistryObject<Block> TECTITE = registerBlock("tectite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> TECTITE_STAIRS = registerBlock("tectite_stairs",
            () -> new StairBlock(() -> TECTITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> TECTITE_SLAB = registerBlock("tectite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> TECTITE_WALL = registerBlock("tectite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> SMOOTH_TECTITE = registerBlock("smooth_tectite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> SMOOTH_TECTITE_STAIRS = registerBlock("smooth_tectite_stairs",
            () -> new StairBlock(() -> SMOOTH_TECTITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> SMOOTH_TECTITE_SLAB = registerBlock("smooth_tectite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> TECTITE_BRICKS = registerBlock("tectite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> TECTITE_BRICKS_STAIRS = registerBlock("tectite_bricks_stairs",
            () -> new StairBlock(() -> TECTITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> TECTITE_BRICKS_SLAB = registerBlock("tectite_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> TECTITE_BRICKS_WALL = registerBlock("tectite_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> NATURAL_TECTITE = registerBlock("natural_tectite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> NATURAL_TECTITE_STAIRS = registerBlock("natural_tectite_stairs",
            () -> new StairBlock(() -> NATURAL_TECTITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> NATURAL_TECTITE_SLAB = registerBlock("natural_tectite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> NATURAL_TECTITE_WALL = registerBlock("natural_tectite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> CHISELED_TECTITE = registerBlock("chiseled_tectite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> TECTITE_PILLAR = registerBlock("tectite_pillar",
            () -> new TectitePillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> TECTITE_PILLAR_CORNER = registerBlock("tectite_pillar_corner",
            () -> new TectitePillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    // Apothite Normal

    public static final RegistryObject<Block> APOPHYLLITE = registerBlock("apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> APOPHYLLITE_STAIRS = registerBlock("apophyllite_stairs",
            () -> new StairBlock(() -> APOPHYLLITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> APOPHYLLITE_SLAB = registerBlock("apophyllite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> APOPHYLLITE_WALL = registerBlock("apophyllite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> SMOOTH_APOPHYLLITE = registerBlock("smooth_apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> SMOOTH_APOPHYLLITE_STAIRS = registerBlock("smooth_apophyllite_stairs",
            () -> new StairBlock(() -> SMOOTH_APOPHYLLITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> SMOOTH_APOPHYLLITE_SLAB = registerBlock("smooth_apophyllite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> APOPHYLLITE_BRICKS = registerBlock("apophyllite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> APOPHYLLITE_BRICKS_STAIRS = registerBlock("apophyllite_bricks_stairs",
            () -> new StairBlock(() -> APOPHYLLITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> APOPHYLLITE_BRICKS_SLAB = registerBlock("apophyllite_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> APOPHYLLITE_BRICKS_WALL = registerBlock("apophyllite_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> NATURAL_APOPHYLLITE = registerBlock("natural_apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> NATURAL_APOPHYLLITE_STAIRS = registerBlock("natural_apophyllite_stairs",
            () -> new StairBlock(() -> NATURAL_APOPHYLLITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> NATURAL_APOPHYLLITE_SLAB = registerBlock("natural_apophyllite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> NATURAL_APOPHYLLITE_WALL = registerBlock("natural_apophyllite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> CHISELED_APOPHYLLITE = registerBlock("chiseled_apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> APOPHYLLITE_PILLAR = registerBlock("apophyllite_pillar",
            () -> new TectitePillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    // Ironforged Tectite

    public static final RegistryObject<Block> IRONFORGED_TECTITE = registerBlock("ironforged_tectite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> IRONFORGED_TECTITE_STAIRS = registerBlock("ironforged_tectite_stairs",
            () -> new StairBlock(() -> IRONFORGED_TECTITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> IRONFORGED_TECTITE_SLAB = registerBlock("ironforged_tectite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> IRONFORGED_TECTITE_WALL = registerBlock("ironforged_tectite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> IRONFORGED_SMOOTH_TECTITE = registerBlock("ironforged_smooth_tectite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> IRONFORGED_SMOOTH_TECTITE_STAIRS = registerBlock("ironforged_smooth_tectite_stairs",
            () -> new StairBlock(() -> IRONFORGED_SMOOTH_TECTITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> IRONFORGED_SMOOTH_TECTITE_SLAB = registerBlock("ironforged_smooth_tectite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> IRONFORGED_TECTITE_BRICKS = registerBlock("ironforged_tectite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> IRONFORGED_TECTITE_BRICKS_STAIRS = registerBlock("ironforged_tectite_bricks_stairs",
            () -> new StairBlock(() -> IRONFORGED_TECTITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> IRONFORGED_TECTITE_BRICKS_SLAB = registerBlock("ironforged_tectite_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> IRONFORGED_TECTITE_BRICKS_WALL = registerBlock("ironforged_tectite_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> IRONFORGED_CHISELED_TECTITE = registerBlock("ironforged_chiseled_tectite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> IRONFORGED_TECTITE_PILLAR = registerBlock("ironforged_tectite_pillar",
            () -> new TectitePillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    // Goldforged Tectite

    public static final RegistryObject<Block> GOLDFORGED_TECTITE = registerBlock("goldforged_tectite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_TECTITE_STAIRS = registerBlock("goldforged_tectite_stairs",
            () -> new StairBlock(() -> GOLDFORGED_TECTITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_TECTITE_SLAB = registerBlock("goldforged_tectite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_TECTITE_WALL = registerBlock("goldforged_tectite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> GOLDFORGED_SMOOTH_TECTITE = registerBlock("goldforged_smooth_tectite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_SMOOTH_TECTITE_STAIRS = registerBlock("goldforged_smooth_tectite_stairs",
            () -> new StairBlock(() -> GOLDFORGED_SMOOTH_TECTITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_SMOOTH_TECTITE_SLAB = registerBlock("goldforged_smooth_tectite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> GOLDFORGED_TECTITE_BRICKS = registerBlock("goldforged_tectite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_TECTITE_BRICKS_STAIRS = registerBlock("goldforged_tectite_bricks_stairs",
            () -> new StairBlock(() -> GOLDFORGED_TECTITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_TECTITE_BRICKS_SLAB = registerBlock("goldforged_tectite_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_TECTITE_BRICKS_WALL = registerBlock("goldforged_tectite_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> GOLDFORGED_CHISELED_TECTITE = registerBlock("goldforged_chiseled_tectite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_TECTITE_PILLAR = registerBlock("goldforged_tectite_pillar",
            () -> new TectitePillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    // Goldforged Apophyllite

    public static final RegistryObject<Block> GOLDFORGED_APOPHYLLITE = registerBlock("goldforged_apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_APOPHYLLITE_STAIRS = registerBlock("goldforged_apophyllite_stairs",
            () -> new StairBlock(() -> GOLDFORGED_APOPHYLLITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_APOPHYLLITE_SLAB = registerBlock("goldforged_apophyllite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_APOPHYLLITE_WALL = registerBlock("goldforged_apophyllite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> GOLDFORGED_SMOOTH_APOPHYLLITE = registerBlock("goldforged_smooth_apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_SMOOTH_APOPHYLLITE_STAIRS = registerBlock("goldforged_smooth_apophyllite_stairs",
            () -> new StairBlock(() -> GOLDFORGED_SMOOTH_APOPHYLLITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_SMOOTH_APOPHYLLITE_SLAB = registerBlock("goldforged_smooth_apophyllite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> GOLDFORGED_APOPHYLLITE_BRICKS = registerBlock("goldforged_apophyllite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_APOPHYLLITE_BRICKS_STAIRS = registerBlock("goldforged_apophyllite_bricks_stairs",
            () -> new StairBlock(() -> GOLDFORGED_APOPHYLLITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_APOPHYLLITE_BRICKS_SLAB = registerBlock("goldforged_apophyllite_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_APOPHYLLITE_BRICKS_WALL = registerBlock("goldforged_apophyllite_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> GOLDFORGED_CHISELED_APOPHYLLITE = registerBlock("goldforged_chiseled_apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> GOLDFORGED_APOPHYLLITE_PILLAR = registerBlock("goldforged_apophyllite_pillar",
            () -> new TectitePillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    // Diamondforged Apophyllite

    public static final RegistryObject<Block> DIAMONDFORGED_APOPHYLLITE = registerBlock("diamondforged_apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DIAMONDFORGED_APOPHYLLITE_STAIRS = registerBlock("diamondforged_apophyllite_stairs",
            () -> new StairBlock(() -> DIAMONDFORGED_APOPHYLLITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DIAMONDFORGED_APOPHYLLITE_SLAB = registerBlock("diamondforged_apophyllite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DIAMONDFORGED_APOPHYLLITE_WALL = registerBlock("diamondforged_apophyllite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> DIAMONDFORGED_SMOOTH_APOPHYLLITE = registerBlock("diamondforged_smooth_apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DIAMONDFORGED_SMOOTH_APOPHYLLITE_STAIRS = registerBlock("diamondforged_smooth_apophyllite_stairs",
            () -> new StairBlock(() -> DIAMONDFORGED_SMOOTH_APOPHYLLITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DIAMONDFORGED_SMOOTH_APOPHYLLITE_SLAB = registerBlock("diamondforged_smooth_apophyllite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> DIAMONDFORGED_APOPHYLLITE_BRICKS = registerBlock("diamondforged_apophyllite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DIAMONDFORGED_APOPHYLLITE_BRICKS_STAIRS = registerBlock("diamondforged_apophyllite_bricks_stairs",
            () -> new StairBlock(() -> DIAMONDFORGED_APOPHYLLITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DIAMONDFORGED_APOPHYLLITE_BRICKS_SLAB = registerBlock("diamondforged_apophyllite_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DIAMONDFORGED_APOPHYLLITE_BRICKS_WALL = registerBlock("diamondforged_apophyllite_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));


    public static final RegistryObject<Block> DIAMONDFORGED_CHISELED_APOPHYLLITE = registerBlock("diamondforged_chiseled_apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    public static final RegistryObject<Block> DIAMONDFORGED_APOPHYLLITE_PILLAR = registerBlock("diamondforged_apophyllite_pillar",
            () -> new TectitePillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    // Bloques de decoración

    public static final RegistryObject<Block> HEALING_BLOCK = registerBlock("healing_block",
            () -> new HealingBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK).requiresCorrectToolForDrops().strength(3.0F, 7.0f)));

    // Fluidos

    public static final RegistryObject<LiquidBlock> VENOMOUS_WATER_BLOCK = BLOCKS.register("venomous_water_block",
            () -> new LiquidBlock(
                    ModFluids.SOURCE_VENOMOUS_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockAsItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockAsItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}