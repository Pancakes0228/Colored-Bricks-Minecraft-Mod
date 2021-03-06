package net.Pinary_Pi.coloredbricks.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> WHITE_BRICKS = register("white_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORANGE_BRICKS = register("orange_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PINK_BRICKS = register("pink_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_BRICKS = register("yellow_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIME_BRICKS = register("lime_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_BRICKS = register("green_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_BRICKS = register("light_blue_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CYAN_BRICKS = register("cyan_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_BRICKS = register("blue_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGENTA_BRICKS = register("magenta_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPLE_BRICKS = register("purple_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BROWN_BRICKS = register("brown_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAY_BRICKS = register("gray_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_GRAY_BRICKS = register("light_gray_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACK_BRICKS = register("black_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_BRICKS = register("red_bricks", () -> 
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));

    // Slabs

    public static final RegistryObject<SlabBlock> WHITE_BRICK_SLAB = register("white_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> ORANGE_BRICK_SLAB = register("orange_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> PINK_BRICK_SLAB = register("pink_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> YELLOW_BRICK_SLAB = register("yellow_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> LIME_BRICK_SLAB = register("lime_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> GREEN_BRICK_SLAB = register("green_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_BRICK_SLAB = register("light_blue_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> CYAN_BRICK_SLAB = register("cyan_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> BLUE_BRICK_SLAB = register("blue_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
            public static final RegistryObject<SlabBlock> MAGENTA_BRICK_SLAB = register("magenta_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> PURPLE_BRICK_SLAB = register("purple_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> BROWN_BRICK_SLAB = register("brown_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_BRICK_SLAB = register("light_gray_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> GRAY_BRICK_SLAB = register("gray_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> BLACK_BRICK_SLAB = register("black_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> RED_BRICK_SLAB = register("red_brick_slab", () -> 
            new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    
    // Stairs

    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> WHITE_BRICK_STAIRS = register("white_brick_stairs", () -> 
        new StairsBlock(WHITE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> ORANGE_BRICK_STAIRS = register("orange_brick_stairs", () -> 
        new StairsBlock(ORANGE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> PINK_BRICK_STAIRS = register("pink_brick_stairs", () -> 
        new StairsBlock(PINK_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> YELLOW_BRICK_STAIRS = register("yellow_brick_stairs", () -> 
        new StairsBlock(YELLOW_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> LIME_BRICK_STAIRS = register("lime_brick_stairs", () -> 
        new StairsBlock(LIME_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> GREEN_BRICK_STAIRS = register("green_brick_stairs", () -> 
        new StairsBlock(GREEN_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> LIGHT_BLUE_BRICK_STAIRS = register("light_blue_brick_stairs", () -> 
        new StairsBlock(LIGHT_BLUE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> CYAN_BRICK_STAIRS = register("cyan_brick_stairs", () -> 
        new StairsBlock(CYAN_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> BLUE_BRICK_STAIRS = register("blue_brick_stairs", () -> 
        new StairsBlock(BLUE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> MAGENTA_BRICK_STAIRS = register("magenta_brick_stairs", () -> 
        new StairsBlock(MAGENTA_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
        @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> PURPLE_BRICK_STAIRS = register("purple_brick_stairs", () -> 
        new StairsBlock(PURPLE_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> BROWN_BRICK_STAIRS = register("brown_brick_stairs", () -> 
        new StairsBlock(BROWN_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> LIGHT_GRAY_BRICK_STAIRS = register("light_gray_brick_stairs", () -> 
        new StairsBlock(LIGHT_GRAY_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> GRAY_BRICK_STAIRS = register("gray_brick_stairs", () -> 
        new StairsBlock(GRAY_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> BLACK_BRICK_STAIRS = register("black_brick_stairs", () -> 
        new StairsBlock(BLACK_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    @SuppressWarnings("deprecation")
    public static final RegistryObject<StairsBlock> RED_BRICK_STAIRS = register("red_brick_stairs", () -> 
        new StairsBlock(RED_BRICKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));

    // Wall

    public static final RegistryObject<WallBlock> WHITE_BRICK_WALL = register("white_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> ORANGE_BRICK_WALL = register("orange_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> PINK_BRICK_WALL = register("pink_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> YELLOW_BRICK_WALL = register("yellow_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> LIME_BRICK_WALL = register("lime_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> GREEN_BRICK_WALL = register("green_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_BRICK_WALL = register("light_blue_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> CYAN_BRICK_WALL = register("cyan_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> BLUE_BRICK_WALL = register("blue_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> MAGENTA_BRICK_WALL = register("magenta_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> PURPLE_BRICK_WALL = register("purple_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> BROWN_BRICK_WALL = register("brown_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_BRICK_WALL = register("light_gray_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> GRAY_BRICK_WALL = register("gray_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> BLACK_BRICK_WALL = register("black_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> RED_BRICK_WALL = register("red_brick_wall", () ->
        new WallBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).sound(SoundType.STONE)));

    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return ret;
    }
}