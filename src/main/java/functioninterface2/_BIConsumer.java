/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioninterface2;

import java.util.function.BiConsumer;

/**
 *
 * @author skliz
 */
public class _BIConsumer {
    
    public static void display(){
    
        
        Customer customer = new Customer("Mike", "08131422669");
        
        //Using the normal Java method
        showCustomer(customer, true);
        
        //Using the BiConsumer function approach in Java
        showCustomerBiConsumer.accept(customer,false);
    }


    public static void showCustomer(Customer customer, boolean showNumber){
        
        System.out.println("This is customer "+customer.name+" phone of customer "+
                (showNumber ? customer.phone : "***********"));
                
    }
    
    static BiConsumer<Customer, Boolean> showCustomerBiConsumer = (customer, showNumber) ->
              System.out.println("This is customer "+customer.name+" phone of customer "+
                (showNumber ? customer.phone : "***********")); 
    
    
    //Create the object
    static class Customer{
    
        private final String name;
        private final String phone;
        
        
        Customer(String name, String phone){
            this.name = name;
            this.phone = phone;
        }
        
        
    }
    
}
