package se_lexicon.majid.g36_jpa_workshop.model;

import java.util.Objects;

public class RecipeInstruction {
    private String instructionId;
    private String instructions;

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "instructions='" + instructions + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return Objects.equals(instructions, that.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructions);
    }

    public void setInstructionId(String instructionId) {
        this.instructionId = instructionId;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getInstructions() {
        return instructions;
    }

    public RecipeInstruction(String instructionId, String instructions) {
        this.instructionId = instructionId;
        this.instructions = instructions;
    }

    public RecipeInstruction() {
    }
}
