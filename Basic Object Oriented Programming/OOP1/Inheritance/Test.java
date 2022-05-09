/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "X";
        p.age = 30;
        
        p.displayInfo1();
        
        
        Teacher t1 = new Teacher();
        
        t1.name = "Y";
        t1.age = 45;
        t1.qualification = "Msc in CSE";
        
        t1.displayInfo2();
        
        
   
        
    }
}
