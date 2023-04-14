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

// static class A
// private class A
// protected class A

// the above all are can't be declared
// only public class A and final class A can be declared


public class A {
   int x = 10;
    
    static void display(){
        System.out.println("I am static method");
    }
    
    public void display1(){
        System.out.println("I am public method");
    }
    
    protected void display2(){
        System.out.println("I am protected method");
    }
    
    final void display3(){
        System.out.println("I am final method");
    }
     
     private void display4(){
         System.out.println("I am private method");
     }
}
