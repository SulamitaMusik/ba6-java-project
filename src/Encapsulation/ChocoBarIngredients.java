package Encapsulation;

import java.util.Arrays;

public class ChocoBarIngredients {
    public static void main(String[] args) {
        String[]ingredients= {"sugar","cocao","butter","hazelnuts","coconut"};
        String IngredStr= Arrays.toString(ingredients);
        System.out.println("INGREDIENTS: "+(IngredStr.replaceAll("[\\[\\]\"]", "")));

        String[]types={"Milk Hazelnut Classic"," Dark Hazelnut Classic", "OatMilk Classic"," White Chocolate Classic"," Cookie & Creme Classic"};
        String typesStr=Arrays.toString(types);
        System.out.println(typesStr.replaceAll("[\\[\\]\"]", ""));
    }


}
