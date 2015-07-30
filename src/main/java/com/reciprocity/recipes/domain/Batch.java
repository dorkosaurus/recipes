package com.reciprocity.recipes.domain;

import java.util.List;

/**
 * A batch refers to the execution of a recipe.  This is a lot level concept.
 */
public interface Batch {

    List<Ingredient> getIngredientsUsed();

    List<Instruction> getInstructionsExecuted();


}
