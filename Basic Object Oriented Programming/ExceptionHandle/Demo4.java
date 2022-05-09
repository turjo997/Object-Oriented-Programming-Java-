/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandle;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Demo4 {
    
    public static void main(String[] args) {
        
        A ob = new A();
        
        try {
            ob.print1();
        } catch (Exception ex) {
            Logger.getLogger(Demo4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ob.print2();
        
    }
    
}

class A{

    public void print1() throws Exception{
    
    }
     public void print2() throws RuntimeException{
    
    }
}