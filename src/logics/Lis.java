package logics;

import java.util.ArrayList;

public class Lis {
public int getBinarySearchLis(int[] nums) {
        
        if(nums==null || nums.length==0)// [9,1,3,7,5,6,20]
            return 0;
     
        ArrayList<Integer> list = new ArrayList<>();
     //list - 1,3,5,6,20
        for(int num: nums){
            if(list.size()==0 || num>list.get(list.size()-1)){ //
                list.add(num);
                System.out.println("list from if loop " + list );
            }else{
                int i=0;
                int j=list.size()-1;
    
                while(i<j){
                    int mid = (i+j)/2;
                    System.out.println("value of mid "+ mid);
                    if(list.get(mid) < num){
                        i=mid+1;
                    }else{
                        j=mid;
                    }
                }
     
                list.set(j, num);
                System.out.println("value of list from else " + list);
            }
        }
     
        return list.size();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,1,3,7,5,6,20};
        Lis li = new Lis();
//        System.out.println("From normal method" +li.getLis(arr));
//        System.out.println("----------------------------------------\n");
        
        System.out.println("LIS " +li.getBinarySearchLis(arr));
	}

}
