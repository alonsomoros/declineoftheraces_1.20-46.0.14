package net.alar.dotr.datagen;

import net.alar.dotr.block.ModBlocks;
import net.alar.dotr.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TECTITE.get());
        this.dropSelf(ModBlocks.TECTITE_STAIRS.get());
        this.dropSelf(ModBlocks.TECTITE_SLAB.get());
        this.dropSelf(ModBlocks.TECTITE_WALL.get());
        this.dropSelf(ModBlocks.SMOOTH_TECTITE.get());
        this.dropSelf(ModBlocks.SMOOTH_TECTITE_STAIRS.get());
        this.dropSelf(ModBlocks.SMOOTH_TECTITE_SLAB.get());
        this.dropSelf(ModBlocks.TECTITE_BRICKS.get());
        this.dropSelf(ModBlocks.TECTITE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.TECTITE_BRICKS_SLAB.get());
        this.dropSelf(ModBlocks.TECTITE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.NATURAL_TECTITE.get());
        this.dropSelf(ModBlocks.NATURAL_TECTITE_STAIRS.get());
        this.dropSelf(ModBlocks.NATURAL_TECTITE_SLAB.get());
        this.dropSelf(ModBlocks.NATURAL_TECTITE_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_TECTITE.get());
        this.dropSelf(ModBlocks.TECTITE_PILLAR.get());
        this.dropSelf(ModBlocks.TECTITE_PILLAR_CORNER.get());
        this.dropSelf(ModBlocks.APOPHYLLITE.get());
        this.dropSelf(ModBlocks.APOPHYLLITE_STAIRS.get());
        this.dropSelf(ModBlocks.APOPHYLLITE_SLAB.get());
        this.dropSelf(ModBlocks.APOPHYLLITE_WALL.get());
        this.dropSelf(ModBlocks.SMOOTH_APOPHYLLITE.get());
        this.dropSelf(ModBlocks.SMOOTH_APOPHYLLITE_STAIRS.get());
        this.dropSelf(ModBlocks.SMOOTH_APOPHYLLITE_SLAB.get());
        this.dropSelf(ModBlocks.APOPHYLLITE_BRICKS.get());
        this.dropSelf(ModBlocks.APOPHYLLITE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.APOPHYLLITE_BRICKS_SLAB.get());
        this.dropSelf(ModBlocks.APOPHYLLITE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.NATURAL_APOPHYLLITE.get());
        this.dropSelf(ModBlocks.NATURAL_APOPHYLLITE_STAIRS.get());
        this.dropSelf(ModBlocks.NATURAL_APOPHYLLITE_SLAB.get());
        this.dropSelf(ModBlocks.NATURAL_APOPHYLLITE_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_APOPHYLLITE.get());
        this.dropSelf(ModBlocks.APOPHYLLITE_PILLAR.get());
        this.dropSelf(ModBlocks.IRONFORGED_TECTITE.get());
        this.dropSelf(ModBlocks.IRONFORGED_TECTITE_STAIRS.get());
        this.dropSelf(ModBlocks.IRONFORGED_TECTITE_SLAB.get());
        this.dropSelf(ModBlocks.IRONFORGED_TECTITE_WALL.get());
        this.dropSelf(ModBlocks.IRONFORGED_SMOOTH_TECTITE.get());
        this.dropSelf(ModBlocks.IRONFORGED_SMOOTH_TECTITE_STAIRS.get());
        this.dropSelf(ModBlocks.IRONFORGED_SMOOTH_TECTITE_SLAB.get());
        this.dropSelf(ModBlocks.IRONFORGED_TECTITE_BRICKS.get());
        this.dropSelf(ModBlocks.IRONFORGED_TECTITE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.IRONFORGED_TECTITE_BRICKS_SLAB.get());
        this.dropSelf(ModBlocks.IRONFORGED_TECTITE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.IRONFORGED_CHISELED_TECTITE.get());
        this.dropSelf(ModBlocks.IRONFORGED_TECTITE_PILLAR.get());
        this.dropSelf(ModBlocks.GOLDFORGED_TECTITE.get());
        this.dropSelf(ModBlocks.GOLDFORGED_TECTITE_STAIRS.get());
        this.dropSelf(ModBlocks.GOLDFORGED_TECTITE_SLAB.get());
        this.dropSelf(ModBlocks.GOLDFORGED_TECTITE_WALL.get());
        this.dropSelf(ModBlocks.GOLDFORGED_SMOOTH_TECTITE.get());
        this.dropSelf(ModBlocks.GOLDFORGED_SMOOTH_TECTITE_STAIRS.get());
        this.dropSelf(ModBlocks.GOLDFORGED_SMOOTH_TECTITE_SLAB.get());
        this.dropSelf(ModBlocks.GOLDFORGED_TECTITE_BRICKS.get());
        this.dropSelf(ModBlocks.GOLDFORGED_TECTITE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.GOLDFORGED_TECTITE_BRICKS_SLAB.get());
        this.dropSelf(ModBlocks.GOLDFORGED_TECTITE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.GOLDFORGED_CHISELED_TECTITE.get());
        this.dropSelf(ModBlocks.GOLDFORGED_TECTITE_PILLAR.get());
        this.dropSelf(ModBlocks.GOLDFORGED_APOPHYLLITE.get());
        this.dropSelf(ModBlocks.GOLDFORGED_APOPHYLLITE_STAIRS.get());
        this.dropSelf(ModBlocks.GOLDFORGED_APOPHYLLITE_SLAB.get());
        this.dropSelf(ModBlocks.GOLDFORGED_APOPHYLLITE_WALL.get());
        this.dropSelf(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE.get());
        this.dropSelf(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE_STAIRS.get());
        this.dropSelf(ModBlocks.GOLDFORGED_SMOOTH_APOPHYLLITE_SLAB.get());
        this.dropSelf(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS.get());
        this.dropSelf(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_SLAB.get());
        this.dropSelf(ModBlocks.GOLDFORGED_APOPHYLLITE_BRICKS_WALL.get());

        this.add(ModBlocks.USTHIL_ORE.get(),
                block -> createCopperOreLikeDrops(ModBlocks.USTHIL_ORE.get(), ModItems.USTHIL.get()));

        this.add(ModBlocks.DEEPSLATE_USTHIL_ORE.get(),
                block -> createCopperOreLikeDrops(ModBlocks.DEEPSLATE_USTHIL_ORE.get(), ModItems.USTHIL.get()));

        this.add(ModBlocks.CLAITINE_ORE.get(),
                block -> createCopperOreLikeDrops(ModBlocks.CLAITINE_ORE.get(), ModItems.CLAITINE.get()));

        this.add(ModBlocks.DEEPSLATE_CLAITINE_ORE.get(),
                block -> createCopperOreLikeDrops(ModBlocks.DEEPSLATE_CLAITINE_ORE.get(), ModItems.CLAITINE.get()));

    }
    protected LootTable.Builder createCopperOreLikeDrops(Block block, Item item) {
        return createSilkTouchDispatchTable(block, this.applyExplosionDecay(block, LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
