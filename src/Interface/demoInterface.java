/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

interface phone{
     void call();
     default void message(){
         System.out.println("sent");
     }
}

class AndroidPhone implements phone{
    
    @Override
    public void call(){
        System.out.println("calling");
    }

}



public class demoInterface {
    
    public static void main(String[] args) {
        
        phone p = new AndroidPhone();
        p.call();
        p.message();
          
    }
}
