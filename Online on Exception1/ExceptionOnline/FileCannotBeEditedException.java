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
public class FileCannotBeEditedException extends Exception {
  

    public String fileformat;
    
    public FileCannotBeEditedException(String format){
        
    this.fileformat = format;
    
    }
    
    public String toString(){
       
        return "< " + fileformat + " >"+ "can not be edited";
        
    }
    
}
