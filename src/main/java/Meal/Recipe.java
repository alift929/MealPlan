/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Meal;

import Nutrition.FoodNutrition;
import java.util.List;

/**
 *
 * @author alift
 */
public class Recipe {
    private String recipeName;
    private FoodNutrition foodNutrition;
    private List<String> ingredients;
    private List<String> tools;
    private List<String> steps;

    public Recipe(String recipeName, FoodNutrition foodNutrition, List<String> ingredients, List<String> tools, List<String> steps) {
        this.recipeName = recipeName;
        this.foodNutrition = foodNutrition;
        this.ingredients = ingredients;
        this.tools = tools;
        this.steps = steps;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    
    public void showRecipeList(){
        System.out.printf("- %s",recipeName);
    }
    
    public void showRecipeDetails(){
        System.out.printf("Name: %s\n\n",recipeName);
        System.out.println("Ingredients:");
        int i=1;
        for(String ingredient: ingredients){
            System.out.printf("%d: %s\n", i, ingredient);
            i++;
        }
        System.out.println("\nTools:");
        i=1;
        for(String tool: tools){
            System.out.printf("%d: %s\n",i,tool);
            i++;
        }
        System.out.println("\nStep:");
        i=1;
        for(String step: steps){
            System.out.printf("%d: %s\n", i, step);
            i++;
        }
        foodNutrition.displayNutrition();
    }

    public int getFoodCalories(){
        return foodNutrition.getCalories();
    }
}
