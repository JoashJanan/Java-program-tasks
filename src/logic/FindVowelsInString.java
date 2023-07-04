package logic;
import java.util.*;
public class FindVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
Scanner sc= new Scanner(System.in);
System.out.println("enter your string:");
String name=sc.next();
for(int i=0;i<name.length();i++)
{
	char word=name.charAt(i);
	
	if(word =='a' || word =='e' || word =='i' || word =='o' || word =='u' || word =='A' || word =='E' || word =='I' || word =='O' || word =='U')
	{
		count++;
		System.out.println("Elements in given strings are :"+word);
	}
	
	}
System.out.println("Number of vowels in given string: "+count);
	}

}
