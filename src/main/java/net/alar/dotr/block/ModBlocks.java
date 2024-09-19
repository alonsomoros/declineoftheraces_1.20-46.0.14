package net.alar.dotr.block;

import net.alar.dotr.DOTR;
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

    public static final RegistryObject<Block> IRONED_DIRT = registerBlock("ironed_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> IRONED_GRASS = registerBlock("ironed_grass",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<LeavesBlock> IRONWOOD_LEAVES = registerBlock("ironwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> IRONWOOD_LOG = registerBlock("ironwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).explosionResistance(10F).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

//    public static final RegistryObject<Block> STRIPPED_IRONWOOD_LOG = registerBlock("stripped_ironwood_log",
//            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> IRONWOOD_PLANKS = registerBlock("ironwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<SweetBerryBushBlock> SILVER_ROSE_GARDEN = registerBlock("silver_rose_garden",
            () -> new SweetBerryBushBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> BALONCESTITA_ORE = registerBlock("baloncestita_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> DEEPSLATE_BALONCESTITA_ORE = registerBlock("deepslate_baloncestita_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> BALONCESTITA_BLOCK = registerBlock("baloncestita_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> CHISELED_TECTITE = registerBlock("chiseled_tectita",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> NATURAL_TECTITE = registerBlock("natural_tectita",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> SMOOTH_TECTITE = registerBlock("smooth_tectita",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> TECTITE = registerBlock("tectita",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);

    public static final RegistryObject<Block> TECTITE_BRICKS = registerBlock("tectita_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).requiresCorrectToolForDrops()), PestagnaCreativoMod.pestagnaCreativoMod);


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