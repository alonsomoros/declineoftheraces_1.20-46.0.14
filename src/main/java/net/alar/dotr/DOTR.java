package net.alar.dotr;

import com.mojang.logging.LogUtils;
import net.alar.dotr.block.ModBlocks;
import net.alar.dotr.fluid.ModFluids;
import net.alar.dotr.fluid.ModFluidsTypes;
import net.alar.dotr.item.ModItems;
import net.alar.dotr.item.PestagnaCreativoMod;
import net.alar.dotr.networking.ModMessages;
import net.alar.dotr.painting.ModPaintings;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
//import software.bernie.geckolib.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DOTR.MOD_ID)
public class DOTR {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "dotr";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public DOTR() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        PestagnaCreativoMod.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        //ModVillagers.register(modEventBus);
        ModPaintings.register(modEventBus);

        ModFluids.register(modEventBus);
        ModFluidsTypes.register(modEventBus);

//        GeckoLib.initialize();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(ModMessages::register);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == PestagnaCreativoMod.DOTR_TAB.get()) {
            event.accept(ModItems.TITANIUM_PETAL);
            event.accept(ModItems.RAW_USTHIL);
            event.accept(ModItems.USTHIL);
            event.accept(ModItems.RAW_CLAITINE);
            event.accept(ModItems.CLAITINE);
            event.accept(ModItems.EIGHT_BALL);
            event.accept(ModItems.VENOMOUS_WATER_BUCKET);
            event.accept(ModItems.SHIELD_SPIDER_STING);
            event.accept(ModItems.EXTRAHARD_EXOSKELETON);
            event.accept(ModItems.GOLIATH_FUR);
            event.accept(ModItems.RAW_GOLIATH_RIBS);
            event.accept(ModItems.ROASTED_GOLIATH_RIBS);
            event.accept(ModItems.SHIELD_PIERCER_SWORD);
            event.accept(ModBlocks.SILVER_ROSE_GARDEN_BUSH);
            event.accept(ModBlocks.IRONWOOD_SAPLING);
            event.accept(ModBlocks.IRONWOOD_LEAVES);
            event.accept(ModBlocks.IRONWOOD_LOG);
            event.accept(ModBlocks.STRIPPED_IRONWOOD_LOG);
            event.accept(ModBlocks.IRONWOOD_WOOD);
            event.accept(ModBlocks.STRIPPED_IRONWOOD_WOOD);
            event.accept(ModBlocks.IRONWOOD_PLANKS);
            event.accept(ModBlocks.IRONWOOD_SLAB);
            event.accept(ModBlocks.IRONWOOD_STAIRS);
            event.accept(ModBlocks.IRONWOOD_FENCE);
            event.accept(ModBlocks.IRONWOOD_FENCE_GATE);
            event.accept(ModBlocks.IRONWOOD_DOOR);
            event.accept(ModBlocks.IRONWOOD_TRAPDOOR);
            event.accept(ModItems.IRONWOOD_STICK);

