package tasks;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Please Enter any Number to Check whether it is Divisible by 5 and 11 : ");
int num=sc.nextInt();
	
	if(num%5==0 && num%11==0)
	{
		System.out.println("Given number" + num + " is Divisible by 5 and 11");
	}
	else
	{
		System.out.println("Given number" + num + " is Not Divisible by 5 and 11");
	}
	}

}
