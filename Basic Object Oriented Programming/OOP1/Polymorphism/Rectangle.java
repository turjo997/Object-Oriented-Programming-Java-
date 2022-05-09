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
public class Rectangle extends Shape{
    
    double height , width;
    
    Rectangle(double height , double width){
    
        this.height = height;
        this.width = width;
    }
    
   
     @Override
     double area(){
     
        System.out.print("Area for Rectangle : ");
        
        return height * width;
    
    }
    
}
