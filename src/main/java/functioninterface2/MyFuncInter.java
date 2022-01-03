/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioninterface2;

/**
 *
 * @author skliz
 */
import java.util.function.BiFunction;

public class MyFuncInter implements BiFunction<Integer, Integer, Integer>{
 
    @Override
    public Integer apply(Integer a, Integer b){
        
        return a +b;
    }
}
        