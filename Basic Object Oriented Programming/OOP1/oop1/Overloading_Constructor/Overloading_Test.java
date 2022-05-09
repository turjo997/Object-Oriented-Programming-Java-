/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1.Overloading_Constructor;

/**
 *
 * @author User
 */
public class Overloading_Test {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        
        Teacher teacher2 = new Teacher("XX" , "male" , 328723);
        teacher2.displayInfo();
        
        Teacher teacher3 = new Teacher("YY" , "female" , 7328947);
        teacher3.displayInfo();
        
    }
}
