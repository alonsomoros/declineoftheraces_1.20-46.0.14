package net.alar.dotr.datagen;

import net.alar.dotr.DOTR;
import net.alar.dotr.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DOTR.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CLAITINE);
        simpleItem(ModItems.RAW_CLAITINE);
        simpleItem(ModItems.USTHIL);
        simpleItem(ModItems.RAW_USTHIL);
        simpleItem(ModItems.TITANIUM_PETAL);
        simpleItem(ModItems.EIGHT_BALL);
        simpleItem(ModItems.VENOMOUS_WATER_BUCKET);
        simpleItem(ModItems.IRONWOOD_STICK);
        simpleItem(ModItems.GOLIATH_FUR);
        simpleItem(ModItems.RAW_GOLIATH_RIBS);
        simpleItem(ModItems.ROASTED_GOLIATH_RIBS);
        simpleItem(ModItems.SHIELD_PIERCER_SWORD);
        simpleItem(ModItems.SHIELD_SPIDER_STING);
        simpleItem(ModItems.EXTRAHARD_EXOSKELETON);
        simpleItem(ModItems.DIAMOND_SHARD);
    }

    private ItemModelBuilder simpleItem (RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DOTR.MOD_ID, "item/" + item.getId().getPath()));
    }

}
