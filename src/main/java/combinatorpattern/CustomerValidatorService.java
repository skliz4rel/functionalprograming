/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author skliz
 */

public class CustomerValidatorService{

	private boolean isEmailValid(String email){
		return email.contains("@");
	}

	private boolean isPhoneNumberValid(String phoneNumber){
		return phoneNumber.startsWith("+0");
	}

	private boolean isAdult(LocalDate dob){
		return Period.between(dob, LocalDate.now()).getYears() >= 18;
	}
        
        public boolean isValid(Customer customer){
            
            return isEmailValid(customer.getEmail())  &&
                    isPhoneNumberValid(customer.getPhoneNumber()) &&
                    isAdult(customer.getDob());
        }
        
}
