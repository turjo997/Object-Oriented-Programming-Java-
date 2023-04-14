/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author User
 */
public class encap {
   
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
    public static void main(String[] args) {
        encap en = new encap();
        
        en.setName("Ullash");
        en.setAge(24);
        
        System.out.println(en.getName());
        System.out.println(en.getAge());
        
    }
}
