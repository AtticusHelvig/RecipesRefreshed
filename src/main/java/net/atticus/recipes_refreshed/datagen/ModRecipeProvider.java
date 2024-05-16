package net.atticus.recipes_refreshed.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.atticus.recipes_refreshed.config.ModConfigs;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> FROM_DEEPSLATE = List.of(
            Blocks.CHISELED_DEEPSLATE,
            Blocks.COBBLED_DEEPSLATE,
            Blocks.COBBLED_DEEPSLATE_SLAB,
            Blocks.COBBLED_DEEPSLATE_STAIRS,
            Blocks.COBBLED_DEEPSLATE_WALL,
            Blocks.DEEPSLATE_BRICKS,
            Blocks.DEEPSLATE_BRICK_SLAB,
            Blocks.DEEPSLATE_BRICK_STAIRS,
            Blocks.DEEPSLATE_BRICK_WALL,
            Blocks.DEEPSLATE_TILES,
            Blocks.DEEPSLATE_TILE_SLAB,
            Blocks.DEEPSLATE_TILE_STAIRS,
            Blocks.DEEPSLATE_TILE_WALL,
            Blocks.POLISHED_DEEPSLATE,
            Blocks.POLISHED_DEEPSLATE_SLAB,
            Blocks.POLISHED_DEEPSLATE_STAIRS,
            Blocks.POLISHED_DEEPSLATE_WALL);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        if (ModConfigs.DEEPSLATE_STONECUTTING) {
            for (ItemConvertible output : FROM_DEEPSLATE) {
                offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, output, Blocks.DEEPSLATE);
            }
        }
    }

}
