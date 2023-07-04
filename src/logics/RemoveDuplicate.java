package logics;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] num= {4,3,4,4,6};
 int[] dup= new int[30];
 int count=0;
 
 int size =num.length;
 for(int i=0;i<size;i++)
 {
	 for(int j=i+1;j<size;j++)
	 {
		 if(num[i]==num[j])
		 {
			 num[j]=num[size-1];
			 size--;
			 j--;
			 //dup[count]=num[i];
			 //count++;
			 //num[i]=(Integer)null;
		 }
	 }
 }
 
 int[] arry =Arrays.copyOf(num, size);
 for(int k=0;k<arry.length;k++)
 {
	 System.out.println(arry[k]);
 }
	}

}
