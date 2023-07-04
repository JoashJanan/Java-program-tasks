package logic;

import java.util.LinkedList;
import java.util.List;
//List and its Implementing classes for 1. Array list 2.linked list 3.vector
	//get, set, add,remove
public class LinkedList_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--Linkedlist concepts--");
		List<String> Books = new LinkedList();
		Books.add("java");
		Books.add("Python");
		Books.add("C++");
		System.out.println("Linkedlist values :"+Books);

		System.out.println("-------------------");
		Books.add(1, "c#");
		System.out.println("Linkedlist values :"+Books);

		System.out.println("-------------------");
		String lnk=Books.get(1);
		System.out.println("Before  accessed element in Arraylist : "+Books);
		System.out.println("Accessed Element: " + lnk);


		System.out.println("-------------------");
		System.out.println("Before  accessed element in Arraylist : "+Books);
		Books.set(1, "c");
		System.out.println("after element change in linked list: " + Books);
		
		System.out.println("-------------------");
		System.out.println("Before  remove element in Arraylist : "+Books);
		Books.remove(0);
		System.out.println("After  remove element in Arraylist : "+Books);
	}

}
