package logic;
import java.util.*;
import java.util.Arrays;

public class LIS {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] a= {10, 22, 9, 33, 21, 50, 41, 60};
 ArrayList<Integer> ss= new ArrayList<Integer>();
 for(int aa:a)
 {
	 ss.add(aa);
 }
 
 int size=ss.size();
 
 for(int i=0;i<ss.size()-1;i++)
 {
	 if(ss.get(i-1)<ss.get(i))
	 {
		 ss.remove(i+1);
		 i--;
		 System.out.println(ss);
	 }
 }
 
 System.out.println(size);
	}

}
