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

 class A{
      void display1(){
          System.out.println("I am class A method");
      }
    }
    
class B extends A{
    
        @Override
        void display1(){
            System.out.println("I am class B method");
        
        }
    }


public class test1 {
      
    public static void display(){
      
        System.out.println("I am static method");
    }
    
  
    
    public static void main(String[] args) {
            display();
            test1.display();
            B obj = new B();
            obj.display1();
    }
}
