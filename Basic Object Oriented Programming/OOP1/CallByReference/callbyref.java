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
public class callbyref {
    String name;
    
    void change(callbyref r2){
        
        r2.name = "Rubel";
    
    }
}
