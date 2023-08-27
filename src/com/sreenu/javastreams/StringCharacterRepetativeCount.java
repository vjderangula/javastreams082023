package com.sreenu.javastreams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCharacterRepetativeCount {

	public static void main(String[] args) {
		String input = "iloveindiancountry";
		
		
		/**Find the characters occurrences with character**/
		Map<String, List<String>> resultWithCharacter = Arrays.stream(input.split("")).collect(Collectors.groupingBy(s -> s));
		
		/**Find the characters occurrences with number of times **/
		Map<String, Long> countingNumberOfTimes = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));	
		
		/**Find the 1st non repeate occurrence character in the String**/
		String firstNonRepetativeElement = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();		
		
		/**Find the 1st repeate occurrence character in the String**/
		String firstRepetativeElement = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(x -> x.getValue() > 1).findFirst().get().getKey();	
		/**Find the duplicate characters**/
		List<String> dupplicateChracters = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(x -> x.getValue() >1).map(Map.Entry::getKey).collect(Collectors.toList());	
		
		/**Find the Unique characters**/
		List<String> uniqueCharacters =   Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(resultWithCharacter);
		System.out.println("===================");
		System.out.println(countingNumberOfTimes);
		System.out.println("===================");
		System.out.println(firstNonRepetativeElement);
		System.out.println("===================");
		System.out.println(firstRepetativeElement);
		System.out.println("===================");
		System.out.println(dupplicateChracters);
		System.out.println("===================");
		System.out.println(uniqueCharacters);
		System.out.println("===================");
		
		Arrays.stream(input.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
				.forEach((k, v) -> System.out.print(k + " = " + v + " :: "));
	}
}
