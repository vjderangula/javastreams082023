package com.sreenu.javastreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllMatchExample {

	public static void main(String[] args) {

		
		List<String> listofStrings1 = Arrays.asList("Java Guides", "Python Guides","C Guides"); 
		 Stream<String> stream1 = listofStrings1.stream();
		 boolean anyMatch1 = stream1.allMatch((value) -> { return value.contains("Guides");});
		System.out.println(anyMatch1);

	}

}
