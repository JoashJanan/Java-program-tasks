package logic;
import java.util.List;
import java.util.ArrayList;
public class AraayList_Program {
	
	//List and its Implementing classes for 1. Array list 2.linked list 3.vector
	//get, set, add,remove
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Array list concepts");
List<String> Languages = new ArrayList();
Languages.add("java");
Languages.add("Python");
Languages.add("C++");
System.out.println("Arraylist values :"+Languages);

System.out.println("Adding element with index value");
Languages.add(1, "cc");
System.out.println("Arraylist values :"+Languages);

String Remove =Languages.remove(2);
System.out.println("After remove values in Arraylist  :"+Languages);
System.out.println("Removed Element: " + Remove);
System.out.println("-------------------");

String str=Languages.get(1);

System.out.println("Before  accessed element in Arraylist : "+Languages);
System.out.println("Accessed Element: " + str);

System.out.println("-------------------");
Languages.set(1, "JavaScript");
System.out.println("After changing values in Arraylist  :"+Languages);


	
	
	
	}

}
