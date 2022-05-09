/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author User
 */
public class Teacher extends Person{
    
    String qualification;
    
    void displayInfo2(){
    
      displayInfo1();
      System.out.println("Qualification : "+qualification);
      
    }
    
}
