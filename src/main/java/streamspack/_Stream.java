/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamspack;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import static streamspack._Stream.Gender.FEMALE;
import static streamspack._Stream.Gender.MALE;

/**
 *
 * @author skliz
 */
public class _Stream {
    
    //Declare and initialize the variable.
   static List<Person> people = List.of(
            new Person("Jide", MALE),
             new Person("Gbemi", FEMALE),
              new Person("Bolaji", MALE),
               new Person("Bode", MALE),
                new Person("Kayode", MALE)
    );
    
    public static void display(){
        
        System.out.println("Sample usage of the streams api.....");
    
        //This would display the list of genders of peersons
        people.stream()
	.map(person->person.gender)
	.collect(Collectors.toSet())
	.forEach(System.out::println);
        
        //This would display the list of the names of the persons
        people.stream()
	.map(person->person.name)
	.collect(Collectors.toSet())
	.forEach(System.out::println);
        
        //This woudl display the length of the names
        people.stream()
	.map(person->person.name)
	.mapToInt(String::length)  // or mapToInt(name->name.length())
	.forEach(System.out::println);
        
        
        //Writing the methods in full
        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        //OR this below can work
        //ToIntFunction<String> length = name -> name.length();
        IntConsumer println = x -> System.out.println(x);

        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);
        
        
        
        //Other samples below
        
    //This would check if there only females
    boolean containsOnlyFemale = people.stream()
            .allMatch(person -> FEMALE.equals(person.gender));

    System.out.println(containsOnlyFemale);


    //Breaking it down in full
    Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
    containsOnlyFemale  = people.stream()
                                    .allMatch(personPredicate );  //This would check for all females.

    System.out.println("Only Females  "+containsOnlyFemale);
    
    
    //This would find at least one female
    boolean findAtleastoneFemale = people.stream()
                                    .anyMatch(personPredicate);
    
    System.out.println("Find at least one female "+findAtleastoneFemale);
    
    //This would check if we dont have a female in the list
    boolean hasNofemale = people.stream()
                                .noneMatch(personPredicate);
    
     System.out.println("As no fema "+findAtleastoneFemale);
 }
    
    
    
    static class Person{
        
       final String name;
       final Gender gender;
        
        Person(String name,Gender gender ){
            this.name = name;
            this.gender = gender;
        }
        
        @Override
        public String toString(){
            
            return "Person { 'name = '"+this.name+", gender = "+this.gender+"}";
        }
    }
    
    enum Gender{
        MALE, FEMALE
    }
}
