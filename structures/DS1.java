/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class DS1 {
    
    public static void main(String[] args) {
              
        Scanner ip = new Scanner (System.in);
        
        /*
        
        int age;
        String name;
        
        age = ip.nextInt();
        name = ip.nextLine();
        
        System.out.println("Name : " +name + " Age : " +age);
        
        */
     
        /*
        
        int[] num = new int[5];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;
        
        for(int i = 0 ; i < num.length ; ++i){   
            System.out.print(num[i] + " ");
        }
        
        */
        
        /*
        
        int [] num2 = new int[5];
        
        for(int i = 0 ; i < num2.length ; ++i){
            num2[i] = ip.nextInt();
        }
        
        for(int i = 0 ; i < num2.length ; ++i){   
            System.out.print(num2[i] + " ");
        }
        
        */
        
        /*
        
        
        int[][] num3 = new int[2][3];
        
        for(int i = 0 ; i < 2 ; ++i){
            for(int j = 0 ; j < 3 ; ++j){
              num3[i][j] = ip.nextInt();
            }
        }
        
        for(int i = 0 ; i < 2 ; ++i){
            for(int j = 0 ; j < 3 ; ++j){
                System.out.print(num3[i][j] + " ");
            }
            System.out.println("");
        }
        
        */
        
        /*        
        
        int [] num4 = {-3,6,0,1,2,};
        
        Arrays.sort(num4);
        
        for(int i : num4){
            System.out.print( i +" ");
        }
        
        System.out.println("");
        
        String[] names = {"Ullash" , "Utshob" , "Uchash"  , "Supta"};
        
        Arrays.sort(names);
        
        for(String i : names){
            System.out.print( i +" ");
        }
        
        */
        
        
        ArrayList <Integer> num5 = new ArrayList<>();
        
        // Adding elements
        
        num5.add(10);
        num5.add(20);
        num5.add(30);
        num5.add(3 , 40); // here 3 is a index
        
        
        System.out.println(num5);
        System.out.println(num5.size());
        
       
        System.out.println("");
        for(int x : num5){
            System.out.print(x + " ");
        }
        
        System.out.println("");
        Iterator it = num5.iterator();
        
        while(it.hasNext()){
            
            System.out.print(" " + it.next());
        }
        
        System.out.println("");
        
        // Removing elements
        
        num5.remove(2); // here 2 is index
        
        System.out.println(num5);
        
        System.out.println("");
        
        num5.removeAll(num5);
        
        System.out.println(num5);
        
        num5.add(10);
        num5.add(20);
        num5.add(30);
        
        num5.clear();
        
        boolean  check = num5.isEmpty();
        
        System.out.println(check);
        
        
        num5.add(10);
        num5.add(20);
        num5.add(30);
        
        boolean contain = num5.contains(20);
        
        System.out.println(contain+" ");
        
        
        int pos  = num5.indexOf(30);
        
        System.out.println(pos + " ");
        
        
         for(int i = 0 ; i < num5.size() ; ++i){
            
             int element = num5.get(i);
             
             System.out.print(element+ " ");
             
        }
         System.out.println("");
        
         num5.set(1, 100); // 1 is a index  , [1] index value replace by 100 
         
         System.out.print(num5);
         
         System.out.println("");
        
         
         ArrayList <Integer> ar1 = new ArrayList<>();
         ArrayList <Integer> ar2 = new ArrayList<>();
         ArrayList <Integer> ar3 = new ArrayList<>();
         
         System.out.println("Enter the elements of ar1 : ");
         
         for(int i = 0 ; i < 5 ; ++i){
             int x = ip.nextInt();
             ar1.add(x);
         }
         
         System.out.println("Enter the elements of ar1 : ");
          for(int i = 0 ; i < 5 ; ++i){
             int x = ip.nextInt();
             ar2.add(x);
         }
          
          ar3.addAll(ar2);
          
          System.out.print(ar3);
          
          System.out.println("");
          
          boolean res1 = ar1.equals(ar2);
          System.out.println(res1);
          
          boolean res2 = ar2.equals(ar3);
          System.out.println(res2);
          
          
          ArrayList <Integer> ar4 = new ArrayList<>();
          
          ar4.add(-90);
          ar4.add(90);
          ar4.add(30);
          ar4.add(40);
          ar4.add(-100);
          ar4.add(240);
          
          Collections.sort(ar4);
          
          System.out.println("Ascending Order : " + ar4);
          
          Collections.sort(ar4 , Collections.reverseOrder());
          
          System.out.println("Descending Orde : " + ar4);
          
          
         ArrayList <String> ar5 = new ArrayList<>();
         
         System.out.println("Enter the elements of ar5 : ");
         
         for(int i = 0 ; i < 2 ; ++i){
             String x = ip.nextLine();
             ar5.add(x);
         }
         
         for(String s : ar5){
             System.out.print(s+ " ");
         }
         
         System.out.println("");
         
         
       int n = 3;
  
        // Here aList is an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer> > aList = new ArrayList<ArrayList<Integer> >(n);
  
        // Create n lists one by one and append to the 
        // master list (ArrayList of ArrayList)
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        aList.add(a1);
  
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        aList.add(a2);
  
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(10);
        a3.add(20);
        a3.add(30);
        aList.add(a3);
  
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }
             
    }
    
}
