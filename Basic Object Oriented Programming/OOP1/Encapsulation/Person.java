/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author User
 */
public class Person {
    
    private String name;
    private int age;
    
    
    /*
    void display(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    
    }*/
    
    public void setName(String name){
      this.name = name;
    }
    
    public String getName(){
      return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
}
