package se_lexicon.majid.g36_jpa_workshop.service;

import se_lexicon.majid.g36_jpa_workshop.model.Ingredient;
import se_lexicon.majid.g36_jpa_workshop.model.RecipeIngredient;

import java.util.List;

public interface RecipeIngredientManagement {
    RecipeIngredient create();

    RecipeIngredient save(RecipeIngredient recipeIngredient);

    RecipeIngredient find(int id);

    RecipeIngredient remove(int id);

    List<RecipeIngredient> findAll();

    RecipeIngredient edit(RecipeIngredient recipeIngredient);
}
