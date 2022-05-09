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
public interface HealthyFood extends Food{
    
    void setNutritionValue(String str);
    String getNutritionValue();
    
}
