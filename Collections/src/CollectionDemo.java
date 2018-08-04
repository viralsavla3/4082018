import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Oracle");
		v.add("Microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("IBM");

		System.out.println("--Iterating over vector using for each");
		for (String elem : v)
			System.out.println(elem);

		System.out.println("--Iterating over vector using Iterator");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		LinkedList<String> lst = new LinkedList<>();
		lst.add("Tesla");
		lst.add("Apache");
		lst.addFirst("Apple");

		v.addAll(lst);// merging all contents of vector and list
		System.out.println("--Iterator over updated vector using for each");
		for (String elem : v)
			System.out.println(elem);
		System.out.println("--Iterator over updated vector using Iterator");
		Iterator<String> itr2 = v.iterator();
		while (itr2.hasNext())
			System.out.println(itr2.next());

		// Converting vector into set
		HashSet<String> set = new HashSet<>(v);
		System.out.println("--Iterating over hashset using for each");
		for (String elem : set)
			System.out.println(elem);

		// Converting Set into TreeSet
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("--Iterating over TreeSet using for each");
		for (String elem : tree.descendingSet())
			System.out.println(elem);

		// New way to iterate from Java 8
		System.out.println("--Iterating over TreeSet using Java 8 ForEach()");
		tree.forEach(System.out::println);
		
		
		String[] week = {"Sun","MON","Tue","Wed","Thurs","Fri","Sat"};
		List<String> days = Arrays.asList(week);
		days.forEach(System.out::println);

	}
}
