/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anonymus;

/**
 *
 * @author User
 */

 class  Counter1{
  
    static int count = 0;
  
    public void Counter(){
  
       count += 1;
  
       System.out.print(count+ "");
  
    }
  
}


public class Counter {
    public static void main(String[] args) {
        Counter1 counter1 = new Counter1();
        
        counter1.Counter();
  
        Counter1 counter2 = new Counter1();
        counter2.Counter();

        Counter1 counter3 = new Counter1();
        
        counter3.Counter();
    }
}
