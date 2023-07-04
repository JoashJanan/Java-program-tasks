package tasks;

import java.util.Scanner;

public class SpecialCharFinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your any name :");
		String name=sc.nextLine();
		char arr[]=name.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65 &&arr[i]<=95 || arr[i]>=97 && arr[i]<=122)
			{
				System.out.println(arr[i]+" is Alpabet");
			}
			else if(arr[i]>=47 && arr[i]<=58)
			{
				System.out.println(arr[i]+" is number");	
			}
			else
			{
				System.out.println(arr[i]+" is special character");
			}
		}
	}

}
