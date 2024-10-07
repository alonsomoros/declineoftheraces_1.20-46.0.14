package net.alar.dotr.item;

import net.alar.dotr.DOTR;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = DOTR.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PestagnaCreativoMod {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DOTR.MOD_ID);

    public static RegistryObject<CreativeModeTab> DOTR_TAB = CREATIVE_MODE_TABS.register("dotr_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHIELD_PIERCER_SWORD.get()))
                    .title(Component.literal("Decline of the Races")).build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }

}
