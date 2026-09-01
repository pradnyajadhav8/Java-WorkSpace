package list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		Deque<String> list = new LinkedList<String>();

		list.add("Kareena");
		list.add("Raveena");
		System.out.println(list);

		list.push("Katrina");
		System.out.println(list);

		System.out.println("-----------------------");

		Deque<Integer> numDeque = new LinkedList<Integer>();
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0)
				numDeque.addLast(i);
			else
				numDeque.addFirst(i);
		}

		System.out.println(numDeque);

		Deque<Character> groupOfCharacter = new ArrayDeque<Character>();

		for (char letter = 'A'; letter <= 'Z'; letter++) {
			groupOfCharacter.addLast(letter);
		}

		System.out.println(groupOfCharacter);
	}
}
