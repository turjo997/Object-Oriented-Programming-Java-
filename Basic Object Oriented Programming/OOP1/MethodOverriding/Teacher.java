/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverriding;

/**
 *
 * @author User
 */
public class Teacher extends Person{
    String qualification;
    
    @Override
    void displayInfo(){
    
    // displayInfo();
      System.out.println("Name : " +name);
      System.out.println("Age : "+age);
      System.out.println("Qualification : "+qualification);
      
    }
}
