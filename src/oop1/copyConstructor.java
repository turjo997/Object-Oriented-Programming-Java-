/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author User
 */

   class Student{
    
      int roll;
      String name;
      float mark;
      
      
      Student(int r , String n , float m){
         
          roll = r;
          name = n;
          mark = m;
      
      }
      
       Student(Student s){
          roll = s.roll;
          name = s.name;
          mark = s.mark;
      }
       
       void display(){
           System.out.println("name is : "+name);
           System.out.println("roll is : "+roll);
           System.out.println("mark is : "+mark);
       }    
    }
    


public class copyConstructor {
    
 
     public static void main(String[] args) {
        
        Student s = new Student(1 , "mark" , 10.2f);
        
        s.display();
        
        Student s1 = new Student(s);
        s1.display();
        
    }
    
}
