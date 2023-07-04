package logic;

import java.util.StringJoiner;

public class PreficSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Separated the elements with a comma in between.  
        //Added a prefix "(" and a suffix ")"  
        StringJoiner joiner = new StringJoiner(" ,", "(", ")");  
        joiner.add("Anubhav");  
        joiner.add("Gaurav");  
        joiner.add("Tanmay");  
        joiner.add("Nikhil");  
        joiner.add("Harsh");  
        // Added elements into StringJoiner "joiner"  
        System.out.println(joiner);  
	}

}
