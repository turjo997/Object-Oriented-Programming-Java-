/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Returen_value;

/**
 *
 * @author User
 */
public class Test {
      
    public static void main(String[] args) {
        
        ReturnValue_Demo obj = new ReturnValue_Demo();
        
        int res = obj.square(5);
        
        System.out.println("Square : " + res);
        
        System.out.println("");
        
        System.out.println("Sqaure : " + obj.square(7));
    }
    
}
