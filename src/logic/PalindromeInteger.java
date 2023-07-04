package logic;
import java.util.*;
public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your number:");
int num=sc.nextInt();
int rem,sum=0,temp;
temp=num;
while(num>0)
	{
		rem=num%10;		
		sum=(sum*10)+rem;		
		num=num/10;		
	}


if(temp==sum)
{
	System.out.println("its palendrome number");
}
else
{
	System.out.println("its not palendrome number");	
}
	}

}
