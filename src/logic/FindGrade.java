package logic;
import java.util.*;
import java.util.Scanner;
public class FindGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int marks[] =new int[6];
	int total=0,avg;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number of student marks you want to enter:");
	int size=sc.nextInt();
	for(int i=0;i<size;i++)
	{
		System.out.println("enter mark of subject"+(i+1)+":");
	 marks[i]=sc.nextInt();	
	total=total+marks[i];
	}
	
	System.out.println("Total is:"+total);
	avg=total/2;
     System.out.println("Average  is:"+avg);
	System.out.println("Grade of student is:");
	if(avg>80)
	{
		System.out.println("Grade A");
	}
	else if(avg>=60 && avg<80)
	{
		System.out.println("Grade B");
	}
	else if(avg>=40&& avg<60)
	{
		System.out.println("Grade C");
	}
	else
	{
		 System.out.print("D");
		 
	}
	}

}
