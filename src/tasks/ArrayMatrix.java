package tasks;

import java.util.Scanner;

public class ArrayMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a[][]= {{1,2,3},{2,2,2}};
		int b[][]= {{5,6,3},{8,5,6}};
		int c[][] = new int[2][3];
	
		for(int g=0;g<2;g++)
		{
			for(int h=0;h<3;h++)
			{
				//c[g][h]=a[g][h]+b[g][h];
				//System.out.print(c[g][h]+" ");
				System.out.println();
				c[g][h]=sc.nextInt();
			}
			System.out.println();
		}
		for(int g1=0;g1<2;g1++)
		{
			for(int h1=0;h1<3;h1++)
			{
				//c[g][h]=a[g][h]+b[g][h];
				//System.out.print(c[g][h]+" ");
				System.out.print(c[g1][h1]+"");
				
			System.out.println();
		}
	}

}
}
