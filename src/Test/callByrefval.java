/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author User
 */
public class callByrefval {
    
    String name;
    
    
    void change1(callByrefval ref){
    
           ref.name = "anis";
    
    }
    
    void change(int x){
      x = 20;
    }
    
    
    
    public static void main(String[] args) {
        
        int x;
        x = 10;
        
        System.out.println("Before Calling : " +x);
        
        callByrefval ob = new callByrefval();
        
        ob.change(x);
        
        System.out.println("After Calling : " +x);
        
        ///////////////////////////////////
        
        String name;        
        callByrefval ob1 = new callByrefval();
        
        ob1.name = "rubel";
        
        System.out.println("Before Calling : " +ob1.name);
         
        ob1.change1(ob1);
        
        System.out.println("After Calling : " +ob1.name);
        
        
        
        
        
    }
    
    
}
