package net.alar.dotr.painting;

import net.alar.dotr.DOTR;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {

    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, DOTR.MOD_ID);

    public static final RegistryObject<PaintingVariant> ZELDA = PAINTING_VARIANTS.register("zelda",
            () -> new PaintingVariant(16,16));

     public static final RegistryObject<PaintingVariant> Y = PAINTING_VARIANTS.register("y",
            () -> new PaintingVariant(16,16));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }

}
