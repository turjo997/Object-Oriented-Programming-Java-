/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class ExceptionHandle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int i , j , k = 0;
       int a[] = new int[4];
       
       BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        
       i = 8 ;
       try{
           
           System.out.println("Enter a number");
           
           j = Integer.parseInt(br.readLine());       
           //k = i/j;
           
           k = i + j;
           
           if(k < 10){
             
               throw new ArithmeticException();
           
           }
           
           System.out.println(k);
          // System.out.println("Bye");
           //for(int c = 0 ; c<=4 ; ++c){
             //a[c] = c+1;
         //  }
           
           //for(int val : a){
              // System.out.println(val);
          // }
           
       }catch(IOException e1){
           System.out.println(e1);
       }catch(ArithmeticException e){
           System.out.println("Arithmetic Exception is " +e);
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }
       catch(Exception e){
           System.out.println(e);
       }
       finally{
           System.out.println("Ok done");
       }
    }
    
}
