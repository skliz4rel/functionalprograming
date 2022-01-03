/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsection;

import java.util.function.Consumer;

/**
 *
 * @author skliz
 */
public class Modelingcallbacks {
   
    
public static void display(){

	hello("Jide", "Akindejoye", value->{
		System.out.println("no lastname provided for "+value);
	});
        
        hello2("Jide", "Akindejoye", ()->{
		System.out.println("no lastname provided for ");
	});
}

static void hello(String firstName, String lastName, Consumer<String> callback){
	System.out.println(firstName);

	if(lastName != null){
		System.out.println(lastName);
	}
	else{
		callback.accept(firstName);
	}
}

static void hello2(String firstName, String lastName, Runnable callback){
	System.out.println(firstName);

	if(lastName != null){
		System.out.println(lastName);
	}
	else{
		callback.run();
	}
}

}
