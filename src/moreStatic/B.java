/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreStatic;

/**
 *
 * @author User
 */
public class B extends A{
    
    
//    @Override
//    void display(){
//        System.out.println("I am static extend method");
//    }
    
    // the above method will give error because static method declared in super class can not be overriden 
    
    
    @Override
    public void display1(){
        System.out.println("I am public extend method");
    }
    
    protected void display2(){
        System.out.println("I am protected extend method");
    }
    
//    @Override
//    void display3(){
//        System.out.println("I am final extend method");
//    }
    
    
     // the above method will give error because final method declared in super class can not be overriden 
    
    
    void display4(){
         System.out.println("I am private extend method");
     }
    
    
//    final class F{
//     }
//    class test extends F{
//    }
    
     // The above will give error because if we declare a class by final then it can't be extend
    
    
}
