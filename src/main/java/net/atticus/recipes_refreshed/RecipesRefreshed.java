package net.atticus.recipes_refreshed;

import net.atticus.recipes_refreshed.config.ModConfigs;
import net.atticus.recipes_refreshed.recipe.ModRecipeManager;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecipesRefreshed implements ModInitializer {
    public static final String MOD_ID = "recipes_refreshed";
    public static final Logger LOGGER = LoggerFactory.getLogger("Recipes Refreshed");

    @Override
    public void onInitialize() {
        ModConfigs.registerConfigs();
        ModRecipeManager.loadConfiguredRecipes();
    }

}
