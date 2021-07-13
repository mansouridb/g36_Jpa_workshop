package se_lexicon.majid.g36_jpa_workshop.service;

import se_lexicon.majid.g36_jpa_workshop.model.Ingredient;

import java.util.List;

public interface IngredientManagement {
    Ingredient create();

    Ingredient save(Ingredient ingredient);

    Ingredient find(int id);

    Ingredient remove(int id);

    List<Ingredient> findAll();

    Ingredient edit(Ingredient ingredient);
}

