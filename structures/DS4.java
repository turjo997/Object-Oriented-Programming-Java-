/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;
import java.util.ArrayList;
import java.util.List;
import java.util.*; 

/**
 *
 * @author User
 */
public class DS4 {
       public static void main(String[] args) {
        
           Scanner ip = new Scanner(System.in);
           
           Vector <Integer> vec = new Vector<>();
           
           vec.add(10);
           vec.add(20);
           vec.add(30);
           vec.add(10);
           vec.add(20);
           vec.add(30);
           
           System.out.println(vec);
           
           
           vec.addElement(40);
           vec.addElement(50);
           
           System.out.println(vec);
           
           System.out.println(vec.size());
           
           Collections.sort(vec);
           
           System.out.println("After sorting the elements are : "+vec);
           
           
           vec.remove((Integer)10);
           System.out.println("After removing 10 : "+vec);
           
           vec.remove(4);
           
           System.out.println("After remove element of 4th index : " +vec);
           
           
           System.out.println("Element at index 1 is = "+vec.get(1));  
           
          
           
           Vector<String> vec1 = new Vector<String>();
           
           System.out.println("Default capacity is: "+vec1.capacity());
            
          //Adding elements to a vector  
          vec1.add("Tiger");  
          vec1.add("Lion");  
          vec1.add("Dog");  
          vec1.add("Elephant");  
          //Check size and capacity  
          System.out.println("Size is: "+vec1.size());  
          System.out.println("Default capacity is: "+vec1.capacity());  
          
          
          //Display Vector elements  
         
          System.out.println("Vector element is: "+vec1);  
          vec1.addElement("Rat");  
          vec1.addElement("Cat");  
          vec1.addElement("Deer");  
          
          //Again check size and capacity after two insertions  
          
          System.out.println("Size after addition: "+vec1.size());  
          System.out.println("Capacity after addition is: "+vec1.capacity()); 
          
          
          vec1.addElement("Rat");  
          vec1.addElement("Cat");  
          vec1.addElement("Deer");
          vec1.addElement("Rat");  
          vec1.addElement("Cat");  
          vec1.addElement("Deer");
          
          System.out.println("Size after addition: "+vec1.size());  
          System.out.println("Capacity after addition is: "+vec1.capacity()); 
          
            if(vec1.contains("Tiger"))  
            {  
               System.out.println("Tiger is present at the index " +vec1.indexOf("Tiger"));  
            }  
            else  
            {  
               System.out.println("Tiger is not present in the list.");  
            }  
            //Get the first element  
          System.out.println("The first animal of the vector is = "+vec1.firstElement());   
          //Get the last element  
          System.out.println("The last animal of the vector is = "+vec1.lastElement());   
          
           
           System.out.println(vec1.equals(vec));
           
           
           Iterator it = vec1.iterator();
           
           while(it.hasNext()){
                System.out.println("value:"+it.next()); 
           }
           
           
           
        int n = 3;
  
        // Here v is a Vector of Vector
        Vector<Vector<Integer> > v = new Vector<Vector<Integer> >(n);
  
     
        
        
        Vector<Integer> a1 = new Vector<Integer>();
        a1.add(1);
        a1.add(2);
        v.add(a1);
  
        Vector<Integer> a2 = new Vector<Integer>();
        a2.add(5);
        v.add(a2);
  
        Vector<Integer> a3 = new Vector<Integer>();
        a3.add(10);
        a3.add(20);
        a3.add(30);
        v.add(a3);
  
        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.get(i).size(); j++) {
                System.out.print(v.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
       
             
    
       
    }
    
}
