package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	//doesnt accept duplicates
	//no index
	//randomly stored
	//Iterator should be used for printing the data
	
	public static void main(String[] args)
	{
	
	HashSet<String> h=new HashSet<String>();
	h.add("java");
	h.add("India");
	h.add("usa");
	h.add("london");
	System.out.println(h);
	System.out.println(h.contains("london"));
	System.out.println(h.size());
	System.out.println(h.isEmpty());
	Iterator<String>itr=h.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

}
}
