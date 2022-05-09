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
public class Empoloyee {
     
    static double calculateYearlyBonus(Officer o){
        
        double sum = 0.0;
        for(int i = 0 ; i<12 ; ++i){
            sum += o.salaryInfo[i];
        }
        
        return sum /(12.0);
    }
    
    static double calculateYearlyBonus(Manager m){
       double sum = 0.0;
        for(int i = 0 ; i<12 ; ++i){
            sum += m.salaryInfo[i];
        }
        double profit = 0.10 * m.profitMadeInaYear;
        
        return sum /(12.0) + profit ;
    }
}
