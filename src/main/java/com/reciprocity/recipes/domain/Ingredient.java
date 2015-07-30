package com.reciprocity.recipes.domain;

/**
 * An ingredient is an 'identity' level item that is used in a recipe.
 */
public interface Ingredient {
    public SamplePreparation getPreparation();

    public String getIngredientName();
}
