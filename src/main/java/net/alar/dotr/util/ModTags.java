package net.alar.dotr.util;

import net.alar.dotr.DOTR;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> CLAITINE_ORES = tag("claitine_ores");
        public static final TagKey<Block> USTHIL_ORES = tag("usthil_ores");
        public static final TagKey<Block> IRONWOOD_LOGS = tag("ironwood_logs");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(DOTR.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> EIGHT_BALL = tag("eight_ball");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(DOTR.MOD_ID, name));
        }
    }
}
