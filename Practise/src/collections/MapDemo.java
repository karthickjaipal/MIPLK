package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "First");
		hm.put(1, "second");
		hm.put(2, "third");
		hm.put(3, "Fourth");
		hm.put(4, "Fifth");
		hm.put(5, "sixth");
		hm.get(0);
		hm.containsKey(5);
		hm.isEmpty();
	    hm.remove(5);
	    //To print the keys
	    Set<Integer> hs=hm.keySet();
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//To print the values
		Collection<String> col=hm.values();
		Iterator<String> it=col.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		hm.
		

	}

}
