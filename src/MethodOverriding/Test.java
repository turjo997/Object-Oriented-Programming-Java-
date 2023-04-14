/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverriding;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "X";
        p.age = 30;
        
        p.displayInfo();
        
        
        Teacher t1 = new Teacher();
        
        t1.name = "Y";
        t1.age = 45;
        t1.qualification = "Msc in CSE";
         
        t1.displayInfo();
        
        
//            Map<Integer,String> map=new HashMap<Integer,String>();  
//            map.put(100,"Amit");  
//            map.put(101,"Vijay");  
//            map.put(102,"Rahul");
//            
//            for(Map.Entry m:map.entrySet()){  
//                
//            
//                System.out.println(m.getKey()+" "+m.getValue());  
//                
//           }  
    }
    
}
