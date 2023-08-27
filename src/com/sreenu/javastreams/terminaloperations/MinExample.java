package com.sreenu.javastreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinExample {

	public static void main(String[] args) {

		

List<String> listString = Arrays.asList("Java","Controller","Spring","Microservices");
		
		Stream<String> streams = listString.stream();
	Optional<String>	min = streams.min((val1, val2) -> { return val1.compareTo(val2);});
	System.out.println(min.get());
	
	}

}
