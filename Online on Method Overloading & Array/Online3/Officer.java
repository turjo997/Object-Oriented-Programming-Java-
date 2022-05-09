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
public class Officer {
    String name;
    int age;
    double basicSalary;
    
    double[] salaryInfo = new double[12];
    
    Officer(){
    }
    
    Officer(String name , int age , double basicSalary){
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

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

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    
    void calculateSalary(String month , double percentage){
     
        percentage = percentage / 100;
        double store = (1.55 * this.basicSalary) + (this.basicSalary * percentage);
        
        if(month == "January")
            salaryInfo[0] = store;
        else if(month == "February")
            salaryInfo[1] = store;
        else if(month == "March")
            salaryInfo[2] = store;
        else if(month == "April")
            salaryInfo[3] = store;
        else if(month == "May")
            salaryInfo[4] = store;
        else if(month == "June")
            salaryInfo[5] = store;
        else if(month == "July")
            salaryInfo[6] = store;
        else if(month == "August")
            salaryInfo[7] = store;
        else if(month == "September")
            salaryInfo[8] = store;
        else if(month == "October")
            salaryInfo[9] = store;
        else if(month == "November")
            salaryInfo[10] = store;
        else if(month == "December")
            salaryInfo[11] = store;
           
    }
    
    
    
}
