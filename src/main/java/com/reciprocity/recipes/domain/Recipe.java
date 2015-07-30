package com.reciprocity.recipes.domain;

import java.io.PrintStream;
import java.util.List;

/**
 * A recipe is a combination of 'parental' reagents and the instructions
 */
public interface Recipe {

    List<Ingredient> getIngredients();

    List<Instruction> getInstructions();

    void printRecipe(PrintStream out);


}
