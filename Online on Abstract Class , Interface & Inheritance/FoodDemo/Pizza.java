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
public abstract class Pizza implements JunkFood{
    
    String name , str;
    double calories , fat;
    
    @Override
    public void setName(String name){
      this.name = name;
    }
    
    @Override
    public String getName(){
      return name;
    }  
    
    @Override
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
    
   
    @Override
    public void setHealthIssues(String str){
      this.str = str;
    }
    
    @Override
    public String gethealthIssues(){
        return str; 
    }
    
    
    String Problems(){
        return "High on calories";
    }
    
}
