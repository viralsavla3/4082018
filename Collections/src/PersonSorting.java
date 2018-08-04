import java.util.TreeSet;

public class PersonSorting {

	public static void main(String[] args) {
		PersonComparator pc = new PersonComparator();
		TreeSet<Person> persons = new TreeSet<>(pc);

		persons.add(new Person("Polo", 21));
		persons.add(new Person("Lily", 20));
		persons.add(new Person("Kaushal", 22));

		persons.forEach(System.out::println);
	}

}
