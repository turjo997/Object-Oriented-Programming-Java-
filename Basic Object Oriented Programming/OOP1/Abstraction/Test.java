/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author User
 */
public class Test {
    
    public static void main(String[] args) {
        
        Mobileuser mu;
        
        mu = new Rahim();
        mu.sendMessage();
        mu.call();
        
        
        mu = new Karim();
        mu.sendMessage();
        
    }
    
}
