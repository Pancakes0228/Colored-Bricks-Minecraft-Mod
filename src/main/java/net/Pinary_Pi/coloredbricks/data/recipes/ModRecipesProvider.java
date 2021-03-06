package net.Pinary_Pi.coloredbricks.data.recipes;

import java.util.function.Consumer;

import net.Pinary_Pi.coloredbricks.coloredbricks;
import net.Pinary_Pi.coloredbricks.setup.ModBlocks;
import net.Pinary_Pi.coloredbricks.setup.ModItems;
import net.Pinary_Pi.coloredbricks.setup.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

public class ModRecipesProvider extends RecipeProvider {
    public ModRecipesProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        // Brick Item Recipes

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.WHITE_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.ORANGE_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.PINK_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.YELLOW_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.LIME_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.GREEN_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.LIGHT_BLUE_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.CYAN_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.BLUE_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.MAGENTA_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.PURPLE_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.BROWN_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.LIGHT_GRAY_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.GRAY_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.BLACK_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.RED_BRICK.get())
        .addIngredient(Tags.Items.INGOTS_BRICK)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(Tags.Items.INGOTS_BRICK))
        .build(consumer);

        // Brick Block Recipies

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_BRICKS.get())
        .key('#', ModTags.Items.BRICK_WHITE)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_WHITE))
        .build(consumer, coloredbricks.getId("white_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_BRICKS.get())
        .key('#', ModTags.Items.BRICK_ORANGE)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_ORANGE))
        .build(consumer, coloredbricks.getId("orange_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_BRICKS.get())
        .key('#', ModTags.Items.BRICK_PINK)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_PINK))
        .build(consumer, coloredbricks.getId("pink_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_BRICKS.get())
        .key('#', ModTags.Items.BRICK_YELLOW)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_BRICKS.get())
        .key('#', ModTags.Items.BRICK_LIME)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_LIME))
        .build(consumer, coloredbricks.getId("lime_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_BRICKS.get())
        .key('#', ModTags.Items.BRICK_GREEN)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_GREEN))
        .build(consumer, coloredbricks.getId("green_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_BRICKS.get())
        .key('#', ModTags.Items.BRICK_LIGHT_BLUE)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_BRICKS.get())
        .key('#', ModTags.Items.BRICK_CYAN)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_CYAN))
        .build(consumer, coloredbricks.getId("cyan_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_BRICKS.get())
        .key('#', ModTags.Items.BRICK_BLUE)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_BLUE))
        .build(consumer, coloredbricks.getId("blue_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_BRICKS.get())
        .key('#', ModTags.Items.BRICK_MAGENTA)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_BRICKS.get())
        .key('#', ModTags.Items.BRICK_PURPLE)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_PURPLE))
        .build(consumer, coloredbricks.getId("purple_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_BRICKS.get())
        .key('#', ModTags.Items.BRICK_BROWN)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_BROWN))
        .build(consumer, coloredbricks.getId("brown_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_BRICKS.get())
        .key('#', ModTags.Items.BRICK_LIGHT_GRAY)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GRAY_BRICKS.get())
        .key('#', ModTags.Items.BRICK_GRAY)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_GRAY))
        .build(consumer, coloredbricks.getId("gray_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_BRICKS.get())
        .key('#', ModTags.Items.BRICK_BLACK)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_BLACK))
        .build(consumer, coloredbricks.getId("black_bricks_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_BRICKS.get())
        .addIngredient(Blocks.BRICKS)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(Blocks.BRICKS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_BRICKS.get())
        .key('#', ModTags.Items.BRICK_RED)
        .patternLine("##")
        .patternLine("##")
        .addCriterion("has item", hasItem(ModTags.Items.BRICK_RED))
        .build(consumer, coloredbricks.getId("red_bricks_alt"));

        // Slabs

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_WHITE)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
        .build(consumer, coloredbricks.getId("white_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_ORANGE)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
        .build(consumer, coloredbricks.getId("orange_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_PINK)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
        .build(consumer, coloredbricks.getId("pink_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_YELLOW)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIME)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
        .build(consumer, coloredbricks.getId("lime_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_GREEN)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
        .build(consumer, coloredbricks.getId("green_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIGHT_BLUE)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_CYAN)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
        .build(consumer, coloredbricks.getId("cyan_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_BLUE)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
        .build(consumer, coloredbricks.getId("blue_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_MAGENTA)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_PURPLE)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
        .build(consumer, coloredbricks.getId("purple_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_BROWN)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
        .build(consumer, coloredbricks.getId("brown_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIGHT_GRAY)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GRAY_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_GRAY)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
        .build(consumer, coloredbricks.getId("gray_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_BLACK)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
        .build(consumer, coloredbricks.getId("black_brick_slab_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_BRICK_SLAB.get())
        .addIngredient(Blocks.BRICK_SLAB)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(Blocks.BRICK_SLAB))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_BRICK_SLAB.get(), 6)
        .key('#', ModTags.Items.BRICKS_RED)
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
        .build(consumer, coloredbricks.getId("red_brick_slab_alt"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
            .build(consumer, coloredbricks.getId("white_brick_slab_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
            .build(consumer, coloredbricks.getId("orange_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
            .build(consumer, coloredbricks.getId("pink_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_brick_slab_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
            .build(consumer, coloredbricks.getId("lime_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
            .build(consumer, coloredbricks.getId("green_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
            .build(consumer, coloredbricks.getId("cyan_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
            .build(consumer, coloredbricks.getId("blue_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
            .build(consumer, coloredbricks.getId("purple_brick_slab_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
            .build(consumer, coloredbricks.getId("brown_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
            .build(consumer, coloredbricks.getId("gray_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
            .build(consumer, coloredbricks.getId("black_brick_slab_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_BRICK_SLAB.get(), 2)
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
            .build(consumer, coloredbricks.getId("red_brick_slab_stonecutter"));

        // Stairs 

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_WHITE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
        .build(consumer, coloredbricks.getId("white_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_ORANGE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
        .build(consumer, coloredbricks.getId("orange_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_PINK)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
        .build(consumer, coloredbricks.getId("pink_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_YELLOW)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_LIME)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
        .build(consumer, coloredbricks.getId("lime_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_GREEN)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
        .build(consumer, coloredbricks.getId("green_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_LIGHT_BLUE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_CYAN)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
        .build(consumer, coloredbricks.getId("cyan_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_BLUE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
        .build(consumer, coloredbricks.getId("blue_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_MAGENTA)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_PURPLE)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
        .build(consumer, coloredbricks.getId("purple_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_BROWN)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
        .build(consumer, coloredbricks.getId("brown_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_LIGHT_GRAY)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_BLACK)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
        .build(consumer, coloredbricks.getId("black_brick_stairs_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_BRICK_STAIRS.get())
        .addIngredient(Blocks.BRICK_STAIRS)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(Blocks.BRICK_STAIRS))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_BRICK_STAIRS.get(), 4)
        .key('#', ModTags.Items.BRICKS_RED)
        .patternLine("#  ")
        .patternLine("## ")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
        .build(consumer, coloredbricks.getId("red_brick_stairs_alt"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
            .build(consumer, coloredbricks.getId("white_brick_stairs_stonecutter"));
            
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
            .build(consumer, coloredbricks.getId("orange_brick_stairs_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
            .build(consumer, coloredbricks.getId("pink_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
            .build(consumer, coloredbricks.getId("lime_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
            .build(consumer, coloredbricks.getId("green_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
            .build(consumer, coloredbricks.getId("cyan_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
            .build(consumer, coloredbricks.getId("blue_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
            .build(consumer, coloredbricks.getId("purple_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
            .build(consumer, coloredbricks.getId("brown_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
            .build(consumer, coloredbricks.getId("gray_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
            .build(consumer, coloredbricks.getId("black_brick_stairs_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_BRICK_STAIRS.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
            .build(consumer, coloredbricks.getId("red_brick_stairs_stonecutter"));
            
        // Walls

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.WHITE_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_WHITE)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.WHITE_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_WHITE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
        .build(consumer, coloredbricks.getId("white_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.ORANGE_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_ORANGE)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.ORANGE_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_ORANGE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
        .build(consumer, coloredbricks.getId("orange_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PINK_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_PINK)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PINK_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_PINK)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
        .build(consumer, coloredbricks.getId("pink_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.YELLOW_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_YELLOW)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.YELLOW_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_YELLOW)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
        .build(consumer, coloredbricks.getId("yellow_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIME_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_LIME)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIME_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIME)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
        .build(consumer, coloredbricks.getId("lime_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GREEN_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_GREEN)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GREEN_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_GREEN)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
        .build(consumer, coloredbricks.getId("green_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_BLUE_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_LIGHT_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_BLUE_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIGHT_BLUE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
        .build(consumer, coloredbricks.getId("light_blue_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.CYAN_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_CYAN)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.CYAN_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_CYAN)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
        .build(consumer, coloredbricks.getId("cyan_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLUE_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_BLUE)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLUE_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_BLUE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
        .build(consumer, coloredbricks.getId("blue_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.MAGENTA_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_MAGENTA)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.MAGENTA_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_MAGENTA)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
        .build(consumer, coloredbricks.getId("magenta_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.PURPLE_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_PURPLE)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.PURPLE_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_PURPLE)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
        .build(consumer, coloredbricks.getId("purple_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BROWN_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_BROWN)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BROWN_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_BROWN)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
        .build(consumer, coloredbricks.getId("brown_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.LIGHT_GRAY_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_LIGHT_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.LIGHT_GRAY_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_LIGHT_GRAY)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
        .build(consumer, coloredbricks.getId("light_gray_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.GRAY_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_GRAY)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.GRAY_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_GRAY)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
        .build(consumer, coloredbricks.getId("gray_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.BLACK_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_BLACK)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.BLACK_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_BLACK)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
        .build(consumer, coloredbricks.getId("black_brick_wall_alt"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.RED_BRICK_WALL.get())
        .addIngredient(Blocks.BRICK_WALL)
        .addIngredient(Tags.Items.DYES_RED)
        .addCriterion("has item", hasItem(Blocks.BRICK_WALL))
        .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RED_BRICK_WALL.get(), 6)
        .key('#', ModTags.Items.BRICKS_RED)
        .patternLine("###")
        .patternLine("###")
        .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
        .build(consumer, coloredbricks.getId("red_brick_wall_alt")); 

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_WHITE), 
            ModBlocks.WHITE_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_WHITE))
            .build(consumer, coloredbricks.getId("white_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_ORANGE), 
            ModBlocks.ORANGE_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_ORANGE))
            .build(consumer, coloredbricks.getId("orange_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PINK), 
            ModBlocks.PINK_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PINK))
            .build(consumer, coloredbricks.getId("pink_brick_wall_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_YELLOW), 
            ModBlocks.YELLOW_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_YELLOW))
            .build(consumer, coloredbricks.getId("yellow_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIME), 
            ModBlocks.LIME_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIME))
            .build(consumer, coloredbricks.getId("lime_brick_wall_stonecutter"));
        
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GREEN), 
            ModBlocks.GREEN_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GREEN))
            .build(consumer, coloredbricks.getId("green_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_BLUE), 
            ModBlocks.LIGHT_BLUE_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_BLUE))
            .build(consumer, coloredbricks.getId("light_blue_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_CYAN), 
            ModBlocks.CYAN_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_CYAN))
            .build(consumer, coloredbricks.getId("cyan_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLUE), 
            ModBlocks.BLUE_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLUE))
            .build(consumer, coloredbricks.getId("blue_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_MAGENTA), 
            ModBlocks.MAGENTA_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_MAGENTA))
            .build(consumer, coloredbricks.getId("magenta_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_PURPLE), 
            ModBlocks.PURPLE_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_PURPLE))
            .build(consumer, coloredbricks.getId("purple_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BROWN), 
            ModBlocks.BROWN_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BROWN))
            .build(consumer, coloredbricks.getId("brown_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_LIGHT_GRAY), 
            ModBlocks.LIGHT_GRAY_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_LIGHT_GRAY))
            .build(consumer, coloredbricks.getId("light_gray_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_GRAY), 
            ModBlocks.GRAY_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_GRAY))
            .build(consumer, coloredbricks.getId("gray_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_BLACK), 
            ModBlocks.BLACK_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_BLACK))
            .build(consumer, coloredbricks.getId("black_brick_wall_stonecutter"));

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromTag(
            ModTags.Items.BRICKS_RED), 
            ModBlocks.RED_BRICK_WALL.get())
            .addCriterion("has item", hasItem(ModTags.Items.BRICKS_RED))
            .build(consumer, coloredbricks.getId("red_brick_wall_stonecutter"));
    }
}
