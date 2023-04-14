/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticBlock;

/**
 *
 * @author User
 */
public class StaticBlockDemo {
    
    static int id;
    static String name;
    
    static{
       id = 103;
       name = "XYZ";
     }
    
    static void display(){
        System.out.println("ID : " +id);
        System.out.println("Name : "+name);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Hello World\n");
        StaticBlockDemo.display();
        
    }
}
