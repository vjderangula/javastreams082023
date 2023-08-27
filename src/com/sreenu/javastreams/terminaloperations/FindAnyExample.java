package com.sreenu.javastreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyExample {

	public static void main(String[] args) {

		
	List<String> listString = Arrays.asList("Java","Controller","Spring","Microservices");
		
		Stream<String> streams = listString.stream();
	Optional<String>	findAny = streams.findAny();
	
	System.out.println(findAny.get());
	}

}
