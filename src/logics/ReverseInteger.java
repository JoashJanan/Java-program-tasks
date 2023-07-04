package logics;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123,rem,sum=0;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		
		}
		
		System.out.println("Reverser a Given Number :"+ sum);
	}

}
