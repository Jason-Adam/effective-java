package org.functionalbits.item2;

import static org.functionalbits.item2.NyPizza.Size.SMALL;
import static org.functionalbits.item2.Pizza.Topping.ONION;
import static org.functionalbits.item2.Pizza.Topping.SAUSAGE;

public class Main {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }

    NyPizza pizza = new NyPizza.Builder(SMALL)
            .addTopping(SAUSAGE)
            .addTopping(ONION)
            .build();
}
