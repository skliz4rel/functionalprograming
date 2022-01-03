/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import static lesson1.DSample1.Gender.FEMALE;
import static lesson1.DSample1.Gender.MALE;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author skliz
 */
public class DSample1 {
    
        
    static List<Person> people = List.of(new Person("John",MALE),	
				new Person("John",MALE),
				new Person("Maria",FEMALE),
				new Person("Aisha",FEMALE),
				new Person("Alex",MALE),
				new Person("Alice",FEMALE)
				);
    
    
    
    public static void display_Imperative(){

           //Imperative approach

                List<Person> females = new ArrayList<>();

                 for(Person person : people){
                         if(FEMALE.equals(person.gender)){
                                 females.add(person);
                         }
                 }

                 for(Person person : females){
                         System.out.println(person);
                 }
            }
    
   
      public static void display_Declarative(){

            //Declarive approach
        people.stream()
        .filter(person-> FEMALE.equals(person.gender))
        //.collect(Collectors.toList())
        .forEach(System.out::println);
        
        
        //Or you can have it in this way too
        
        List<Person> females = people.stream()
        .filter(person-> FEMALE.equals(person.gender))
        .collect(Collectors.toList());
        
        females.forEach(item-> System.out.println("Each "+item));
}
    

static class Person{
	private final String name;
	private final Gender gender;
	
	Person(String name, Gender gender){
		this.name = name;
		this.gender = gender;
	}	

	@Override
	public String toString(){
		return "Person { name= "+this.name+", gender="+gender+"}";
	}
}

enum Gender{
	MALE, FEMALE
}

}
