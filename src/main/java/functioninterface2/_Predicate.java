/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioninterface2;

import java.util.function.Predicate;

/**
 *
 * @author skliz
 */

public class _Predicate{

	public static void display(){

                System.out.println("Without Predicate ");
		System.out.println(isPhoneNumberValid("0700000000"));
		System.out.println(isPhoneNumberValid("0900000000"));
		
                System.out.println("With Predicate");
                System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
                System.out.println(isPhoneNumberValidPredicate.test("0900000000"));
                
                //This shows how to chain predicate below
                boolean check  = isPhoneNumberValidPredicate.and(containsNumber3Predicate).test("0900000000");
                System.out.println("Is phone number valid and contains number 3 "+check);
                
                check  = isPhoneNumberValidPredicate.and(containsNumber3Predicate).test("07000000003");
                System.out.println("Is phone number valid and contains number 3 "+check);
                
                //You can use OR instead of and
                 check  = isPhoneNumberValidPredicate.or(containsNumber3Predicate).test("07000000003");
                System.out.println("Is phone number valid OR contains number 3 "+check);
	}

	static boolean isPhoneNumberValid(String phoneNumber){

		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}

        static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

        static Predicate<String> containsNumber3Predicate = phoneNumber ->
	phoneNumber.contains("3");
}