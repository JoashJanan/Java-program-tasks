package logic;
import java.util.*;
public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] array= {2,3,4,6,3};
		 int[] uniquearray =new int[array.length];
		 int count=0;
		 System.out.println("Given array elements");
		 for(int s:array)
		 {
			 System.out.print(" "+ s);
		 }
		 Arrays.sort(array);
		 
		 
		 for(int i=0;i<array.length-1;i++)
		 {
			 if(array[i]!=array[i+1])
			 {
				 uniquearray[count]=array[i];
				 count++;
			 }
		 }
		
		 
		 uniquearray[count]=array[array.length-1];
		// System.out.println(array[array.length-1]);
		 System.out.println();
		 System.out.println("Unique elements");
		 
		 for(int i=0;i<count;i++)
		 {
			 System.out.println(uniquearray[i]);
		 }
	}

}
