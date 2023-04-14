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
public class Rectangle extends Shape{

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    
    @Override
    void area(){
      double res = dim1 * dim2;
      
        System.out.println("Rectangle area is : " +res);
    
    }
    
}
