/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author skliz
 */
public class _Lambdas {
    
    public static void display(){
    
    	Function<String,String> printName = name -> name.toUpperCase();

		Function<String, String> processName = (name) -> {

			if(name.isBlank()) throw new IllegalArgumentException("");

			return name.toUpperCase();
		};

		BiFunction<String,Integer,String> doMagic = (name,age) -> {

			return name.toUpperCase();
		};

		System.out.println("From do magic function "+doMagic.apply("Femi", 30));
    }
    
}