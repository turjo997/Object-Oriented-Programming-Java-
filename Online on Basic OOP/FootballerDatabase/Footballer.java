/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballerdatabase;

/**
 *
 * @author User
 */
public class Footballer {
   
    private String name;
    
    private double numberOfGoals , numberOfmatches;


   
    Footballer(){
    
    }
    
    
    Footballer(String name , double numberOfGoals , double numberOfmatches){
        
        this.name = name;
        this.numberOfGoals = numberOfGoals;
        this.numberOfmatches = numberOfmatches;
    }
    
   public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfGoals() {
        return this.numberOfGoals;
    }

    public void setNumberOfGoals(double numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
        if(this.numberOfGoals <=0){
            this.numberOfGoals = 1;
        }
    }

    public double getNumberOfmatches() {
        return this.numberOfmatches;
    }

    public void setNumberOfmatches(double numberOfmatches) {
        this.numberOfmatches = numberOfmatches;
        if(this.numberOfmatches <=0){
            this.numberOfGoals = 1;
        }
    }
    
    
    public double calculateAverageScore(){
      return numberOfGoals / numberOfmatches;
    }

    public String compareBetterScorer(Footballer ob){
        
        if(this.calculateAverageScore()  > ob.calculateAverageScore()){
        
            return "Footballer - 1 "+this.name+" is better scorer than Footballer -2 "+ob.name;
        }
        else if(this.calculateAverageScore()  < ob.calculateAverageScore()){
            
            
            return "Footballer - 2 "+ob.name+" is better scorer than Footballer -1 "+this.name;
        }
      
        return "Footballer1 " + this.name + " equals with Footballer2 " + ob.name;
    }
    
   
    public String toString(){
        
    return "The name of Footballer is: "+this.name+"\n"+
            "Number of Goals is "+this.numberOfGoals+" "+"\n"+"Number of matches is "+this.numberOfmatches;
    }
    
}
