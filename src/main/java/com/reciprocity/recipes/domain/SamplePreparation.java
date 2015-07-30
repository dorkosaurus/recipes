package com.reciprocity.recipes.domain;

public interface SamplePreparation {

    public Double getQuantity();

    public UNIT getQuantityUnit();

    public Double getConcentration();

    public UNIT getConcentrationUnit();

    public enum UNIT {
        MILLILITERS,
        GRAMS,
        KILOGRAMS,
        POUNDS,
        LITERS,
        CUPS,
        TABLESPOONS,
        TEASPOONS,
        OUNCES,
        WHOLE
    }
}
