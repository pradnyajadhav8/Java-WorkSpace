package com.basic;

import java.util.ArrayList;

public class Example01 {
	public static void main(String[] args) {

		ArrayList<Integer> num1 = new ArrayList<Integer>();

		System.out.println(num1.size());

		num1.ensureCapacity(1000);
		for (int i = 0; i < 1000; i++) {
			num1.add(i);
		}

		System.out.println(num1.size());

		for (int i = 0; i < 900; i++) {
			num1.remove(0);
		}
		System.out.println(num1.size());

		num1.trimToSize();
	}
}
