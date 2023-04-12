/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schedule;

import Meal.Recipe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alift
 */
public class Schedule {
    
    private String date;
    private List<Recipe> recipes;

    public Schedule(String date) {
        this.date = date;
        recipes = new ArrayList<Recipe>();
    }

    public String getDate() {
        return date;
    }
    
    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }
    
    public void removeRecipe(Recipe recipe){
        recipes.removeIf(element -> element.getRecipeName().equals(recipe.getRecipeName()));
    }
    
    public void clearRecipe(){
        recipes.clear();
    }
    
    public Recipe searchRecipeInSchedule(String recipeName){
        Recipe searchedRecipe = null;
        boolean searchStatus = false;
        for(Recipe recipe: recipes){
            if(recipe.getRecipeName().equals(recipeName)){
                searchedRecipe = recipe;
                searchStatus = true;
                break;
            }
        }
        if(searchStatus == false){
            System.out.println("Recipe not found");
        }
        return searchedRecipe;
    }
    
    public void showScheduleMinima(){
        for(Recipe recipe: recipes){
            recipe.showRecipeMinima();
            System.out.println();
        }
    }
    
    public void showScheduleDetails(){
        for(Recipe recipe: recipes){
            recipe.showRecipeDetails();
            System.out.println();
        }
    }
}
