/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online3;

/**
 *
 * @author User
 */
public class Demo {
    public static void main(String[] args) {
        
        Officer ob = new Officer("Jamal" , 35 , 40000);
        
        ob.calculateSalary("January", 3);
        ob.calculateSalary("February", 3);
        ob.calculateSalary("March", 3);
        ob.calculateSalary("April", 3);
        ob.calculateSalary("May", 4);
        ob.calculateSalary("June", 4);
        ob.calculateSalary("July", 4);
        ob.calculateSalary("August", 5);
        ob.calculateSalary("September", 5);
        ob.calculateSalary("October", 5);
        ob.calculateSalary("November", 5);
        ob.calculateSalary("December", 5);
        
        System.out.println("Calculate yearly salary bonus for employee officer " + Empoloyee.calculateYearlyBonus(ob));
        
        
        
        Manager ob1 = new Manager("Kamal" , 35 , 50000 , 500000);
        
        ob1.calculateSalary("January", 100000);
        ob1.calculateSalary("February", 100000);
        ob1.calculateSalary("March", 100000);
        ob1.calculateSalary("April", 100000);
        ob1.calculateSalary("May", 100000);
        ob1.calculateSalary("June", 100000);
        ob1.calculateSalary("July", 100000);
        ob1.calculateSalary("August", 100000);
        ob1.calculateSalary("September", 100000);
        ob1.calculateSalary("October", 100000);
        ob1.calculateSalary("November", 100000);
        ob1.calculateSalary("December", 100000);
        
    
       System.out.println("Calculate yearly salary bonus for employee manager " + Empoloyee.calculateYearlyBonus(ob1));
        
        
    }
   
}
