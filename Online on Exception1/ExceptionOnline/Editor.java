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
public interface Editor {
    
    
    public void Edit(String format) throws FileCannotBeEditedException;
    
}
