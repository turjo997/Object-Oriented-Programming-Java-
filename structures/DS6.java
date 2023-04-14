/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author User
 */


class Book {    
int id;    
String name,author,publisher;    
int quantity;   


    public Book(int id, String name, String author, String publisher, int quantity) {    
        this.id = id;    
        this.name = name;    
        this.author = author;    
        this.publisher = publisher;    
        this.quantity = quantity;    
    }

    
}
public class DS6 {
    
    public static void main(String[] args) {
        
            Deque<Book> set=new ArrayDeque<Book>();    
            
            //Creating Books    
            
            Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
            Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
            Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
            
            //Adding Books to Deque   
            set.add(b1);    
            set.add(b2);    
            set.add(b3);    
            
            //Traversing ArrayDeque  
            
            for(Book b:set){    
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);    
            }   
    
    
    
    
    
          Deque<String> d = new ArrayDeque<>();
          
          d.add("Mango");
          d.add("Apple");
          d.add("Lichi");
          d.add("Guava");
          d.add("Jackfruit");
          
          
          System.out.println(d);
          
          
          for(String s : d){
              System.out.print(s +" ");
          }
          
          System.out.println("");
          
          d.offer("Orange");
          
          System.out.println(d);
          
          d.offerFirst("Grapefruit"); // insert into front
         
          System.out.println(d);
         
          d.offerLast("Strawbery"); // it is same as offer
          
          System.out.println(d);
          
          
          
          d.poll();     // pop from front
          
          System.out.println("After pop operation : "+d);
          
          d.pollFirst(); // same as poll    (pop from front)
          
          System.out.println(d);
          
          
          d.pollLast();  // pop from back
          
          System.out.println(d);
          
          
         String s = d.peek();   // bottom element 
         
         System.out.println(s);
          
    }
    
}
