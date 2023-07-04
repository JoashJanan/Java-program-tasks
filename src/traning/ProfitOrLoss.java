package traning;

import java.util.Scanner;
//5) Write a program to display and calculate profit or loss by a suitable example.
public class ProfitOrLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		   System.out.println("Enter your product cost");
		   int productcost=sc.nextInt();
		   System.out.println("Enter your selling cost");
		   int sellingcost=sc.nextInt();
		   
		   if(sellingcost==productcost)
		   {
			   System.out.println("we have no profite nor loss");
		   }
		   else if(sellingcost>productcost)
		   {
			   int s=sellingcost-productcost;
			   System.out.println("we have RS:"+s+" profite");
		   }
		   else
		   {
			   int s=productcost-sellingcost;
			   System.out.println("we have RS:"+s+" loss");
		   }
	}

}
