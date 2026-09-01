package p3;

import java.util.HashMap;

public class Example03 {
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(21, "Rahul");
		map.put(2, "Rohit");
		map.put(23, "Ram");
		map.put(222, "Ramesh");
		map.put(22, "Raghav");
		map.put(20, "Reva");
		map.put(200, "Rohini");
		
		System.out.println(map.remove(22));
		System.out.println(map.remove(10));
		System.out.println(map.remove(22,"rag"));
		System.out.println(map.remove(20,"Reva"));
		System.out.println(map.remove(21,"Rahul"));
		System.out.println(map.remove(100,"Rohini"));
		
		System.out.println(map);
	}
}
