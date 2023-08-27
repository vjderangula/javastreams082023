package com.sreenu.javastreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatchExample {

	public static void main(String[] args) {

		List<String> listofStrings = Arrays.asList("Java Guides", "Python Guides", "C Guides");
		Stream<String> stream = listofStrings.stream();

		boolean anyMatch = stream.anyMatch((value) -> {
			return value.startsWith("Java");
		});

		System.out.println(anyMatch);


 
		/*
		 * boolean anyMatch1 = stream.anyMatch((value) -> { return
		 * value.startsWith("DevOps");}); 
		 * 
		 * Exception in thread "main"
		 * java.lang.IllegalStateException: stream has already been operated upon or
		 * closed at
		 * java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:
		 * 229) at
		 * java.base/java.util.stream.ReferencePipeline.anyMatch(ReferencePipeline.java:
		 * 632) at
		 * javastreams/com.sreenu.javastreams.terminaloperations.AnyMatchExample.main(
		 * AnyMatchExample.java:24)
		 * 
		 */

		List<String> listofStrings1 = Arrays.asList("Java Guides", "Python Guides","C Guides"); 
		 Stream<String> stream1 = listofStrings1.stream();
		 boolean anyMatch1 = stream1.anyMatch((value) -> { return value.startsWith("DevOps");});
		System.out.println(anyMatch1);

	}

}
