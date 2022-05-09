/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class InputDemo {
    public static void main(String[] args) throws Exception {
        
        /*
        
        BufferedReader br  = null;
        
        try{
            
            String str = "";
            br = new BufferedReader(new InputStreamReader(System.in));
            
            str = br.readLine();
            
        
        }catch(Exception e){
            
            System.out.println(e);
        
        }finally{
          br.close();
        }
        
        
     */
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            
            String str = "";
          
            str = br.readLine();
           
        }


        
        

    }
}
