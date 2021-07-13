package se_lexicon.majid.g36_jpa_workshop.service;

import se_lexicon.majid.g36_jpa_workshop.model.Ingredient;
import se_lexicon.majid.g36_jpa_workshop.model.Recipe;

import java.util.List;

public interface RecipeManagement {
    Recipe create();

    Recipe save(Recipe recipe);

    Recipe find(int id);

    Recipe remove(int id);

    List<Recipe> findAll();

    Recipe edit(Recipe recipe);
}
