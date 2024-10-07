package net.alar.dotr.item;

import net.alar.dotr.DOTR;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DOTR.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PestagnaCreativoMod {
    public static CreativeModeTab MOD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MOD_TAB = event.registerCreativeModeTab(
                new ResourceLocation(DOTR.MOD_ID, "dotr_tab"),
                builder ->
                        builder.icon(() -> new ItemStack(ModItems.SHIELD_PIERCER_SWORD.get()))
                                .title(Component.literal("Decline of the Races")).build()
        );
    }

}
