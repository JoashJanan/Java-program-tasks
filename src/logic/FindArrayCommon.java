package logic;

public class FindArrayCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Array1 []= {1,4,7,9,2};
		 int Array2 []={1,7,3,4,5};
		 int merg [] = new int [Array1.length+Array2.length];
		 System.out.println("Array1 Elements : 1,4,7,9,2 ");
		 System.out.println("Array2 Elements : 1,7,3,4,5 ");
		 int c=0;
		 for(int i=0;i<Array1.length;i++)
		 {
			for(int j=0;j<Array2.length;j++)
			{
				if(Array1[i]==Array2[j])
				{ 
					
					merg[c]=Array1[i];
					//System.out.println(Array1[i]);
					
					c++;
					}
			}
		 }
			
			
			
			for(int k=0;k<c;k++)
			{
				System.out.println("Common element in both arrays :"+merg[k]);
			}
			
	}

}
