/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioninterface2;

import java.util.function.Function;



/**
 *
 * @author skliz
 */
public class _Function {
    

    public static void display(){

      int increment = incrementByOne(0);
      System.out.println(increment);
      
      int increment2 = incrementByOneFunction.apply(1);
      System.out.println(increment2);
      
      int multiply = multiplyBy10Function.apply(increment2);
      System.out.println(multiply);
      
      
      //Chaining the functions
      Function<Integer,Integer> addBy1AndThenMultiplyBy10 =
      incrementByOneFunction.andThen(multiplyBy10Function);

       int result =  addBy1AndThenMultiplyBy10.apply(1);
       
       System.out.println(result);
        
             
       
    }
    
    
    static int incrementByOne(int number){
            return number + 1;
    }
    
    //Writing the Function method of the method above.
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer,Integer> multiplyBy10Function = number -> number * 10;
    
}
