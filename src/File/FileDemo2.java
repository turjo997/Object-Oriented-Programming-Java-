/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FileDemo2 {
      public static void main(String[] args) {
        
          try{
              
              Formatter formatter = new Formatter("C:/Users/User/Documents/NetBeansProjects/OOP1/person/student.txt");
              Scanner input = new Scanner(System.in);
              System.out.println("How many students: ");
              
              int num = input.nextInt();
              for(int i = 1 ; i<= num ; ++i){
                  System.out.println("Enter student ID and Name \r\n: ");
                  String id = input.next();
                  String name = input.next();
                  formatter.format("%s %s\r\n" , id , name);
              }

              //formatter.format("%s %s\r\n" , "101" , "xyz");
              //formatter.format("%s %s\r\n" , "102" , "xfyz");
              //formatter.format("%s %s\r\n" , "103" , "xweyz");
              
              formatter.close();
             
          }catch(FileNotFoundException e){
              System.out.println(e);
          }
          
          
    }
}
