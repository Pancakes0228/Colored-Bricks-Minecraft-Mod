package net.Pinary_Pi.coloredbricks.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> BRICKS_WHITE = forge("stone/white_block");
        public static final ITag.INamedTag<Block> BRICKS_ORANGE = forge("stone/orange_block");
        public static final ITag.INamedTag<Block> BRICKS_PINK = forge("stone/pink_block");
        public static final ITag.INamedTag<Block> BRICKS_YELLOW = forge("stone/yellow_block");
        public static final ITag.INamedTag<Block> BRICKS_LIME = forge("stone/lime_block");
        public static final ITag.INamedTag<Block> BRICKS_GREEN = forge("stone/green_block");
        public static final ITag.INamedTag<Block> BRICKS_LIGHT_BLUE = forge("stone/light_blue_block");
        public static final ITag.INamedTag<Block> BRICKS_CYAN = forge("stone/cyan_block");
        public static final ITag.INamedTag<Block> BRICKS_BLUE = forge("stone/blue");
        public static final ITag.INamedTag<Block> BRICKS_MAGENTA = forge("stone/magenta_block");
        public static final ITag.INamedTag<Block> BRICKS_PURPLE = forge("stone/purple_block");
        public static final ITag.INamedTag<Block> BRICKS_BROWN = forge("stone/brown_block");
        public static final ITag.INamedTag<Block> BRICKS_GRAY = forge("stone/gray_block");
        public static final ITag.INamedTag<Block> BRICKS_LIGHT_GRAY = forge("stone/light_gray_block");
        public static final ITag.INamedTag<Block> BRICKS_BLACK = forge("stone/black_block");
        public static final ITag.INamedTag<Block> BRICKS_RED = forge("stone/red_block");
        public static final ITag.INamedTag<Block> BRICK_SLAB_WHITE = forge("stone/white_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_ORANGE = forge("stone/orange_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_PINK = forge("stone/pink_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_YELLOW = forge("stone/yellow_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_LIME = forge("stone/lime_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_GREEN = forge("stone/green_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_LIGHT_BLUE = forge("stone/light_blue_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_CYAN = forge("stone/cyan_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_BLUE = forge("stone/blue_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_MAGENTA = forge("stone/magenta_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_PURPLE = forge("stone/purple_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_BROWN = forge("stone/brown_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_LIGHT_GRAY = forge("stone/light_gray_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_GRAY = forge("stone/gray_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_BLACK = forge("stone/black_slab");
        public static final ITag.INamedTag<Block> BRICK_SLAB_RED = forge("stone/red_slab");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_WHITE = forge("stone/white_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_ORANGE = forge("stone/orange_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_PINK = forge("stone/pink_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_YELLOW = forge("stone/yellow_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_LIME = forge("stone/lime_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_GREEN = forge("stone/green_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_LIGHT_BLUE = forge("stone/light_blue_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_CYAN = forge("stone/cyan_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_BLUE = forge("stone/blue_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_MAGENTA = forge("stone/magenta_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_PURPLE = forge("stone/purple_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_BROWN = forge("stone/brown_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_LIGHT_GRAY = forge("stone/light_gray_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_GRAY = forge("stone/gray_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_BLACK = forge("stone/black_stairs");
        public static final ITag.INamedTag<Block> BRICK_STAIRS_RED = forge("stone/red_stairs");
        public static final ITag.INamedTag<Block> BRICK_WALL_WHITE = forge("stone/white_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_ORANGE = forge("stone/orange_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_PINK = forge("stone/pink_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_YELLOW = forge("stone/yellow_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_LIME = forge("stone/lime_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_GREEN = forge("stone/green_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_LIGHT_BLUE = forge("stone/light_blue_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_CYAN = forge("stone/cyan_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_BLUE = forge("stone/blue_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_MAGENTA = forge("stone/magenta_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_PURPLE = forge("stone/purple_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_BROWN = forge("stone/brown_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_LIGHT_GRAY = forge("stone/light_gray_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_GRAY = forge("stone/gray_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_BLACK = forge("stone/black_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_RED = forge("stone/red_wall"); 
        public static final ITag.INamedTag<Block> BRICK_WALL_WHITE_MINECRAFT = minecraft("stone/white_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_ORANGE_MINECRAFT = minecraft("stone/orange_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_PINK_MINECRAFT = minecraft("stone/pink_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_YELLOW_MINECRAFT = minecraft("stone/yellow_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_LIME_MINECRAFT = minecraft("stone/lime_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_GREEN_MINECRAFT = minecraft("stone/green_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_LIGHT_BLUE_MINECRAFT = minecraft("stone/light_blue_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_CYAN_MINECRAFT = minecraft("stone/cyan_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_BLUE_MINECRAFT = minecraft("stone/blue_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_MAGENTA_MINECRAFT = minecraft("stone/magenta_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_PURPLE_MINECRAFT = minecraft("stone/purple_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_BROWN_MINECRAFT = minecraft("stone/brown_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_LIGHT_GRAY_MINECRAFT = minecraft("stone/light_gray_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_GRAY_MINECRAFT = minecraft("stone/gray_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_BLACK_MINECRAFT = minecraft("stone/black_wall");
        public static final ITag.INamedTag<Block> BRICK_WALL_RED_MINECRAFT = minecraft("stone/red_wall");
        
        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> minecraft(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("minecraft", path).toString());
        }
    }

    public static final class Items {
        // Block Items

        public static final ITag.INamedTag<Item> BRICKS_WHITE = forge("stone/white_block");
        public static final ITag.INamedTag<Item> BRICKS_ORANGE = forge("stone/orange_block");
        public static final ITag.INamedTag<Item> BRICKS_PINK = forge("stone/pink_block");
        public static final ITag.INamedTag<Item> BRICKS_YELLOW = forge("stone/yellow_block");
        public static final ITag.INamedTag<Item> BRICKS_LIME = forge("stone/lime_block");
        public static final ITag.INamedTag<Item> BRICKS_GREEN = forge("stone/green_block");
        public static final ITag.INamedTag<Item> BRICKS_LIGHT_BLUE = forge("stone/light_blue_block");
        public static final ITag.INamedTag<Item> BRICKS_CYAN = forge("stone/cyan_block");
        public static final ITag.INamedTag<Item> BRICKS_BLUE = forge("stone/blue_block");
        public static final ITag.INamedTag<Item> BRICKS_MAGENTA = forge("stone/magenta_block");
        public static final ITag.INamedTag<Item> BRICKS_PURPLE = forge("stone/purple_block");
        public static final ITag.INamedTag<Item> BRICKS_BROWN = forge("stone/brown_block");
        public static final ITag.INamedTag<Item> BRICKS_GRAY = forge("stone/gray_block");
        public static final ITag.INamedTag<Item> BRICKS_LIGHT_GRAY = forge("stone/light_gray_block");
        public static final ITag.INamedTag<Item> BRICKS_BLACK = forge("stone/black_block");
        public static final ITag.INamedTag<Item> BRICKS_RED = forge("stone/red_block");
        public static final ITag.INamedTag<Item> BRICK_SLAB_WHITE = forge("stone/white_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_ORANGE = forge("stone/orange_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_PINK = forge("stone/pink_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_YELLOW = forge("stone/yellow_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_LIME = forge("stone/lime_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_GREEN = forge("stone/green_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_LIGHT_BLUE = forge("stone/light_blue_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_CYAN = forge("stone/cyan_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_BLUE = forge("stone/blue_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_MAGENTA = forge("stone/magenta_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_PURPLE = forge("stone/purple_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_BROWN = forge("stone/brown_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_LIGHT_GRAY = forge("stone/light_gray_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_GRAY = forge("stone/gray_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_BLACK = forge("stone/black_slab");
        public static final ITag.INamedTag<Item> BRICK_SLAB_RED = forge("stone/red_slab");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_WHITE = forge("stone/white_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_ORANGE = forge("stone/orange_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_PINK = forge("stone/pink_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_YELLOW = forge("stone/yellow_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_LIME = forge("stone/lime_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_GREEN = forge("stone/green_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_LIGHT_BLUE = forge("stone/light_blue_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_CYAN = forge("stone/cyan_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_BLUE = forge("stone/blue_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_MAGENTA = forge("stone/magenta_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_PURPLE = forge("stone/purple_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_BROWN = forge("stone/brown_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_LIGHT_GRAY = forge("stone/light_gray_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_GRAY = forge("stone/gray_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_BLACK = forge("stone/black_stairs");
        public static final ITag.INamedTag<Item> BRICK_STAIRS_RED = forge("stone/red_stairs");
        public static final ITag.INamedTag<Item> BRICK_WALL_WHITE = forge("stone/white_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_ORANGE = forge("stone/orange_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_PINK = forge("stone/pink_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_YELLOW = forge("stone/yellow_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_LIME = forge("stone/lime_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_GREEN = forge("stone/green_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_LIGHT_BLUE = forge("stone/light_blue_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_CYAN = forge("stone/cyan_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_BLUE = forge("stone/blue_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_MAGENTA = forge("stone/magenta_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_PURPLE = forge("stone/purple_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_BROWN = forge("stone/brown_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_LIGHT_GRAY = forge("stone/light_gray_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_GRAY = forge("stone/gray_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_BLACK = forge("stone/black_wall");
        public static final ITag.INamedTag<Item> BRICK_WALL_RED = forge("stone/red_wall");

        // Item Items

        public static final ITag.INamedTag<Item> BRICK_WHITE = forge("stone/white_item");
        public static final ITag.INamedTag<Item> BRICK_ORANGE = forge("stone/orange_item");
        public static final ITag.INamedTag<Item> BRICK_PINK = forge("stone/pink_item");
        public static final ITag.INamedTag<Item> BRICK_YELLOW = forge("stone/yellow_item");
        public static final ITag.INamedTag<Item> BRICK_LIME = forge("stone/lime_item");
        public static final ITag.INamedTag<Item> BRICK_GREEN = forge("stone/green_item");
        public static final ITag.INamedTag<Item> BRICK_LIGHT_BLUE = forge("stone/light_blue_item");
        public static final ITag.INamedTag<Item> BRICK_CYAN = forge("stone/cyan_item");
        public static final ITag.INamedTag<Item> BRICK_BLUE = forge("stone/blue");
        public static final ITag.INamedTag<Item> BRICK_MAGENTA = forge("stone/magenta_item");
        public static final ITag.INamedTag<Item> BRICK_PURPLE = forge("stone/purple_item");
        public static final ITag.INamedTag<Item> BRICK_BROWN = forge("stone/brown_item");
        public static final ITag.INamedTag<Item> BRICK_GRAY = forge("stone/gray_item");
        public static final ITag.INamedTag<Item> BRICK_LIGHT_GRAY = forge("stone/light_gray_item");
        public static final ITag.INamedTag<Item> BRICK_BLACK = forge("stone/black_item");
        public static final ITag.INamedTag<Item> BRICK_RED = forge("stone/red_item");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }
    }
}
