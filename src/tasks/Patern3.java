package tasks;
/*
 * 5)Write a program to print following Pattern
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1*/
public class Patern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 for(int i=1;i<=5;i++)
 {
	 int num;
	 if(i%2==0)
	 {
		 num=0;
		 System.out.print(num);
	 }
	 else
	 {
		 num=1;
		 System.out.print(num);
	 }
	 for(int j=1;j<5;j++)
	 {
		 if(num==1)
		 {
			 num=0;
		 }
		 else
		 {
			 num=1;
		 }
		 System.out.print(num);
	 }
	 
	 System.out.println();
 }
	
	System.out.println("-------");
	int n=5;
	for(int k=1;k<=n;k++)
	{
		for(int l=1;l<=n;l++)
		{
			if((k+l)%2==0)
			{
				System.out.print("1");
			}
			else
			{
				System.out.print("0");
			}
		}
		System.out.println();
	}
	
	}

}
