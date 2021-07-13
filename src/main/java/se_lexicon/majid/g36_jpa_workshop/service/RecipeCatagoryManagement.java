package se_lexicon.majid.g36_jpa_workshop.service;

import se_lexicon.majid.g36_jpa_workshop.model.Ingredient;
import se_lexicon.majid.g36_jpa_workshop.model.RecipeCategory;

import java.util.List;

public interface RecipeCatagoryManagement {

    RecipeCategory create();

    RecipeCategory save(RecipeCategory recipeCategory);

    RecipeCategory find(int id);

    RecipeCategory remove(int id);

    List<RecipeCategory> findAll();

    RecipeCategory edit(RecipeCategory recipeCategory);
}
