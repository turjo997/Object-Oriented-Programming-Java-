/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiononline;

import java.io.File;

/**
 *
 * @author User
 */
public class PhotoEditor implements Editor{
    
    
    
    public void Edit(String format) throws FileCannotBeEditedException{
        
        if(format.endsWith(".png")){
             System.out.println("Photo Editor is editing " + format);
        }
        else if(format.endsWith(".jpeg")){
           System.out.println("Photo Editor is editing " + format);
        }else{
            throw new FileCannotBeEditedException(format);      
        }
        
      
    }
}
