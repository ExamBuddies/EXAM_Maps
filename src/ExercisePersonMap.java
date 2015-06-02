import java.util.HashMap;
import java.util.Map;

public class ExercisePersonMap
{

	public static void main(String[] args)
	{
		// Create a Person class with the relevant attributes (fields) and methods
		// Then Create a HashMap where the key is the cpr number and the value is the person object
		// Then get the persons name when searching for the cpr in the map.
		// Use the put() and get() methods.

		Map<String, Person> persons = new HashMap<String, Person>();
		Person person = new Person(24, "Ole", "12345678-1234");
		persons.put(person.getCpr(), person);

		System.out.println(persons.get("12345678-1234"));
		
	}

}