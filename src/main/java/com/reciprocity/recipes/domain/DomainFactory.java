package com.reciprocity.recipes.domain;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class DomainFactory {
    static final String[] steps = new String[]{
            "step 1",
            "step 2",
            "step 3"
    };

    public static Recipe createRecipe(final List<Instruction> instructions, final List<Ingredient> ingredients) {
        Recipe recipe = new Recipe() {
            public List<Ingredient> getIngredients() {
                return ingredients;
            }

            public List<Instruction> getInstructions() {
                return instructions;
            }

            public void printRecipe(PrintStream out) {
                try {
                    out.write("### INSTRUCTIONS ###\n".getBytes());
                    for (Instruction instruction : getInstructions()) {
                        out.write(instruction.getInstructionText().getBytes());
                        out.write("\n".getBytes());
                    }

                    out.write("### INGREDIENTS ###\n".getBytes());
                    for (Ingredient ingredient : getIngredients()) {
                        out.write(ingredient.getIngredientName().getBytes());
                        out.write("\n".getBytes());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        return recipe;
    }

    public static List<Instruction> createInstructions() {
        final List<Instruction> instructions = new ArrayList<Instruction>();
        for (final String instruction : steps) {
            Instruction instr = new Instruction() {
                public String getInstructionText() {
                    return instruction;
                }
            };
            instructions.add(instr);
        }
        return instructions;

    }


    public static List<Ingredient> createIngredients() {
        final List<Ingredient> ingredients = new ArrayList<Ingredient>();
        Ingredient one = new Ingredient() {
            public SamplePreparation getPreparation() {
                return new SamplePreparation() {
                    public Double getQuantity() {
                        return new Double(2);
                    }

                    public UNIT getQuantityUnit() {
                        return UNIT.WHOLE;
                    }

                    public Double getConcentration() {
                        return null;
                    }

                    public UNIT getConcentrationUnit() {
                        return null;
                    }
                };
            }

            public String getIngredientName() {
                return "Tomato";
            }
        };


        Ingredient two = new Ingredient() {
            public SamplePreparation getPreparation() {
                return new SamplePreparation() {
                    public Double getQuantity() {
                        return new Double(3);
                    }

                    public UNIT getQuantityUnit() {
                        return UNIT.TABLESPOONS;
                    }

                    public Double getConcentration() {
                        return null;
                    }

                    public UNIT getConcentrationUnit() {
                        return null;
                    }
                };
            }

            public String getIngredientName() {
                return "Mustard Powder";
            }
        };
        ingredients.add(one);
        ingredients.add(two);
        return ingredients;
    }


}
