package com.sreenu.javastreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstExample {

	public static void main(String[] args) {

List<String> listString = Arrays.asList("Java","Controller","Spring","Microservices");
		
		Stream<String> streams = listString.stream();
	Optional<String>	findFirst = streams.findFirst();
	
	System.out.println(findFirst.get());
	}

}
