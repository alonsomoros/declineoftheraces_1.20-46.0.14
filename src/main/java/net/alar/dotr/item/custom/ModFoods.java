package net.alar.dotr.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_GOLIATH_RIBS =
            new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.3F)
//                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200), 0.3F)
                    .build();

    public static final FoodProperties ROASTED_GOLIATH_RIBS =
            new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationMod(0.8F)
                    .build();
}
