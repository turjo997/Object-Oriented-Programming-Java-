/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

/**
 *
 * @author User
 */
public class Box {
    
    double height , width , depth;
    
    Box(double h , double w , double d){
      height = h;
      width = w;
      depth = d;
      
    }
    
    
    void display(){
        
        double res = height * width * depth;
        
        System.out.println("The volume is : "+res);
    }
    
    
    public static void main(String[] args) {
        
        Box obj1  = new Box (10 , 10 , 10);
        obj1.display();
        
        Box obj2  = new Box (20 , 30 , 10);
        obj2.display();
        
    }
    
    
    
}
