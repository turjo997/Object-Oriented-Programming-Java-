/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandle;

/**
 *
 * @author User
 */
public class Dummy {
     
    public void check(int age){
        
        if(age < 18){
        
            throw new ArithmeticException("Under Age");
            
        }else{
           
            System.out.println("Welcome Voter");
        
        }
    
    }
}
