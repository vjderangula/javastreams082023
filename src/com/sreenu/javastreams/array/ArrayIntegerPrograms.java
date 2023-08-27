package com.sreenu.javastreams.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayIntegerPrograms {

	public static void main(String[] args) {

		
		int[] numbers = { 5, 9, 11, 2, 8, 21, 1 };
		List<Integer> number = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
		System.out.println(number);
		System.out.println("===================================");


		/** reverse the order given Array **/
		List<Integer> numberRevesre = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(numberRevesre);
		System.out.println("===================================");

		/** reverse the order given Array skip the first element**/
		List<Integer> integerRevesreSkip1 = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1)
				.collect(Collectors.toList());
		System.out.println(integerRevesreSkip1);
		System.out.println("===================================");

		/**Find the Second Highest Number in the Array**/
		Integer secondHighestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println(secondHighestNumber);
		System.out.println("===================================");
		
		/**Find the Second Lowest Number in the Array**/
		Integer secondLowestNumber = Arrays.stream(numbers).boxed().sorted().skip(1)
				.findFirst().get();
		System.out.println(secondLowestNumber);
		System.out.println("===================================");
		
	List<String>	string1withlist = Arrays.stream(numbers).boxed().map(s ->s+"").filter(s ->s.startsWith("1")).collect(Collectors.toList());
		System.out.println(string1withlist);

	}

}
