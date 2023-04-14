/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_keyword;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Test2 {
    
    public static void main(String[] args) {
    
    Student s1 = new Student();
    
    s1.display();
    s1.display2();
    
    
    
      int t = 5;
      ArrayList mylist = new ArrayList();
      for(int i=0; i<t; i++){
         mylist.add(i);
      }
      
        for(int i = 0; i < mylist.size(); i++){
         Object element=mylist.get(i);
         
            System.out.println(element);
      }
    
    
    }
    
}
