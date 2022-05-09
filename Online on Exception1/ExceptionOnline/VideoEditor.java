/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiononline;

/**
 *
 * @author User
 */
public class VideoEditor implements Editor {
 
    
       public void Edit(String format) throws FileCannotBeEditedException{
        
        if(format.endsWith(".mp4")){
             System.out.println("Video Editor is editing " + format);
        }
        else if(format.endsWith(".wmv")){
           System.out.println("Video Editor is editing " + format);
        }else{
            throw new FileCannotBeEditedException(format);      
        }
        
      
    }
}
