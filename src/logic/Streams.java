package logic;
import java.util.*;
import java.util.stream.Collectors;
public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----map method----");
		// create a list of integers
	    List<Integer> number = Arrays.asList(2,3,4,5);
		 // demonstration of map method
	    List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
	    System.out.println(square);
	    
	    System.out.println("----filter method----");
	    
	  
	    // create a list of String
	    List<String> names = Arrays.asList("Reflection","Collection","Stream");
	  
	    // demonstration of filter method
	    List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
	    System.out.println(result);
	    
	    System.out.println("---sorted method-----");
	    
	  
	    // demonstration of sorted method
	    List<String> show = names.stream().sorted().collect(Collectors.toList());
	    System.out.println(show);
	  
	    System.out.println("---collect method returns a set (remove duplicate)-----");
	    
	    // create a list of integers
	    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
	  
	    // collect method returns a set
	    Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
	    System.out.println(squareSet);
	    
	    System.out.println("--- forEach method-----");
	  
	    // demonstration of forEach method
	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
	  
	    System.out.println("--reduce method------");
	    
	    // demonstration of reduce method
	    //int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	  
	    //System.out.println(even);

	}

}
