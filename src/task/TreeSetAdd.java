package task;

import java.security.DrbgParameters.NextBytes;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> ts1 = new TreeSet<String>();
ts1.add("joash");
ts1.add("John");
ts1.add("joe");

System.out.println("Number of elements in tree "+ts1);
System.out.println("size of treeset :"+ts1.size());

TreeSet<Integer> ts2 = new TreeSet<Integer>();
TreeSet<Integer> findset = new TreeSet<Integer>();
ts2.add(1);
ts2.add(2);
ts2.add(3);
ts2.add(4);
ts2.add(5);
ts2.add(6);
ts2.add(7);
ts2.add(8);
ts2.add(9);
ts2.add(10);
//find less then 7 numbers in set
findset =(TreeSet) ts2.headSet(7);
System.out.println("Number of Element less than 7 is : "+findset);
/*
Iterator it= findset.iterator();

while(it.hasNext())
{
System.out.println(it.next());
}
*/
TreeSet<Integer> ts3 = new TreeSet<Integer>();
ts3.add(12);
ts3.add(32);
ts3.add(53);
ts3.add(46);
ts3.add(58);
ts3.add(65);
ts3.add(74);
ts3.add(84);
ts3.add(95);
ts3.add(10);
System.out.println("Greater than or equal to 11 :"+ts3.ceiling(11));
System.out.println("Less than or equal to 11 :"+ts3.floor(11));
 




	}

}
