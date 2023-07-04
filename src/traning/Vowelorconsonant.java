package traning;

import java.util.Scanner;
//3) Write a program to input an alphabet and display whether it is a vowel or a consonant.
public class Vowelorconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		   System.out.println("Enter any character");
		   char character=sc.next().charAt(0);
		   char ch= Character.toLowerCase(character);
		   
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
   {
	System.out.println("given character "+ch+" is vowels");   
   }
   else {
	   System.out.println("given character "+ch+" is consonants");
   }
		   
	}

}
