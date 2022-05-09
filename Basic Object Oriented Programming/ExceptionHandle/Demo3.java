
package exceptionhandle;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Demo3 {
    
    public static void main(String[] args) {
        
        int num = 0 ;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        
        try{
            
            num = sc.nextInt();
            if(num > 10){
            
                throw new MyException1("Number can't be grater than 10");
            }  
        
        }catch(MyException1 m){
           // System.out.println("Number can't be grater than 10");
           
           m.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
            
            //System.out.println("Number can't be grater than 10");
        
        }
                
          System.out.println("Program Ends");
        
        
    }
    
}

class MyException1 extends Exception{
        
        public MyException1(String msg){
            
            super(msg);
            
          //  System.out.println("Number can't be greater than 10 (constructor)");
              
        }

}


