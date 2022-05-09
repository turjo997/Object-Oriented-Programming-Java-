/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddemo;

/**
 *
 * @author User
 */
public abstract class Salad extends DietFood implements HealthyFood{

    
    String name,str;
    double calories , fat;
    
    @Override
    public void setName(String name){
      this.name = name;
    }
    
    @Override
    public String getName(){
      return name;
    }  
    
    public void setCalories(double calories){
      this.calories = calories;
    }
    
    @Override
    public double getCalories(){
      return calories;
    }  
    
    @Override
    public void setFat(double fat){
      this.fat = fat;
    }
    
    @Override
    public double getFat(){
      return fat;
    }  
    
    
    public void setNutritionValue(String str){
      this.str = str;
    }
    
    public String getNutritionValue(){
      return str;
    }
    
    @Override
    public void cholesterol(){
        System.out.println("Salad have 0% cholesterol");
    }

}
