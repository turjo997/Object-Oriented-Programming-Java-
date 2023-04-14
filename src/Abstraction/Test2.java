/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author User
 */
public class Test2 {
    
    
    public static void main(String[] args) {
       Shape s ;
    
       s = new Rectangle(10,20);
       s.area();
       
       s = new Triangle(20,30);
       s.area();
       
       s = new Circle(10);
       s.area();
        
    }
    
}
