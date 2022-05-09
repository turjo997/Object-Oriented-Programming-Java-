/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varags;

/**
 *
 * @author User
 */
public class AddDemo {
    
    void add(int ... num){
    
        int sum = 0;
        
        for(int x : num){
           
            sum+=x;
        }
        
        System.out.println("The sum is : " + sum);
    
    }
    
    
    public static void main(String[] args) {
        AddDemo obj = new AddDemo();
        
        obj.add(10 , 20);
        obj.add(10 , 20 , 30);
        obj.add(10 , 20 , 30 , 40);
    }
          
}
