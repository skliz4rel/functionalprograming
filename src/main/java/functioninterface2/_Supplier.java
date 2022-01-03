/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioninterface2;

import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author skliz
 */

public class _Supplier{

	public static void display(){

		String connecturl = getDbConnectionUrl();
		System.out.println(connecturl);

		//Using the supplier functional method
		System.out.println(getDbConnectionUrlSupplier.get() );	

		System.out.println(getDbConectionUrlsSupplier.get());	
	}

	static String getDbConnectionUrl(){

		return "jdbc://localhost:5432/users";
	}

	//Supplier version
	static Supplier<String> getDbConnectionUrlSupplier = () ->
		"jdbc://localhost:5432/users";

	static Supplier<List<String>> getDbConectionUrlsSupplier = () ->
		List.of("jdbc://localhost:5432/users", "jdbc://localhost:5432/cutomers");
	

	static Supplier<Integer> getOne = () -> 1;

	static Supplier<Integer> getTwo = () -> 2;
		
}