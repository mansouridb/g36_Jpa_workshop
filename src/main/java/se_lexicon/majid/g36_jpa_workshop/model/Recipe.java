package se_lexicon.majid.g36_jpa_workshop.model;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE})
    //@JoinColumn(name = "ingredient_id")
    private List<RecipeIngredient> recipeIngredients;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipeinstrustion_id")
    private RecipeInstruction recipeInstruction;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipecatagory_id")
    private RecipeCategory recipeCategory;

    public Recipe(int id) {
        this.id = id;
    }
}