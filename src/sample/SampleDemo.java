package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s= new ArrayList<String>();
		s.add("apple");
		s.add("graps");
		s.add("table");
		s.add("apple");
		s.add("banana");
		s.add("fan");
		s.add("fridge");
		s.add("bike");
		s.add("bulb");
		//Arrays.sort(s.toArray());
		//Collections.reverse(s);;
		
		Collections.sort(s); // display ArrayList in Accesending order
		
		Collections.sort(s,Collections.reverseOrder());//// display ArrayList in Decending order
		System.out.println(s);
		
		/*
		 * for(String ss:s) { System.out.println(ss); }
		 */
	}

}
