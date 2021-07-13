package se_lexicon.majid.g36_jpa_workshop.service;

import se_lexicon.majid.g36_jpa_workshop.model.Recipe;
import se_lexicon.majid.g36_jpa_workshop.model.RecipeInstruction;

import java.util.List;

public interface RecipeInstructionManagement {
    RecipeInstruction create();

    Recipe save(RecipeInstruction recipeInstruction);

    RecipeInstruction find(int id);

    RecipeInstruction remove(int id);

    List<RecipeInstruction> findAll();

    RecipeInstruction edit(RecipeInstruction recipeInstruction);
}
