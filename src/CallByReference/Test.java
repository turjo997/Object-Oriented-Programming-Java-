/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallByReference;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        callbyref r1 = new callbyref();
        r1.name = "Anis";
        
        System.out.println("before calling : " +r1.name);
        
        r1.change(r1);
        System.out.println("after calling : " +r1.name);
        
        
        
    }
}
