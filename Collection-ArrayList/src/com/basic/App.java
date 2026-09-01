package com.basic;

import java.util.ArrayList;
import java.util.ListIterator;

public class App {
	public static void main(String[] args) {

		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Naveen");
		friends.add("Ravi");
		friends.add("Snehal");
		friends.add("Sneha");
		friends.add("Raveena");
		friends.add("Tushar");
		// listIterator() present in java.util.List interface
		// while iterator present in java.util.Collection
		ListIterator<String> itr = friends.listIterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + "   ");
		}
		System.out.println();
		System.out.println("-----------------------------------");
		// ListIterator<String> ritr=friends.listIterator();
		ListIterator<String> ritr = friends.listIterator(friends.size());
		while (ritr.hasPrevious()) {
			System.out.print(ritr.previous() + "  ");
		}
		System.out.println();
		System.out.println("-----------------------------------");
		ListIterator<String> ritr2 = friends.listIterator(3);
		while (ritr2.hasPrevious()) {
			System.out.print(ritr2.previous() + "  ");
		}

	}
}
