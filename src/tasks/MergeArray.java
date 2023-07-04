package tasks;

import java.util.Arrays;
// merging two array and sorting without any function
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {10,2,3};
       int b[]= {4,15,6};
       
       int a1=a.length;
       int b1=b.length;
       int c1=a1+b1;
        int c[]= new int[c1];
        
        for(int i=0;i<a1;i++)
        {
        	c[i]=a[i];
        }
        for(int i=0;i<b1;i++)
        {
        	c[a1+i]=b[i];
        }
         System.out.println("after merge");
        for(int a11:c)
        {
        	System.out.print(a11+",");	
        }
      
       // Arrays.sort(c);
        for(int s=0;s<c.length;s++)
        {
        for(int u=s+1;u<c.length;u++)
        {
        	int temp=0;
        	if(c[s]>c[u])
        	{
        	 temp=c[s];
        	c[s]=c[u];
        	c[u]=temp;
        	}
        }
        }
        for(int newa: c) 
        {
        System.out.println(newa);
        }
        
        
	}

}
