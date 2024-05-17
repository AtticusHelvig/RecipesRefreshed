package net.atticus.recipes_refreshed.recipe;

import com.google.gson.JsonObject;

import net.minecraft.util.Identifier;

public interface RecipeJson {
    public Identifier getIdentifier();

    public JsonObject getRecipe();
}
