/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;

/**
 *
 * @author User
 */
public class FileDemo {
     public static void main(String[] args) {
        
         /*
         File dir = new File("C:/Users/User/Desktop/Person");
         
         dir.mkdir();
                 
         String dirloc = dir.getAbsolutePath();
         
         System.out.println(dirloc);
         System.out.println(dir.getName());
         
         dir.delete();
         
         */
         
         File dir = new File("person");
         dir.mkdir();
         String path = dir.getAbsolutePath();
         System.out.println(path);
         File file1 = new File(path + "/student.txt");
         File file2 = new File(path + "/teacher.txt");
         try{
             file1.createNewFile();
             file2.createNewFile();
             System.out.println("Files are created");
             
         }catch(Exception e){
             System.out.println(e);
         }
         
         /*
         file2.delete();
         
         if(file2.exists()){
             System.out.println("File exists");
         }else{
             System.out.println("File does not exist");
         
         }

       */

    }
}
