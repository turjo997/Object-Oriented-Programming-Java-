/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

/**
 *
 * @author User
 */
public class WrapperClass {
    
    public static void main(String[] args) {
        
        // Autoboxing = primitive data type  ----> object data
       
        int x = 10;
        
        Integer y = Integer.valueOf(x);
        
        System.out.println("y is : " +y);
        
        Integer z = x;
        
        System.out.println("z is : " +z);

        
        // Unboxing =  object data ----> primitive data type
        
        Double d = new Double(10.25);
        
        double e = d.doubleValue();
        
        System.out.println("e is : " +e);
        
        double f = d;
        
        System.out.println("f is : " +f);
        
        
    }
    
}
