/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nutrition;

/**
 *
 * @author alift
 */
public class FoodNutrition {
    private int calories;
    private int protein;
    private int carbs;
    private int fat;
    
    public FoodNutrition(){
        
    }
    
    public void setFoodNutrition(int calories, int protein, int carbs, int fat){
        if(calories < 0&& protein < 0 && carbs < 0 && fat < 0){
            System.out.println("Invalid Nutrition");
        }else{
            this.calories = calories;
            this.protein = protein;
            this.carbs = carbs;
            this.fat = fat;
        }
    }
    
    public int getCalories(){
        return calories;
    }
    
    public void setCalories(int calories){
        if (calories >= 0){
            this.calories = calories;
        }else{
            System.out.println("Invalid Calories");
        }
    }
    
    public int getProtein(){
        return protein;
    }
    
    public void setProtein(int protein){
        if (protein >= 0){
            this.protein = protein;
        }else{
            System.out.println("Invalid protein");
        }
    }
    
    public int getCarbs(){
        return carbs;
    }

    public void setCarbs(int carbs) {
        if (carbs >= 0){
            this.carbs = carbs;
        }else{
            System.out.println("Invalid Carbs");
        }
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        if (fat >= 0){
            this.fat = fat;
        }else{
            System.out.println("Invalid fat");
        }
    }
}
