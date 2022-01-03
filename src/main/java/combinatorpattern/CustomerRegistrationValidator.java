/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinatorpattern;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.EMAIL_NOT_VALID;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.IS_NOT_AN_ADULT;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.PHONE_NUMBER_NOT_VALID;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

/**
 *
 * @author skliz
 */
public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult>{


	static CustomerRegistrationValidator IsEmailValid(){
		return customer -> customer.getEmail().contains("@") ?
			SUCCESS : EMAIL_NOT_VALID;
	}

	static CustomerRegistrationValidator isPhoneNumberValid(){

		return customer -> customer.getPhoneNumber().startsWith("+0") ?
		SUCCESS : PHONE_NUMBER_NOT_VALID;
	}

	static CustomerRegistrationValidator isAnAdult(){

		return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() >= 18 ?
			 SUCCESS : IS_NOT_AN_ADULT;
		
	}

        default CustomerRegistrationValidator and (CustomerRegistrationValidator other){

	return customer -> {
		ValidationResult result = this.apply(customer);
		return result.equals(SUCCESS) ? other.apply(customer) : result;
	};
    }
        
	enum ValidationResult{
		SUCCESS, 
		PHONE_NUMBER_NOT_VALID,
		EMAIL_NOT_VALID,
		IS_NOT_AN_ADULT
	}	
}

