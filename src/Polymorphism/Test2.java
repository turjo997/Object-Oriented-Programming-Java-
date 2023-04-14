/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author User
 */
public class Test2 {
    public static void main(String[] args) {
        
        Shape s = new Shape();
        Rectangle r = new Rectangle(10 , 20);
        Triangle t = new Triangle(20 , 30);
        
        
        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
        
        
        
        
        Shape[] s1 = new Shape[3];
      
        // Dynamic Method Dispatch
        
        s1[0] = new Shape();
        s1[1] = new Rectangle(22 , 25);
        s1[2] = new Triangle(35 , 40);
        
        System.out.println("");
        
        
        for(int i = 0 ; i < 3 ; ++i){  
            System.out.println(s1[i].area());
        }
        
        
    }
}
