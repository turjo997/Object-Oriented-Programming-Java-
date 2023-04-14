/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author User
 */


class Book2 {    
int id;    
String name,author,publisher;    
int quantity;    
public Book2(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}   
}


public class DS9 {
    
    public static void main(String[] args) {
                    HashMap<Integer,String> m=new HashMap<Integer,String>();//Creating HashMap    
                    
                    m.put(1,"Mango");  //Put elements in Map  
                    m.put(2,"Apple");    
                    m.put(3,"Banana");   
                    m.put(1,"Grapes"); //trying duplicate key  
                    m.put(4 , "Apple");

                    System.out.println("Iterating Hashmap...");  
                    
                    for(Map.Entry m1 : m.entrySet()){    
                     System.out.println(m1.getKey()+" "+m1.getValue());    
                    }
                    
                    System.out.println(m.values());
                    System.out.println(m.keySet());
                    
                    
                    if(m.containsKey(1)){
                        System.out.println("key is present in the map");
                    }else{
                        System.out.println("key is not present in the map");
                    }
                    
                    
                    if(m.containsValue("Apple")){
                        System.out.println("value is present in the map");
                    }else{
                        System.out.println("value is not present in the map");
                    }
                    
                    
                    System.out.println(m.get(1)); // only take index(key)
                    
                    
                    Set<Integer> keys = m.keySet();
                    
                    for(Integer key : keys){
                          System.out.println(key + " " +m.get(key));
                    }
                    
      /////////////////////////////////////////////////////////////////////////////              
                    
                    // Frequency count
                    
                    int [] arr = {1,4,5,9,7,7,1,4,5};
                    
                    HashMap<Integer , Integer> mp = new HashMap<Integer , Integer>();
                    
                    for(int i = 0 ; i < arr.length ; ++i){
                           if(mp.containsKey(arr[i])){
                               mp.put(arr[i], mp.get(arr[i]) + 1);
                           }else{
                              mp.put(arr[i], 1 );
                           }
                    }
                    
                    for(Map.Entry e : mp.entrySet()){
                         System.out.println("value : " + e.getKey() + " Frequency Count : " + e.getValue());
                    }
                    
                    
                    int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
                    
                    HashMap<Integer, Integer> mp1 = new HashMap<Integer,Integer>();
                    
                    for(int i = 0 ; i < arr1.length ; ++i){
                        if(mp.containsKey(arr[i])){
                          mp.put(arr1[i], mp.get(arr[i] + 1));
                        }else{
                            mp.put(arr1[i], 1);
                        }
                    }
                    
                    
                    for(Map.Entry e : mp1.entrySet()){
                        System.out.println("vlue : " + e.getKey() + " Frequency Count : " + e.getValue());
                    }
/////////////////////////////////////////////////////////////////////////////
                   
                   
                   
                HashMap<Integer,String> map=new HashMap<Integer,String>();          
                map.put(100,"Amit");    
                map.put(101,"Vijay");    
                map.put(102,"Rahul");  
                map.put(103, "Gaurav");  
              
                
              System.out.println("Initial list of elements: "+map);  
              

              //key-based removal  
              map.remove(100);  
              System.out.println("Updated list of elements: "+map);  
            
          
              //key-value pair based removal  
              map.remove(102, "Rahul");  
              System.out.println("Updated list of elements: "+map); 
              
              
   /////////////////////////////////////////////////////////////////////////////
              
              
              HashMap<Integer , String> hm = new HashMap<Integer , String>();
              
              hm.put(101, "Amit");
              hm.put(102, "Rahul");
              hm.put(103, "Vijay");
              
              System.out.println("Printing the list : ");
              
              
              for(Map.Entry  m1 : hm.entrySet()){
                  System.out.println(m1.getKey() + " " + m1.getValue());
              }
              
              hm.replace(103, "Ullash");
              
               for(Map.Entry  m1 : hm.entrySet()){
                  System.out.println(m1.getKey() + " " + m1.getValue());
              }
               
               hm.replaceAll((key,value)-> "Ajay");
               
               
               
                for(Map.Entry  m1 : hm.entrySet()){
                  System.out.println(m1.getKey() + " " + m1.getValue());
              }
              
              
   /////////////////////////////////////////////////////////////////////////////              
                
                
                
                
    Map<Integer,Book2> map1=new HashMap<Integer,Book2>();    
    
   //Creating Books    
    Book2 b1=new Book2(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    Book2 b2=new Book2(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    Book2 b3=new Book2(103,"Operating System","Galvin","Wiley",6);    
    //Adding Books to map   
    map1.put(1,b1);  
    map1.put(2,b2);  
    map1.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer, Book2> entry:map1.entrySet()){    
        int key=entry.getKey();  
        Book2 b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }  
   
    }
    
}
