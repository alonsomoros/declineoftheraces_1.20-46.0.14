package net.alar.dotr.fluid;

import net.alar.dotr.DOTR;
import net.alar.dotr.block.ModBlocks;
import net.alar.dotr.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, DOTR.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_VENOMOUS_WATER = FLUIDS.register("venomous_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.VENOMOUS_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_VENOMOUS_WATER = FLUIDS.register("flowing_venomous_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.VENOMOUS_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties VENOMOUS_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidsTypes.VENOMOUS_WATER_FLUID_TYPE, SOURCE_VENOMOUS_WATER, FLOWING_VENOMOUS_WATER)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(1)
            .block(ModBlocks.VENOMOUS_WATER_BLOCK)
            .bucket(ModItems.VENOMOUS_WATER_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