            event.accept(ModBlocks.TECTITE);
            event.accept(ModBlocks.TECTITE_STAIRS);
            event.accept(ModBlocks.TECTITE_SLAB);
            event.accept(ModBlocks.TECTITE_WALL);
            event.accept(ModBlocks.SMOOTH_TECTITE);
            event.accept(ModBlocks.SMOOTH_TECTITE_STAIRS);
            event.accept(ModBlocks.SMOOTH_TECTITE_SLAB);
            event.accept(ModBlocks.TECTITE_BRICKS);
            event.accept(ModBlocks.TECTITE_BRICKS_STAIRS);
            event.accept(ModBlocks.TECTITE_BRICKS_SLAB);
            event.accept(ModBlocks.TECTITE_BRICKS_WALL);
            event.accept(ModBlocks.NATURAL_TECTITE);
            event.accept(ModBlocks.NATURAL_TECTITE_STAIRS);
            event.accept(ModBlocks.NATURAL_TECTITE_SLAB);
            event.accept(ModBlocks.NATURAL_TECTITE_WALL);
            event.accept(ModBlocks.CHISELED_TECTITE);
            event.accept(ModBlocks.TECTITE_PILLAR);
            event.accept(ModBlocks.APOPHYLLITE);
            event.accept(ModBlocks.APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.APOPHYLLITE_SLAB);
            event.accept(ModBlocks.APOPHYLLITE_WALL);
            event.accept(ModBlocks.SMOOTH_APOPHYLLITE);
            event.accept(ModBlocks.SMOOTH_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.SMOOTH_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.APOPHYLLITE_BRICKS);
            event.accept(ModBlocks.APOPHYLLITE_BRICKS_STAIRS);
            event.accept(ModBlocks.APOPHYLLITE_BRICKS_SLAB);
            event.accept(ModBlocks.APOPHYLLITE_BRICKS_WALL);
            event.accept(ModBlocks.NATURAL_APOPHYLLITE);
            event.accept(ModBlocks.NATURAL_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.NATURAL_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.NATURAL_APOPHYLLITE_WALL);
            event.accept(ModBlocks.CHISELED_APOPHYLLITE);
            event.accept(ModBlocks.APOPHYLLITE_PILLAR);
            event.accept(ModBlocks.IRONFORGED_TECTITE);
            event.accept(ModBlocks.IRONFORGED_TECTITE_STAIRS);
            event.accept(ModBlocks.IRONFORGED_TECTITE_SLAB);
            event.accept(ModBlocks.IRONFORGED_TECTITE_WALL);
            event.accept(ModBlocks.IRONFORGED_SMOOTH_TECTITE);
            event.accept(ModBlocks.IRONFORGED_SMOOTH_TECTITE_STAIRS);
            event.accept(ModBlocks.IRONFORGED_SMOOTH_TECTITE_SLAB);
            event.accept(ModBlocks.IRONFORGED_TECTITE_BRICKS);
            event.accept(ModBlocks.IRONFORGED_TECTITE_BRICKS_STAIRS);
            event.accept(ModBlocks.IRONFORGED_TECTITE_BRICKS_SLAB);
            event.accept(ModBlocks.IRONFORGED_TECTITE_BRICKS_WALL);
            event.accept(ModBlocks.IRONFORGED_CHISELED_TECTITE);
            event.accept(ModBlocks.IRONFORGED_TECTITE_PILLAR);
            event.accept(ModBlocks.GOLDFORGED_TECTITE);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_SLAB);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_WALL);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_TECTITE);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_TECTITE_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_TECTITE_SLAB);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_BRICKS);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_BRICKS_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_BRICKS_SLAB);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_BRICKS_WALL);
            event.accept(ModBlocks.GOLDFORGED_CHISELED_TECTITE);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_PILLAR);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_WALL);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_SLAB);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_WALL);
            event.accept(ModBlocks.GOLDFORGED_CHISELED_APOPHYLLITE);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_PILLAR);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_WALL);
            event.accept(ModBlocks.DIAMONDFORGED_SMOOTH_APOPHYLLITE);
            event.accept(ModBlocks.DIAMONDFORGED_SMOOTH_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.DIAMONDFORGED_SMOOTH_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS_STAIRS);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS_SLAB);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS_WALL);
            event.accept(ModBlocks.DIAMONDFORGED_CHISELED_APOPHYLLITE);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_PILLAR);

        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.CLAITINE);
            event.accept(ModItems.RAW_CLAITINE);
            event.accept(ModItems.USTHIL);
            event.accept(ModItems.RAW_USTHIL);
            event.accept(ModItems.DIAMOND_SHARD);
        }

        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.RAW_GOLIATH_RIBS);
            event.accept(ModItems.ROASTED_GOLIATH_RIBS);
        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.SHIELD_PIERCER_SWORD);
        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.IRONED_DIRT);
            event.accept(ModBlocks.IRONED_GRASS);
            event.accept(ModBlocks.SILVER_ROSE_GARDEN_BUSH);
            event.accept(ModBlocks.IRONWOOD_SAPLING);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

            event.accept(ModBlocks.IRONED_DIRT);
            event.accept(ModBlocks.IRONED_GRASS);

            event.accept(ModBlocks.IRONWOOD_LEAVES);
            event.accept(ModBlocks.IRONWOOD_LOG);
            event.accept(ModBlocks.STRIPPED_IRONWOOD_LOG);
            event.accept(ModBlocks.IRONWOOD_WOOD);
            event.accept(ModBlocks.STRIPPED_IRONWOOD_WOOD);
            event.accept(ModBlocks.IRONWOOD_PLANKS);
            event.accept(ModBlocks.IRONWOOD_SLAB);
            event.accept(ModBlocks.IRONWOOD_STAIRS);
            event.accept(ModBlocks.IRONWOOD_FENCE);
            event.accept(ModBlocks.IRONWOOD_FENCE_GATE);
            event.accept(ModBlocks.IRONWOOD_DOOR);
            event.accept(ModBlocks.IRONWOOD_TRAPDOOR);

            event.accept(ModBlocks.TECTITE);
            event.accept(ModBlocks.TECTITE_STAIRS);
            event.accept(ModBlocks.TECTITE_SLAB);
            event.accept(ModBlocks.TECTITE_WALL);
            event.accept(ModBlocks.SMOOTH_TECTITE);
            event.accept(ModBlocks.SMOOTH_TECTITE_STAIRS);
            event.accept(ModBlocks.SMOOTH_TECTITE_SLAB);
            event.accept(ModBlocks.TECTITE_BRICKS);
            event.accept(ModBlocks.TECTITE_BRICKS_STAIRS);
            event.accept(ModBlocks.TECTITE_BRICKS_SLAB);
            event.accept(ModBlocks.TECTITE_BRICKS_WALL);
            event.accept(ModBlocks.NATURAL_TECTITE);
            event.accept(ModBlocks.NATURAL_TECTITE_STAIRS);
            event.accept(ModBlocks.NATURAL_TECTITE_SLAB);
            event.accept(ModBlocks.NATURAL_TECTITE_WALL);
            event.accept(ModBlocks.CHISELED_TECTITE);
            event.accept(ModBlocks.TECTITE_PILLAR);
            event.accept(ModBlocks.APOPHYLLITE);
            event.accept(ModBlocks.APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.APOPHYLLITE_SLAB);
            event.accept(ModBlocks.APOPHYLLITE_WALL);
            event.accept(ModBlocks.SMOOTH_APOPHYLLITE);
            event.accept(ModBlocks.SMOOTH_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.SMOOTH_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.APOPHYLLITE_BRICKS);
            event.accept(ModBlocks.APOPHYLLITE_BRICKS_STAIRS);
            event.accept(ModBlocks.APOPHYLLITE_BRICKS_SLAB);
            event.accept(ModBlocks.APOPHYLLITE_BRICKS_WALL);
            event.accept(ModBlocks.NATURAL_APOPHYLLITE);
            event.accept(ModBlocks.NATURAL_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.NATURAL_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.NATURAL_APOPHYLLITE_WALL);
            event.accept(ModBlocks.CHISELED_APOPHYLLITE);
            event.accept(ModBlocks.APOPHYLLITE_PILLAR);
            event.accept(ModBlocks.IRONFORGED_TECTITE);
            event.accept(ModBlocks.IRONFORGED_TECTITE_STAIRS);
            event.accept(ModBlocks.IRONFORGED_TECTITE_SLAB);
            event.accept(ModBlocks.IRONFORGED_TECTITE_WALL);
            event.accept(ModBlocks.IRONFORGED_SMOOTH_TECTITE);
            event.accept(ModBlocks.IRONFORGED_SMOOTH_TECTITE_STAIRS);
            event.accept(ModBlocks.IRONFORGED_SMOOTH_TECTITE_SLAB);
            event.accept(ModBlocks.IRONFORGED_TECTITE_BRICKS);
            event.accept(ModBlocks.IRONFORGED_TECTITE_BRICKS_STAIRS);
            event.accept(ModBlocks.IRONFORGED_TECTITE_BRICKS_SLAB);
            event.accept(ModBlocks.IRONFORGED_TECTITE_BRICKS_WALL);
            event.accept(ModBlocks.IRONFORGED_CHISELED_TECTITE);
            event.accept(ModBlocks.IRONFORGED_TECTITE_PILLAR);
            event.accept(ModBlocks.GOLDFORGED_TECTITE);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_SLAB);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_WALL);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_TECTITE);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_TECTITE_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_TECTITE_SLAB);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_BRICKS);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_BRICKS_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_BRICKS_SLAB);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_BRICKS_WALL);
            event.accept(ModBlocks.GOLDFORGED_CHISELED_TECTITE);
            event.accept(ModBlocks.GOLDFORGED_TECTITE_PILLAR);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_WALL);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_STAIRS);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_SLAB);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_WALL);
            event.accept(ModBlocks.GOLDFORGED_CHISELED_APOPHYLLITE);
            event.accept(ModBlocks.GOLDFORGED_APOPHYLLITE_PILLAR);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_WALL);
            event.accept(ModBlocks.DIAMONDFORGED_SMOOTH_APOPHYLLITE);
            event.accept(ModBlocks.DIAMONDFORGED_SMOOTH_APOPHYLLITE_STAIRS);
            event.accept(ModBlocks.DIAMONDFORGED_SMOOTH_APOPHYLLITE_SLAB);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS_STAIRS);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS_SLAB);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_BRICKS_WALL);
            event.accept(ModBlocks.DIAMONDFORGED_CHISELED_APOPHYLLITE);
            event.accept(ModBlocks.DIAMONDFORGED_APOPHYLLITE_PILLAR);
        }
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
//        // Do something when the server starts
//        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) { // ItemBlockRenderTypes se cambió a un atributo en el Json del BerryBush
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_VENOMOUS_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_VENOMOUS_WATER.get(), RenderType.translucent());
        }
    }
}
