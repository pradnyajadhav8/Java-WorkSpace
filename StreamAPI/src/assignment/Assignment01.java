package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import static java.util.stream.Collectors.toList;
/*
1. Get square of each number
Convert list of numbers into their squares
*/
public class Assignment01 {
	
	public static void main(String[] args) {
		
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,5,6,6,7,7,77,34);
		
		Function<Integer, Integer>square=n -> n*n;
		List<Integer> squareNumbers=numbers.stream()
				                           .map(square)
				                           .collect(toList());
		
		System.out.println(squareNumbers);
	}

}