package se_lexicon.majid.g36_jpa_workshop.model;

import javax.persistence.*;
// remove unused imports: Alt + Ctrl + O

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String ingredient;
    public Ingredient() {
    }

    public Ingredient(long id, String ingredient) {
        this.id = id;
        this.ingredient = ingredient;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}



