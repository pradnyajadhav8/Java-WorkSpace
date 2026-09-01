package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example01 {

	public static void main(String[] args) {
		// Stream map(Function<T,R>)
		//

		List<String> friends = Arrays.asList("Ram", "Nitin", "Neha", "Amit");

		List<String> nameStartsWithN = new ArrayList<String>();

		for (String name : friends)
			if (name.startsWith("N"))
				nameStartsWithN.add(name);

		System.out.println(nameStartsWithN);

		// Using Stream API
		// step 1 Collection convert to Stream
		// Step 2 filter(Predicate predicate)
		// Step 3 collect
		System.out.println("------------------------------");
		Predicate<String> startWithN = name -> name.startsWith("N");

		friends.stream().filter(startWithN).forEach(System.out::println);

		System.out.println("------------------------------");

		friends.stream().filter(name -> name.startsWith("N")).forEach(System.out::println);

		System.out.println("------------------------------");

		List<String> nameWithN = friends.stream().filter(name -> name.startsWith("N")).collect(Collectors.toList());
		System.out.println(nameWithN);

	}

}