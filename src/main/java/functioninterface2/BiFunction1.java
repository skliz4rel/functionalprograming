
package functioninterface2;

//import java.util.function.BiFunction;
import java.util.function.*;
import java.util.function.BiFunction;
/**
 *
 * @author skliz
 */
public class BiFunction1 {
    
    public static void display(){
        
        int result = incrementByOneAndMultiply(1,10);
        System.out.println(result);
        
        
     // a basic apply() example
    BiFunction<Integer, Integer, Integer> f1 = (a, b) -> a + b;
    System.out.println(f1.apply(10, 20)); // 30
        
      int biresult =  incrementByOneAndMultiplyBiFunction.apply(1,4);
        
      System.out.println(biresult);
    }
    
    
    public static int incrementByOneAndMultiply(int number, int numToMultBy){
        
        return (number+1) * numToMultBy;
    }

//Takes two argument and returns one result    
static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction = 
            (numberToincrementByOne, numberToMultiplyBy) ->
                      (numberToincrementByOne + 1) * numberToMultiplyBy;

}


