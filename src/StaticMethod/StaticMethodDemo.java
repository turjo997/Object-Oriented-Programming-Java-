/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticMethod;

/**
 *
 * @author User
 */
public class StaticMethodDemo {
    
    void display1(){
        
        display2(); // this will give no error
        System.out.println("Not static Method");
    }
    
    static void display2(){
        // display1();       this will give error because static method can't use not static member; 
        System.out.println("Static Method");
    }
    
}
