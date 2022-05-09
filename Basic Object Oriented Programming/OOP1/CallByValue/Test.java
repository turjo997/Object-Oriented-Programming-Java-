/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallByValue;

/**
 *
 * @author User
 */
public class Test {
    
    public static void main(String[] args) {
         
        callbyval ob = new callbyval();
        
        int x = 10;
        
        System.out.println("before calling : " +x);
        
        ob.change(x);
        
        System.out.println("after calling : " +x);
        
    }
    
    
}
