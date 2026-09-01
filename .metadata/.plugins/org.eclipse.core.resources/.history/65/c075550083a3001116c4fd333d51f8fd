package p1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App01 {

	public static void main(String[] args) {
		List<String> students = Arrays.asList("Nikhil", "Amit", "Neha", "Ravi");
		List<String> teachers = Arrays.asList("Nina", "John", "Naveen");
		List<String> players = Arrays.asList("Neymar", "Messi", "Nadal");

		System.out.println("+++++++++++++++++++++++++++++++++++++");
		Function<String, Predicate<String>> startsWithLetter = (String letter) -> {

			Predicate<String> checkStartWithLetter = (String name) -> name.startsWith(letter);

			return checkStartWithLetter;
		};

		long studCnt = students.stream()
							   .filter(startsWithLetter.apply("N"))
							   .count();

		System.out.println(studCnt);

	}

}
