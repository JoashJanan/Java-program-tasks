package logic;

import java.util.HashSet;

public class UniqueChars {
	public static boolean checkUniqueChars (String word) {
		 
	     HashSet alphaSet=new HashSet();
	 
	     for(int index=0;index < word.length(); index ++)   {
	 
	         char c =word.charAt(index);
	         
	         // If Hashset's add method return false,that means it is already present in HashSet
	         if(!alphaSet.add(c))

	              return false;
	     }
	 
	     return true;
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("javablog has all unique chars : "+ checkUniqueChars("javablog"));
		  System.out.println("Apple has all unique chars : "+ checkUniqueChars("apple"));
		  System.out.println("index has all unique chars : "+ checkUniqueChars("index"));
		  System.out.println("world has all unique chars : "+ checkUniqueChars("world"));
		}
		 
		

}
