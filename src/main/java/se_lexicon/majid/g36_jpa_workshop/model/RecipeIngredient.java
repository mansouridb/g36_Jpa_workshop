package se_lexicon.majid.g36_jpa_workshop.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class RecipeIngredient extends Recipe {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;
    private double amount;
    private Measurement measurement;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    public RecipeIngredient(String id, Ingredient ingredient, double amount, Measurement measurement, Recipe recipe) {
        super(id, recipeInstruction, recipeCategory);
        this.id = id;
        this.ingredient = ingredient;
        this.amount = amount;
        this.measurement = measurement;
        this.recipe = recipe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

}
