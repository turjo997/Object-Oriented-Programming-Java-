/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anonymus;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        
        person p = new person(){
        
        @Override
        void display(){
            System.out.println("Test Class");
        }
            
        };
        
        p.display();
    }
}
