/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction_prac;

/**
 *
 * @author User
 */
public class test2 {
    public static void main(String[] args) {
          
        Shape s;
        
        s = new Circle(10);
        
        s.area();
        
        s = new Triangle(10,20);
        
        s.area();
        s = new Rectangle(10,20); 
        s.area();
        
    }
}
