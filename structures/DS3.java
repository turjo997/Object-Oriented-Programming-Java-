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
public class DS3 {
 
    public static void main(String[] args) {
        
        
        Scanner ip = new Scanner(System.in);
        
        List <Integer> list = new ArrayList<Integer>();
        
        
//        for(int i = 0 ; i < 5 ; ++i){
//           int elem = ip.nextInt();
//           list.add(elem);
//        }
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        
        System.out.println(list);
        
        for(int x : list){
            System.out.print(x+"");
        }
        
        System.out.println("");
        
        
        // Convert array to list 
        
        String arr[] = {"Python" , "Php" , "C" , "C++" , "Javascript"};
        
        System.out.println(Arrays.toString(arr));
        
        List <String> list1 = new ArrayList<String>();
        
        for(String language : arr){
          list1.add(language);            
        }
        
        System.out.println(list1);
        
        
    
         //Converting ArrayList to Array 
            
            
        List<String> fruitList = new ArrayList<>();    
        
        fruitList.add("Mango");    
        fruitList.add("Banana");    
        fruitList.add("Apple");    
        fruitList.add("Strawberry");    
     
        
        String[] array = fruitList.toArray(new String[fruitList.size()]);    
        
        System.out.println("Printing Array: "+Arrays.toString(array));  
        
        System.out.println("Printing List: "+fruitList);  
        
        
        
        System.out.println("Getting element : "+fruitList.get(0));
        
        fruitList.set(0, "Guava");  // Changing Element
        
        System.out.println(fruitList);
        
        Collections.sort(fruitList);
        System.out.println(fruitList);
        
        fruitList.add(0, "Amoloki");
        fruitList.add(4, "Jolpai");
        
        System.out.println(fruitList);
        
        
        ListIterator <String> itr = fruitList.listIterator();
        
         
        System.out.println("Traversing elements in forward direction");    
        
        while(itr.hasNext()){    
              
             System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }   
        
        System.out.println("Traversing elements in backward direction");    
        
        while(itr.hasPrevious()){    
          
           System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        
        }   
        
        System.out.println(fruitList.contains("Amoloki"));
        
        System.out.println(fruitList.containsAll(list1));
        
        
        fruitList.addAll(list1);
        
        System.out.println(fruitList);
        
        fruitList.clear();
        
        System.out.println(fruitList);
        
        List<String> fruitList1 = new ArrayList<>();    
        
        fruitList1.add("Mango");    
        fruitList1.add("Banana");
        
        System.out.println(fruitList.equals(fruitList1));
        
        System.out.println(fruitList1.contains(fruitList));
        
        
        System.out.println(fruitList1.size());
        
        System.out.println(fruitList1.indexOf("Mango"));
        System.out.println(fruitList1.isEmpty());
        
        
        int n = 3;
        
        List<List<Integer> > l = new ArrayList<List<Integer> >(n);
  
    
        List<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        l.add(a1);
  
        List<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        l.add(a2);
  
        List<Integer> a3 = new ArrayList<Integer>();;
        a3.add(10);
        a3.add(20);
        a3.add(30);
        l.add(a3);
  
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
        
         
        
    }
    
    
}
