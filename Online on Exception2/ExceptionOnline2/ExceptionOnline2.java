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
public class ExceptionOnline2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GameOfThrones ob = new GameOfThrones();
        
        ob.setCharacterName("ABC");
        ob.setHouse("EDF");
        
        
        try{
        
            ob.setArmy(8);
            ob.setTactical(8);
            ob.setKnowledge(8);
            
            ob.AvgRatings();
            
        }catch(InvalidRatings e){
            System.out.println(e);
        }
        catch(InvalidForTheThrone e){
            System.out.println(e);
        }
        finally{
          
            System.out.println("Valar Morghulis");
        }
        
       
        
        
    }
    
}
