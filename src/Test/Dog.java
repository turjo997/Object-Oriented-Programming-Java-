/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author User
 */
public class Dog implements Animal{

       public void eat(){
           System.out.println("I am eating");
       }

       public static void main(String[] args) {
                    
           Dog d = new Dog();
           
           d.eat();
           
    }
    
}
