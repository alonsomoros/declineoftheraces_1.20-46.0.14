package net.alar.dotr.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PestagnaCreativoMod {
    public static final CreativeModeTab pestagnaCreativoMod = new CreativeModeTab("Decline of the Races") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_PETAL.get());
        }
    };

}
