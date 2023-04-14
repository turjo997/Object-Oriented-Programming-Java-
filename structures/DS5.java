/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;
import java.util.Iterator;
import java.util.ListIterator;
import static java.util.Spliterators.iterator;
import java.util.Stack;
/**
 *
 * @author User
 */


class Book1 {    
int id;    
String name,author,publisher;    
int quantity;   


    public Book1(int id, String name, String author, String publisher, int quantity) {    
        this.id = id;    
        this.name = name;    
        this.author = author;    
        this.publisher = publisher;    
        this.quantity = quantity;    
    }

    
}


public class DS5 {
    public static void main(String[] args) {
        
        
            Stack<Book> set = new Stack<>();
       
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
        
            
      ///////////////////////////////////////////////////////////////////
      
      
            Stack<Integer> st = new Stack<>();
            
            boolean res = st.empty();
            
            System.out.println(res);
            
           // st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(10);
         
            System.out.print(st);
            
            int x = st.peek();       /// similar toh c++ stack top() function
            
            System.out.println(x);
            
            
            int location = st.search(10);  
            System.out.println("Location of 10: " + location);
            
            System.out.println("Stack Size : " + st.size());
            
            st.pop();
            
            System.out.println(st);
            
            System.out.println(st.get(0));
            
            st.add(100);
            
            st.add(10);
            st.add(10);
                    
            System.out.println(st);
            
            int elem = st.firstElement();
            
            System.out.println("First Element : "+elem);
            
            
            int lm = st.lastElement();
            System.out.println("Last Element : "+lm);
            
            st.addAll(st);
            
            System.out.println(st);
            
            boolean ok = st.contains(30);
            
            System.out.println(ok);
            
            Iterator it = st.iterator();
            
//            while(it.hasNext()){
//                System.out.println(it.next());
//            }
            
            
//            while(!st.empty()){
//                
//                int a = st.peek();
//                
//                System.out.println(a);
//                
//                st.pop();
//                
//            }
            
            
               //invoking forEach() method for iteration over the stack  
               
//                st.forEach(n ->  
//                {  
//                System.out.println(n);  
//                }); 
                
                
//                ListIterator<Integer> ListIterator = st.listIterator(st.size()); 
//                
//                System.out.println("Iteration over the Stack from top to bottom:");  
//                while (ListIterator.hasPrevious())   
//                {  
//                Integer avg = ListIterator.previous();  
//                System.out.println(avg);  
//                }  
//                
                
                
                  int ind = st.indexOf(10);
                  
                  System.out.println(ind);
                  
                       
                  st.remove(10);
                  
                  System.out.println(st);
                  
                  st.removeAllElements();
                  
                  System.out.println(st);
                  
                  
                 
                  
                  
                  
                  
    }
}
