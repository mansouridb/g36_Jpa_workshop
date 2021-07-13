package se_lexicon.majid.g36_jpa_workshop.model;

import javax.persistence.*;

@Entity
public class RecipeCategory {
    @Id
    private int id;
    private String category;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "recipe_id");
    private Recipe recipe;

}
