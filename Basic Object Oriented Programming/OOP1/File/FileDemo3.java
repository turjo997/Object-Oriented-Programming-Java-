/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FileDemo3 {
     public static void main(String[] args) {
        
         try{
            
             File file = new File("C:/Users/User/Documents/NetBeansProjects/OOP1/person/student.txt");
             Scanner scanner = new Scanner(file);
             
             while(scanner.hasNext()){
                 
                 String id = scanner.next();
                 String name = scanner.next();
                 
                 System.out.println("Id : "+id+" Name : " + name);
             
             }
             
             scanner.close();
             
             
             
         
         }catch(Exception e){
           
             System.out.println(e);
         }
         
         
    }
}
