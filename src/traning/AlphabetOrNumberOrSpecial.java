package traning;

import java.util.Scanner;
//6) Write a program to display if a character is an alphabet, number or special character.
public class AlphabetOrNumberOrSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z')||(ch>='A')&&(ch<='Z'))
		{
			System.out.println("you entered alphabet character");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("you entered number");
		}
		else
		{
			System.out.println("you entered special character");	
		}
	    
	}

}
