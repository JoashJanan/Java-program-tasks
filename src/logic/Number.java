package logic;

import java.util.Scanner;

class a{
	protected int abc;
}
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		System.out.println("enter number of element you want to store:");
		int size =sc.nextInt();
		int[] array= new int[10];
		System.out.println("enter your array elements:");
		for(int i=0 ;i<size;i++)
		{
		array[i]=sc.nextInt();	
		}

		int len=array.length;
		System.out.println("length"+len);
		for(int k=0;k<len-1;k++)
		{
		for(int s=k+1;k<len;s++)
		{
		if(array[k]==array[s])
		{
			array[s]=array[len-1];
			len--;
		}
		}

		for(int i=0 ;i<size;i++)
		{
			System.out.println(array[i]);
		}

		}
	}

}
