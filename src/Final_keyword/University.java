/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_keyword;

/**
 *
 * @author User
 */
public class University {
    
    final String uni_name = "Aust" ; // final var
    
    final int fees  ;   // blank final var
    
    static final String address; // static blank final var
    
    
    static{
      address = "Tejgaon";
    }
    University(){
      fees = 60000;
    }
    
    
    void display(){
    
        System.out.println("University name : " + uni_name);
        System.out.println("Fees : "+fees);
        System.out.println("Address : "+address);
    
    }
    
    
    
}
