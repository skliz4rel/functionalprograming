/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioninterface2;

import java.util.function.Consumer;

/**
 *
 * @author skliz
 */
public class _Consumer {
    
    public static void display(){

	//Normal java function or method
	Customer customer = new Customer("Maria","08131528807");   //customer.customerName;
	greetCustomer(customer);

	//Consumer Functional interface, takes an argument and returns nothing 
	greetCustomerConsumer.accept(customer);
}

//Normal method
public static void greetCustomer(Customer customer){
	System.out.println("Hello "+customer.customerName +", thanks for registering phone number "+
				customer.customerPhone);
}

//A cusumer method
static Consumer<Customer> greetCustomerConsumer = customer ->
	System.out.println("Hello "+customer.customerName +", thanks for registering phone number "+
				customer.customerPhone);


static class Customer{
	private final String customerName;
	private final String customerPhone;

	Customer(String customerName, String customerPhone){
		this.customerName = customerName;
		this.customerPhone = customerPhone;
	}
}
    
}
