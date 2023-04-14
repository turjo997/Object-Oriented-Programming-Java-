/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package This_keyword;

/**
 *
 * @author User
 */
public class Person {
    
    String name , haircolor;
    int age;
    
    Person(String name , int age){
      this.name = name;
      this.age = age;
    }
    
    Person(String name, int age , String haircolor){
      this(name , age);
      this.haircolor = haircolor;
    }
    
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Hair color :"+haircolor);
    }
    
    
    void message(){
        System.out.println("I am message method");
    }
    
    void display2(){
        this.message(); // or messgae();
        System.out.println("I am display method");
    }
        
}
