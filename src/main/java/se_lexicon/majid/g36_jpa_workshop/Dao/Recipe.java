package se_lexicon.majid.g36_jpa_workshop.Dao;

import java.util.List;

public class Recipe {
    private  int recipeId ;
    private String recipeName ;
    private List<RecipeInstruction> recipeIngredients;
    private  RecipeInstruction instruction;
    private List<RecipeCategory> categories;

}
