package net.alar.dotr.block;

import net.alar.dotr.DOTR;
import net.alar.dotr.block.custom.BaloncestitaLamp;
import net.alar.dotr.block.custom.HealingBlock;
import net.alar.dotr.block.custom.IronedDirt;
import net.alar.dotr.block.custom.SilverRoseGarden;
import net.alar.dotr.item.ModItems;
import net.alar.dotr.item.PestagnaCreativoMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DOTR.MOD_ID);

    // Tierra de hierro

    public static final RegistryObject<Block> IRONED_DIRT = registerBlock("ironed_dirt",
            () -> new IronedDirt(BlockBehaviour.Properties.copy(Blocks.DIRT).randomTicks().requiresCorrectToolForDrops().strength(3.0F, 6.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> IRONED_GRASS = registerBlock("ironed_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).randomTicks().requiresCorrectToolForDrops().strength(3.0F, 6.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    // Madera

    public static final RegistryObject<LeavesBlock> IRONWOOD_LEAVES = registerBlock("ironwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> IRONWOOD_LOG = registerBlock("ironwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3.0F, 1200.0F).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> IRONWOOD_WOOD = registerBlock("ironwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3.0F, 1200.0F).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> STRIPPED_IRONWOOD_LOG = registerBlock("stripped_ironwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F, 1200.0F).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> STRIPPED_IRONWOOD_WOOD = registerBlock("stripped_ironwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F, 1200.0F).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> IRONWOOD_PLANKS = registerBlock("ironwood_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);


    // Derivados de madera

    public static final RegistryObject<Block> IRONWOOD_SLAB = registerBlock("ironwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> IRONWOOD_STAIRS = registerBlock("ironwood_stairs",
            () -> new StairBlock(() -> IRONWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> IRONWOOD_FENCE = registerBlock("ironwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> IRONWOOD_FENCE_GATE = registerBlock("ironwood_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    // Plantas

    public static final RegistryObject<Block> SILVER_ROSE_GARDEN_BUSH = registerBlock("silver_rose_garden_bush",
            () -> new SilverRoseGarden(BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS)), PestagnaCreativoMod.pestagnaCreativoMod);

    // Minerales

    public static final RegistryObject<Block> BALONCESTITA_ORE = registerBlock("baloncestita_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> DEEPSLATE_BALONCESTITA_ORE = registerBlock("deepslate_baloncestita_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5F, 7.0f)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> BALONCESTITA_BLOCK = registerBlock("baloncestita_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)), PestagnaCreativoMod.pestagnaCreativoMod);


    public static final RegistryObject<Block> NETHERRACK_BALONCESTITA_ORE = registerBlock("netherrack_baloncestita_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)), PestagnaCreativoMod.pestagnaCreativoMod);


    public static final RegistryObject<Block> ENDSTONE_BALONCESTITA_BLOCK = registerBlock("endstone_baloncestita_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0f)), PestagnaCreativoMod.pestagnaCreativoMod);

    // Tectita

    public static final RegistryObject<Block> CHISELED_TECTITE = registerBlock("chiseled_tectite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);


    public static final RegistryObject<Block> NATURAL_TECTITE = registerBlock("natural_tectite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> NATURAL_TECTITE_STAIRS = registerBlock("natural_tectite_stairs",
            () -> new StairBlock(() -> NATURAL_TECTITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> NATURAL_TECTITE_SLAB = registerBlock("natural_tectite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> NATURAL_TECTITE_WALL = registerBlock("natural_tectite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);


    public static final RegistryObject<Block> TECTITE = registerBlock("tectite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> TECTITE_STAIRS = registerBlock("tectite_stairs",
            () -> new StairBlock(() -> TECTITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> TECTITE_SLAB = registerBlock("tectite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> TECTITE_WALL = registerBlock("tectite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);


    public static final RegistryObject<Block> TECTITE_BRICKS = registerBlock("tectite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> TECTITE_BRICKS_STAIRS = registerBlock("tectite_bricks_stairs",
            () -> new StairBlock(() -> TECTITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> TECTITE_BRICKS_SLAB = registerBlock("tectite_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> TECTITE_BRICKS_WALL = registerBlock("tectite_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);


    public static final RegistryObject<Block> SMOOTH_TECTITE = registerBlock("smooth_tectite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> SMOOTH_TECTITE_STAIRS = registerBlock("smooth_tectite_stairs",
            () -> new StairBlock(() -> SMOOTH_TECTITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> SMOOTH_TECTITE_SLAB = registerBlock("smooth_tectite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    // Bloques de decoración

    public static final RegistryObject<Block> HEALING_BLOCK = registerBlock("healing_block",
            () -> new HealingBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 1200.0F)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> BALONCESTITA_LAMP = registerBlock("baloncestita_lamp",
            () -> new BaloncestitaLamp(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().lightLevel(state -> state.getValue(BaloncestitaLamp.LIT) ? 15 : 0)), PestagnaCreativoMod.pestagnaCreativoMod);

    //


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockAsItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockAsItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}