package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>() ;
		a.add("java");
	    a.add("sql");
	    a.add(2, "jmeter");
	    a.add("corejava");
	    System.out.println(a);
	    System.out.println(a.get(2));
	    /*a.remove(2);
	    a.remove("java");
	    System.out.println(a);*/
	    System.out.println(a.isEmpty());
	    System.out.println(a.contains("java"));
	    a.clear();
	    System.out.println(a.isEmpty());
		
	}

}
