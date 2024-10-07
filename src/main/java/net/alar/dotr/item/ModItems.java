package net.alar.dotr.item;

import net.alar.dotr.DOTR;
import net.alar.dotr.fluid.ModFluids;
import net.alar.dotr.item.custom.EigthBallItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collections;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DOTR.MOD_ID);


    // Rose Garden

    public static final RegistryObject<Item> TITANIUM_PETAL = ITEMS.register("titanium_petal",
            () -> new Item(new Item.Properties()));

//    public static final RegistryObject<Item> SILVER_ROSE_GARDEN = ITEMS.register("silver_rose_garden_0",
//            () -> new Item(new Item.Properties().tab(PestagnaCreativoMod.pestagnaCreativoMod)));



    // Minerals


        // Usthil

    public static final RegistryObject<Item> RAW_USTHIL =
            ITEMS.register("raw_usthil",
            () -> new Item(new Item.Properties())
            );

    public static final RegistryObject<Item> USTHIL =
            ITEMS.register("usthil",
            () -> new Item(new Item.Properties())
            );

        // Claitine

    public static final RegistryObject<Item> RAW_CLAITINE =
            ITEMS.register("raw_claitine",
            () -> new Item(new Item.Properties())
            );

    public static final RegistryObject<Item> CLAITINE =
            ITEMS.register("claitine",
            () -> new Item(new Item.Properties())
            );


    // Tools

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EigthBallItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> VENOMOUS_WATER_BUCKET = ITEMS.register("venomous_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_VENOMOUS_WATER,
                    new Item.Properties()
                            .stacksTo(1)
                            .craftRemainder(Items.BUCKET)));

    public static final RegistryObject<Item> IRONWOOD_STICK = ITEMS.register("ironwood_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLIATH_FUR = ITEMS.register("goliath_fur",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_GOLIATH_RIBS = ITEMS.register("raw_goliath_ribs",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROASTED_GOLIATH_RIBS = ITEMS.register("roasted_goliath_ribs",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHIELD_PIERCER_SWORD = ITEMS.register("shield_piercer_sword",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SHIELD_SPIDER_STING = ITEMS.register("shield_spider_sting",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXTRAHARD_EXOSKELETON = ITEMS.register("extrahard_exoskeleton",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard",
            () -> new Item(new Item.Properties()));

    // Spawn Eggs

//    public static final RegistryObject<Item> GREY_SQUIRREL_SPAWN_EGG = ITEMS.register("grey_squirrel_spawn_egg",
//            () -> new SpawnEggItem();
//
//    public static final RegistryObject<Item> SON_OF_METALS_SPAWN_EGG = ITEMS.register("son_of_metals_spawn_egg",
//            () -> new SpawnEggItem();
//
//    public static final RegistryObject<Item> GOLIATH_SPAWN_EGG = ITEMS.register("goliath_spawn_egg",
//            () -> new SpawnEggItem();
//
//    public static final RegistryObject<Item> TITANIUM_DRIAD_SPAWN_EGG = ITEMS.register("titanium_driad_spawn_egg",
//            () -> new SpawnEggItem();
//
//    public static final RegistryObject<Item> SHIELD_SPIDER_SPAWN_EGG = ITEMS.register("shield_spider_spawn_egg",
//            () -> new SpawnEggItem();

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
