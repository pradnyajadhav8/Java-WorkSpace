package p2;

import java.util.HashMap;

public class Example02 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(map.put(11, "Mayuri"));
		System.out.println(map.put(11, "Pradnya"));
		System.out.println(map.put(10, "Pradnya"));

		map.put(21, "Rahul");
		map.put(2, "Rohit");
		map.put(23, "Ram");
		map.put(222, "Ramesh");
		map.put(22, "Raghav");
		map.put(20, "Reva");
		map.put(200, "Rohini");

		System.out.println(map);
		System.out.println("Contains key: " + map.containsKey(21));
		System.out.println("Contains value: " + map.containsValue("Pradnya"));

		System.out.println("Get ---->" + map.get(222));
		System.out.println("Get ---->" + map.get(11));
		System.out.println("Get ---->" + map.get(50));

		System.out.println(map.getOrDefault(10, ""));
		System.out.println(map.getOrDefault(12, "Omkesh"));
		System.out.println("Size : " + map.size());
		map.clear();
		System.out.println(map);
	}
}
