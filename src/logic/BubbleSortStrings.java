package logic;

public class BubbleSortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str[]= {"Joash","Vignesh","Guru"};
	String temp;
System.out.println("before Bubble sort");
System.out.println();
	for(String s:str)
	{
	System.out.println(s);	
	}
	
	System.out.println("After Sorting :");
	System.out.println();
	for(int i=0;i<str.length;i++)
	{
		for(int j=i+1;j<str.length;j++)
		{
			if(str[i].compareTo(str[j])<0)
			{
				temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
		}
		System.out.println(str[i]);
	}
	
	
	}

}
