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
public class ExceptionOnline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
        try{
       
        PhotoEditor pd = new PhotoEditor();
        
        VideoEditor vd = new VideoEditor();
            
            pd.Edit("Online5.png");
            vd.Edit("Online5.txt");
        }catch(FileCannotBeEditedException e){
            e.printStackTrace();
        }
       
    }
    
}
