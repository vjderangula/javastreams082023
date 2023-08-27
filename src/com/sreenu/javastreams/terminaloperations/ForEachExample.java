package com.sreenu.javastreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachExample {

	public static void main(String[] args) {


List<String> listString = Arrays.asList("Java","Controller","Spring","Microservices");
		
		Stream<String> streams = listString.stream();
	streams.forEach(element -> { System.out.println(element);});
	
	}

}
