/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinatorpattern;

import java.time.LocalDate;

/**
 *
 * @author skliz
 */
public class Customer{

	private final String name;
	private final String email;
	private final String phoneNumber;
	private final LocalDate dob;
	
	public Customer(String name, String email, String phoneNumber, LocalDate dob){
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
	}

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }
        
        
    
    
}