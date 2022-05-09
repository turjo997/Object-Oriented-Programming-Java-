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
public class Test {
    
    public static void main(String[] args) {
        
        
        Dummy ob = new Dummy();
        
        try{
           
            ob.check(17);
            
        }catch(Exception e){
           
            System.out.println(e);
        
        }
        
        
    }
    
}
