package net.alar.dotr.datagen;

import net.alar.dotr.block.ModBlocks;
import net.alar.dotr.item.ModItems;
import net.alar.dotr.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    private static final List<ItemLike> USHTIL_SMELTABLES = List.of(
            ModItems.RAW_USTHIL.get(), ModBlocks.USTHIL_ORE.get(), ModBlocks.DEEPSLATE_USTHIL_ORE.get());

    private static final List<ItemLike> IRONWOOD_LOGS = List.of(
            ModBlocks.IRONWOOD_LOG.get(), ModBlocks.STRIPPED_IRONWOOD_LOG.get());

    public ModRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, USHTIL_SMELTABLES, RecipeCategory.MISC, ModItems.USTHIL.get(), 0.5F, 100, "usthil");
        oreSmelting(pWriter, USHTIL_SMELTABLES, RecipeCategory.MISC, ModItems.USTHIL.get(), 0.5F, 100, "usthil");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.DIAMOND_SHARD.get())
                .unlockedBy(getHasName(ModItems.DIAMOND_SHARD.get()), has(ModItems.DIAMOND_SHARD.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_SHARD.get(), 9)
                .requires(Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> finishedRecipeConsumer, List<ItemLike> fromSmelting, RecipeCategory recipeCategory,
                                      ItemLike itemLike, float f,
                                      int i, String string) {
        oreCooking(finishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, fromSmelting,
                recipeCategory, itemLike, f, i,
                string, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> finishedRecipeConsumer,
                                      List<ItemLike> itemLikes, RecipeCategory recipeCategory,
                                      ItemLike itemLike, float f, int i, String string) {
        oreCooking(finishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, itemLikes, recipeCategory, itemLike, f, i, string, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> finishedRecipeConsumer,
                                     RecipeSerializer<? extends AbstractCookingRecipe> recipeSerializer,
                                     List<ItemLike> itemLikes, RecipeCategory recipeCategory, ItemLike itemLike,
                                     float f, int i, String string1, String string2) {
        for(ItemLike itemlike : itemLikes) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), recipeCategory, itemLike, f, i, recipeSerializer).group(string1).unlockedBy(getHasName(itemlike), has(itemlike)).save(finishedRecipeConsumer, getItemName(itemLike) + string2 + "_" + getItemName(itemlike));
        }

    }
}
