/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optionals;

import java.util.Optional;
import java.util.function.Supplier;

/**
 *
 * @author skliz
 */
public class _Optional {
    
    public static void display(){
        
      Object value = Optional.ofNullable(null)
                .orElseGet(() ->"default value");
        
      System.out.println(value);
      
      
      //Second approach
      Supplier<IllegalStateException> exception = ()
	-> new IllegalStateException("exception");

       value = Optional.ofNullable("Hello")
                        .orElseThrow(exception);

        System.out.println(value);
      
        
        //This would only print when there is a value.
        //This can be used with {} when you want to enter a block of code
        Optional.ofNullable("Hello")
	.ifPresent(it ->{
		System.out.println(it);
	});

        //This would be used to print.
        Optional.ofNullable("Hello")
	.ifPresent(item -> System.out.println(item));

        
        //This would only print on a single line.
        Optional.ofNullable("Hello")
	.ifPresent(System.out::println); //using lambda method reference.


        //This would print when present and run a Runnable if it is not present.
        Optional.ofNullable("skliz4rel")
	.ifPresentOrElse(
		email -> System.out.println("Sending email to "+email),
		() -> { //This is a runnable.
			System.out.println("Cannot send email....");
		}
	);

        
        Optional.ofNullable(null)
	.ifPresentOrElse(
		email -> System.out.println("Sending email to "+email),
		() -> System.out.println("Cannot send email....") //This is a runnable.	
		
	);
        
        
    }
    
    
}