/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8new;

interface A{
  void show(int i);
}

//class B implements A{
//  
//    public void show(int i){
//        System.out.println("showing" + i);
//    }
//   
//}


public class LamdaDemo {
    
    public static void main(String[] args) {
        
//        A ob;
//        ob = new B();
//        ob.show();


//        A ob;
//        ob = new A(){
//              @Override
//              public void show(int i){
//               System.out.println("showing" + i);
//              }
//        };
//        ob.show();


//        A ob;
//        ob = (int i)->{
//            System.out.println("showing " + i);
//        };


//        A ob;
//        ob = (int i)->System.out.println("showing " + i);
//        

        A ob;
        ob = i->System.out.println("showing " + i);
        
        ob.show(5);
        
    }
    
}
