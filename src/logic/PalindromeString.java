package logic;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("enter your string");
      String name=sc.next();
      String rev="";
      for(int i=name.length()-1;i>=0;i--)    	  
      {
    	rev=rev+name.charAt(i);
      }
      if(name.toLowerCase().equals(rev.toLowerCase()))
      {
    	 System.out.println(name.toLowerCase()+" is palindrome"); 
      }
      else
      {
    	  System.out.println(name.toLowerCase()+" is not palindrome");  
      }
      
	}

	
}
