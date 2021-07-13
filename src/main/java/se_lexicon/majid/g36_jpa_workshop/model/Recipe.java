package se_lexicon.majid.g36_jpa_workshop.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

//Contains an id of type int.
//b. Contains a recipe name of type String.
//c. Contains a collection of recipe ingredients. When you remove content from this
//collection make sure to implement automagical removal of this
//RecipeIngredient.
//d. Contains recipe instructions of type RecipeInstruction.
//e. Contains a collection of RecipeCategory.
@Entity
public class Recipe {
    @Id
    private int id;
    private String recipe;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE})
    private List<RecipeIngredient> recipeIngredients;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipeinstrustion_id")
    private RecipeInstruction recipeInstruction;

    @ManyToMany(
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "reciepeCategory",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "recipecategory_id")
    )
    private Set<RecipeCategory> recipeCategory;


    public Recipe(int id, RecipeInstruction recipeInstruction, Set<RecipeCategory> recipeCategory) {
        this.id = id;
        this.recipeInstruction = recipeInstruction;
        this.recipeCategory = recipeCategory;
    }

    public Recipe(RecipeInstruction recipeInstruction, Set<RecipeCategory> recipeCategory) {
        this.recipeInstruction = recipeInstruction;

        this.recipeCategory = recipeCategory;
    }


    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public List<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public RecipeInstruction getRecipeInstruction() {
        return recipeInstruction;
    }

    public void setRecipeInstruction(RecipeInstruction recipeInstruction) {
        this.recipeInstruction = recipeInstruction;
    }

    public Set<RecipeCategory> getRecipeCategory() {
        return recipeCategory;
    }

    public void setRecipeCategory(Set<RecipeCategory> recipeCategory) {
        this.recipeCategory = recipeCategory;
    }

    public Recipe() {

    }
}