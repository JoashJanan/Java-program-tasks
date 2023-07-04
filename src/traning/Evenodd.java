package traning;

import java.util.Scanner;
//1) Write a program to display whether a number is even or odd.
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter any number");
   int num=sc.nextInt();
   if(num%2==0)
   {
	   System.out.println("given number "+num+" is even");
   }
   else
   {
	   System.out.println("given number "+num+" is odd");
   }
	}

}
