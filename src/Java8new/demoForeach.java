/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8new;

import static com.sun.tools.javac.util.List.collector;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class demoForeach {
    
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4,5,6,7,8);
        
        for(int i = 0; i < values.size() ; ++i){
             System.out.println(values.get(i));
        }
        
        System.out.println("");
        
        // Enhanced for loop
        for(int i : values){
            System.out.println(i);
        }
        
        System.out.println("");
        
        values.forEach(i-> System.out.print(i + " "));
        System.out.println("");
        values.stream().forEach(System.out::println);
        System.out.println("");
        values.parallelStream().forEach(System.out::println);
        
        System.out.println("");
        
        values.stream().filter(i -> {
            System.out.println(i);
            return true;
        });
        
        
        
        
        
        List<Integer> number = Arrays.asList(2,3,4,5);
        
        List<Integer> square = number.stream().map(x -> x*x).
                           collect(Collectors.toList());
        System.out.println(square);
        
        
         List<String> names  = Arrays.asList("Reflection","Collection","Stream" , "Sunflower");
  
        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                              collect(Collectors.toList());
        System.out.println(result);
        
        
         // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
        
        
        
         // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet =
             numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        
        
         // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));
  
        // demonstration of reduce method
        int even =
           number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
  
        System.out.println("");
        System.out.println(even);
        
    }
}
