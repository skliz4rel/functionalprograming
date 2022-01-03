
import combinatorpattern.CombinatorPattern;
import finalsection._Lambdas;
import functioninterface2.BiFunction1;
import functioninterface2._BIConsumer;
import functioninterface2._BiPredicate;
import functioninterface2._Consumer;
import functioninterface2._Function;
import functioninterface2._Predicate;
import functioninterface2._Supplier;
import lesson1.DSample1;
import optionals._Optional;
import streamspack._Stream;



public class Main {


    public static void main(String [] args){
        
        System.out.println("This is the main class");
        
        DSample1.display_Declarative();
        
        DSample1.display_Imperative();
        
        _Function.display();
        
        BiFunction1.display();
        
        _Consumer.display();
        
        _BIConsumer.display();
        
        _Predicate.display();
        
        _BiPredicate.display();
        
        _Supplier.display();
        
        _Stream.display();
        
        _Optional.display();
        
        //This is goign to illustrate the combinational design patterns
        CombinatorPattern.computeOldApproach();
        
        CombinatorPattern.combinatorApproach();
        
        _Lambdas.display();
    }
    
}
