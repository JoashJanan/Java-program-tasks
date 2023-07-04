package logic;
import java.util.List;
import java.util.Vector;
public class Vector_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> animals = new Vector();
animals.add("cat");
animals.add("dog");

System.out.println("---------------");
System.out.println("before adding elements in vector:"+animals);
animals.add(1, "rat");
System.out.println("after adding elements in vector:"+animals);

System.out.println("---------------");
System.out.println("before adding elements in vector:"+animals);
animals.set(1, "lion");
System.out.println("after changing elements in vector:"+animals);


System.out.println("---------------");
System.out.println("before adding elements in vector:"+animals);
String vct=animals.get(0);
System.out.println("accessed elements in vector:"+vct);
	
System.out.println("---------------");
System.out.println("before remove elements in vector:"+animals);
animals.remove(1);
System.out.println("after remove elements in vector:"+animals);	
	}

}
