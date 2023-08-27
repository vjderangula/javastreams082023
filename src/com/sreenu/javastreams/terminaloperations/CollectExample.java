package com.sreenu.javastreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {

	public static void main(String[] args) {

		
		List<String> listString = Arrays.asList("Java","Controller","Spring","Microservices");
		
		Stream<String> streams = listString.stream();
		
		List<String> toUppercase = streams.map(value -> value.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(toUppercase);
	}

}
