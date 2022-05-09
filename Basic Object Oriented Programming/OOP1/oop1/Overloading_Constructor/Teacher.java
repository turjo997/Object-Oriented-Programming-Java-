/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1.Overloading_Constructor;

/**
 *
 * @author User
 */
public class Teacher {
    String name , gender;
    int phone;
    
     // Default Constructor
    
    Teacher(){
        System.out.println("No value");
    }
    
    // Parameterized Constructor
    
      Teacher(String s1 , String s2){
        name = s1;
        gender = s2;
      }
      
       // Parameterized Constructor
    
      Teacher(String s1 , String s2 , int ph){
        name = s1;
        gender = s2;
        phone = ph;
        
      }
      
        // no parameter method
    void displayInfo(){
        System.out.println("Name : " +name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
    }
}
