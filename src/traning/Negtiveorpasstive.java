package traning;

import java.util.Scanner;
//2) Write a program to display whether a number is negative, positive or zero.
public class Negtiveorpasstive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		   System.out.println("Enter any number");
		   int num=sc.nextInt();
		   
		   if(num>0)
		   {
			   System.out.println("Given number "+num+" is positive");
		   }
		   else if(num<0)
		   {
			   System.out.println("Given number "+num+" is negative");			   
		   }
		   else
		   {
			   System.out.println("Given number "+num+" is zero");
		   }
	}

}
