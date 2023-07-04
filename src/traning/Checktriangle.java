package traning;

import java.util.Scanner;
//4) Write a program to display whether the triangle is equilateral, isosceles or scalene
//triangle.
public class Checktriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		   System.out.println("Enter tringle side 1:");		   
		   double side1=sc.nextDouble();
		   System.out.println("Enter tringle side 2:");		   
		   double side2=sc.nextDouble();
		   System.out.println("Enter tringle side 3:");		   
		   double side3=sc.nextDouble();
		   
		   if(side1==side2 && side2==side3)
		   {
			   System.out.println("its equilateral triangle");
		   }
		   else if(side1==side2 || side2==side3 || side1==side3)
		   {
			   System.out.println("its isosceles triangle");
		   }
		   else
		   {
			   System.out.println("its scalene triangle");
		   }
	}

}
