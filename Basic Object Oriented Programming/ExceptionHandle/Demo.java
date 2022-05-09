/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandle;

/**
 *
 * @author User
 */
public class Demo {
       
    public static void main(String[] args) {
          
        int i = 8;
        
        try{
         
            if(i < 10){
              
                throw new MyException("Errrorrr");
            }
            
        }catch(MyException e){
            System.out.println("Exception is  " +e);
        }
    }
}

class MyException extends Exception{

     public MyException(String msg){
        
         super(msg);
     }
     
}
