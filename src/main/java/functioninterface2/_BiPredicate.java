/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioninterface2;

import java.util.function.BiPredicate;

/**
 *
 * @author skliz
 */
public class _BiPredicate {
    
    public static void display(){
    
        System.out.println("The normal way in Java");
        System.out.println("Normal method checks in java  "+checkConditions("07000000034","3"));
        
        System.out.println("The BiPredicate way in Java");
        boolean check = checkConditionsPredicate.test("07000000034","3");
        System.out.println("BiPredicate functional checks in Java  "+check);
    }
    
    public static boolean checkConditions(String phoneNumber, String numContains){
        
        return (phoneNumber.startsWith("070") && phoneNumber.trim().length() == 11 && numContains.contains("3")) ? true : false;
    }
    
    static BiPredicate<String,String> checkConditionsPredicate = (phoneNumber,numContains ) ->
            (phoneNumber.startsWith("070") && phoneNumber.trim().length() == 11 && numContains.contains("3")) ? true : false;
            
}
