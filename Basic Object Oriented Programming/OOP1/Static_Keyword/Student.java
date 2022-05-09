/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static_Keyword;

/**
 *
 * @author User
 */
public class Student {
 
    String name;
    int id;
    static String UniName = "Aust";
    
    Student(String n , int i){
        
        name = n;
        id = i;
    
    }
    
    
    void displayInfo(){
        System.out.println("Name : " +name);
        System.out.println("Id : "+id);
        System.out.println("Phone : "+UniName);
    }
    
    
    
    
}
