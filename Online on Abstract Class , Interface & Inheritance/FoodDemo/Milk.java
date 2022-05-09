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
public abstract class Milk implements HealthyFood{
    
    String name,str;
    double calories , fat;
    
    public void setName(String name){
      this.name = name;
    }
    
    public String getName(){
      return name;
    }  
    
    public void setCalories(double calories){
      this.calories = calories;
    }
    
    public double getCalories(){
      return calories;
    }  
    
    public void setFat(double fat){
      this.fat = fat;
    }
    
    public double getFat(){
      return fat;
    }  
    
    public void setNutritionValue(String str){
      this.str = str;
    }
    
    public String getNutritionValue(){
      
        return str;
    }
    

    String Calcium(){
        return "Calcium content is 12%";
    }
}
