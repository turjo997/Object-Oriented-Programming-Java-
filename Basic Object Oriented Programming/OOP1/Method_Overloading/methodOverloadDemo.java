/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method_Overloading;

/**
 *
 * @author User
 */
public class methodOverloadDemo {
    
    void add(int a , int b){
        System.out.println(a+b);
    }
    
    void add(int a , int b , int c){
     System.out.println(a+b+c);
    }
    void add(int a , int b , int c , int d){
    System.out.println(a+b+c+d);
    }
    
    void add(){
     System.out.println("Nothing to add");
    }
    
    public static void main(String[] args) {
         methodOverloadDemo ob = new methodOverloadDemo();
         
         ob.add();
         ob.add(10 , 20);
         ob.add(10 , 20 , 30);
         ob.add(10 , 20 , 30 , 40);
        
    }
    
    
}
