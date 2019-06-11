package cn.zenyatta.learn.designpattern.builder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class MealBuilderTest {

    @Test
    public void prepareVegMeal() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
    }

    @Test
    public void prepareNonVegMeal() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("\nTotal Cost: " + nonVegMeal.getCost());
    }
}