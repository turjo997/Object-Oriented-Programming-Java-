/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static_variable;

/**
 *
 * @author User
 */
public class Test {
    
    public static void main(String[] args) {
        StaticVar ob = new StaticVar();
        
        System.out.println("My  name is : " + ob.myname);
        
        System.out.println("My name is : " + StaticVar.myname1);
        
        
    }
    
}
