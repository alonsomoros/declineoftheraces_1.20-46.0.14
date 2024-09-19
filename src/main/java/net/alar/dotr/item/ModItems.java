package net.alar.dotr.item;

import net.alar.dotr.DOTR;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DOTR.MOD_ID);

//    public static final RegistryObject<Item> TITANIUM_PETAL = ITEMS.register("titanium_petal",
//            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> TITANIUM_PETAL = ITEMS.register("titanium_petal",
            () -> new Item(new Item.Properties().tab(PestagnaCreativoMod.pestagnaCreativoMod)));
    public static final RegistryObject<Item> RAW_BALONCESTITA = ITEMS.register("raw_baloncestita",
            () -> new Item(new Item.Properties().tab(PestagnaCreativoMod.pestagnaCreativoMod)));
    public static final RegistryObject<Item> BALONCESTITA = ITEMS.register("baloncestita",
            () -> new Item(new Item.Properties().tab(PestagnaCreativoMod.pestagnaCreativoMod)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
