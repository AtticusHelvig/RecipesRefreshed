package net.atticus.recipes_refreshed;

import net.atticus.recipes_refreshed.config.ModConfigs;
import net.fabricmc.api.ModInitializer;

public class RecipesRefreshed implements ModInitializer {
    public static final String MOD_ID = "recipes_refreshed";

    @Override
    public void onInitialize() {
        ModConfigs.registerConfigs();
    }

}
