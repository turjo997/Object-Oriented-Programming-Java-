/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballerdatabase;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FootballerDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        String name1 , name2;
        double numberOfGoals1 , numberOfMathches1 , numberOfGoals2 , numberOfMathches2;
        
        
        Footballer ob1 = new Footballer();
        Footballer ob2 = new Footballer();
        
        name1= input.nextLine();
       // input.nextLine();
        name2 = input.nextLine();
                
                
        numberOfGoals1 = input.nextDouble();
        numberOfGoals2 = input.nextDouble();
        
        numberOfMathches1 = input.nextDouble();
        numberOfMathches2 = input.nextDouble();
            
        ob1.setName(name1);
        ob1.setNumberOfGoals(numberOfGoals1);
        ob1.setNumberOfmatches(numberOfMathches1);
        
        ob2.setName(name2);
        ob2.setNumberOfGoals(numberOfGoals2);
        ob2.setNumberOfmatches(numberOfMathches2);
      
        
        System.out.println("Footballer1 average score is " +ob1.calculateAverageScore());
        System.out.println("Footballer2 average score is " +ob2.calculateAverageScore());
        
        System.out.println("Footballer1 info : " + "\n" +ob1.toString());
        
        System.out.println("Footballer2 info : " + "\n" +ob2.toString());
                
        
         
        System.out.println(ob1.compareBetterScorer(ob2));
                
                
    }
    
}
