package tasks;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name="joash",rev="";
 char s;
 for(int i=0;i<name.length();i++)
 {
	 s=name.charAt(i);
	 rev=s+rev;
 }
 System.out.println("using for loop:"+rev);
 
 
 char rr;
 String rv="";
 for(int j=name.length()-1;j>=0;j--)
 {
	rr=name.charAt(j);
	rv=rv+rr;
 }
	System.out.println("using reverse for loop:"+rv);
	}
	
	String fun="name";
	StringBuilder sb= new StringBuilder("st");
	

}
