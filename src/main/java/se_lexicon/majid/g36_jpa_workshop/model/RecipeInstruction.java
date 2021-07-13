package se_lexicon.majid.g36_jpa_workshop.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;
//Class: RecipeInstruction
//a. Contains an id of type String. Generate the id as a UUID from Hibernate.
//b. Contains recipe instructions of type String
@Entity
public class RecipeInstruction {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String instructions;

    public RecipeInstruction() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
