/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author User
 */
public class DS7 {
    
      public static void main(String[] args) {
        
            PriorityQueue<String> q=new PriorityQueue<String>();  
            
            q.add("Amit");  
            q.add("Vijay");  
            q.add("Karan");  
            q.add("Jai");  
            q.add("Rahul");  
            
            
             
            // the resultant q will be sorted order
            
            
            System.out.println(q);
            
            System.out.println(q.element());
            
            System.out.println(q.peek());              // same as q.element
            
            q.offer("Ullash");
            
            System.out.println(q);
            
            q.poll();               // pop the front element of a sorted queue . 
            
            System.out.println(q);
            
       
            
            
    }
}
