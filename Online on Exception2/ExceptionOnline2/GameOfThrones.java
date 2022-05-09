/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiononline2;

/**
 *
 * @author User
 */
public class GameOfThrones {
    
    private String CharacterName , House;
    
    double Tactical , Army , Knowledge;
    
    
    public GameOfThrones(){
        
        this.Tactical = 0;
        this.Army = 0;
        this.Knowledge = 0;
        
    }

    public String getCharacterName() {
        return CharacterName;
    }

    public void setCharacterName(String CharacterName) {
        this.CharacterName = CharacterName;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String House) {
        this.House = House;
    }

    public double getTactical() {
        return Tactical;
    }

    public void setTactical(double Tactical) throws InvalidRatings {
        this.Tactical = Tactical;
        
        if(this.Tactical > 10){
          throw new InvalidRatings("Ratings cannot be greater than 10");
        }
        else if(this.Tactical <0){
          throw new InvalidRatings("Ratings cannot be negative");
        }
    }

    public double getArmy() {
        return Army;
    }

    public void setArmy(double Army) throws InvalidRatings {
        this.Army = Army;
        
        if(this.Army > 10){
          throw new InvalidRatings("Ratings cannot be greater than 10");
        }
        else if(this.Army <0){
          throw new InvalidRatings("Ratings cannot be negative");
        }
    }

    public double getKnowledge() {
        return Knowledge;
    }

    public void setKnowledge(double Knowledge) throws InvalidRatings {
        this.Knowledge = Knowledge;
        
        if(this.Knowledge > 10){
          throw new InvalidRatings("Ratings cannot be greater than 10");
        }
        else if(this.Knowledge <0){
          throw new InvalidRatings("Ratings cannot be negative");
        }
    }
    
    
    
    public void AvgRatings() throws InvalidForTheThrone{
    
        double avg = (this.Tactical + this.Army + this.Knowledge) / 3.0;
        
        
        if(avg < 8){
          
            throw new InvalidForTheThrone("You cannot claim the throne!!");
        }else{
            System.out.println("Good Luck !!!!");
        }
    
    }
    
    
    
    
}
