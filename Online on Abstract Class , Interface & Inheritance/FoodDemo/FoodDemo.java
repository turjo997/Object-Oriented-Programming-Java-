/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddemo;

/**
 *
 * @author User
 */
public class FoodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pizza pz;
        
        pz = new Pizza(){};
        
        pz.setName("Pizza");
        pz.setCalories(266.0);
        pz.setFat(10.0);
        pz.setHealthIssues("Health issues are very high");
        
        System.out.println("Food is : " +pz.getName());
        System.out.println("Calories per 100 gm : "+pz.getCalories());
        System.out.println("Fat per 100 gm : "+pz.getFat());
        System.out.println(pz.Problems());
        System.out.println(pz.gethealthIssues());
        
        System.out.println("");
        
        Milk m;
        
        m = new Milk(){};
        
        m.setName("Milk");
        m.setCalories(42.0);
        m.setFat(1.0);
        m.setNutritionValue("Health benefits are very high");
        
        System.out.println("Food is : " +m.getName());
        System.out.println("Calories per 100 gm : "+m.getCalories());
        System.out.println("Fat per 100 gm : "+m.getFat());
        System.out.println(m.Calcium());
        System.out.println(m.getNutritionValue());
        
        System.out.println("");
        
        
        
        DietFood df;
        Salad s;
        
        s = new Salad(){};
        df = new Salad() {};
        
        s.setName("Salad");
        s.setCalories(20.0);
        s.setFat(0.2);
        s.setNutritionValue("Health benefits are high");
        
        df.Type();
        System.out.println("Food is : " +s.getName());
        System.out.println("Calories per 100 gm : "+s.getCalories());
        System.out.println("Fat per 100 gm : "+s.getFat());
        df.cholesterol();
        System.out.println(s.getNutritionValue());
        
        
    }
    
}
