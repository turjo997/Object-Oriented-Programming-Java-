/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

//import java.util.HashSet;
//import java.util.Iterator;

import java.util.*;

/**
 *
 * @author User
 */
public class DS10 {
    
    public static void main(String[] args) {
        
            HashSet<Integer> s = new HashSet<Integer>();
            
            
            // Insert
            
            s.add(1);
            s.add(2);
            s.add(3);
            s.add(1);
            
            
            System.out.println(s);
            
            // Search
            
            if(s.contains(1)){
                System.out.println("Set contains 1");
            }
            if(!s.contains(6)){
                
                System.out.println("does not contain");
            }
            
            s.remove(1);
            
            System.out.println("set size : "+s.size());

            
            Iterator it = s.iterator();
            
            while(it.hasNext()){
                System.out.println(it.next());
            }
            
            
            HashSet<Integer> set = new HashSet<Integer>();
            
            set.add(1);
            set.add(1);
            set.add(2);
            set.add(2);
            set.add(3);
            set.add(3);
            set.add(3);
            
            
            Iterator it1 = set.iterator();
            while(it1.hasNext()){
                System.out.println(it1.next());
            }
            
            
            
            
                   
    }
    
}
