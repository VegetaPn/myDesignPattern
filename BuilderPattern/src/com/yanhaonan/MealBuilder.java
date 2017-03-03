package com.yanhaonan;

import com.yanhaonan.bean.*;

/**
 * Created by Vegeta on 3/3/17.
 */
public class MealBuilder {
    public Meal buildVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal buildNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
