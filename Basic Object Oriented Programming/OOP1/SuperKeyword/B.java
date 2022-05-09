/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKeyword;

/**
 *
 * @author User
 */
public class B extends A{
    int x = 5;
    
    /*
    void display(){
        System.out.println(super.x);
    }
    */
    
    @Override
    void display(){
        
        super.display();
        System.out.println("Inside B class");
    }
    
    B(){
        super();
        System.out.println("Inside B constructor");
    }
    
}
