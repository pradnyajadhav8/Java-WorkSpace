package p1;

import java.util.HashMap;
import java.util.Map;

public class Example01 {
	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put(31, null);
		m1.put(2, "Pradu");
		m1.put(10, "kareena");
		m1.put(3, "Pradu");
		m1.put(1, 99.99);
		m1.put(11, 88888888);
		m1.put(21, 88888888);
		m1.put(22, 88888888);
		System.out.println(m1);
	}
}
