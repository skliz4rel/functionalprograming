/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinatorpattern;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;
import static combinatorpattern.CustomerRegistrationValidator.isAnAdult;
import static combinatorpattern.CustomerRegistrationValidator.isPhoneNumberValid;
import java.time.LocalDate;

/**
 *
 * @author skliz
 */
public class CombinatorPattern {
    
    static  Customer customer = new Customer("Alex","alice@gmail.com","+0121223", LocalDate.of(2000,1,1));

    
    public static void computeOldApproach(){
        
       
        boolean check = new CustomerValidatorService().isValid(customer);
        System.out.println("Is the customer valid  "+check);
     
    }
    
    public static void combinatorApproach(){
        
         System.out.println("This is example using combinator design pattern");
//Using CombinatorPatter
ValidationResult result = CustomerRegistrationValidator
	.IsEmailValid()
	.and(isPhoneNumberValid())
	.and(isAnAdult())
	.apply(customer);

        

        if(result != ValidationResult.SUCCESS){
                throw new IllegalStateException("validation error "+result.name());
        }
        else
            System.out.println(result);
        
    }
    
}
