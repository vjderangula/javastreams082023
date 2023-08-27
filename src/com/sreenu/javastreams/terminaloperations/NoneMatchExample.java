package com.sreenu.javastreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NoneMatchExample {

	public static void main(String[] args) {

		
		List<String> listNames = Arrays.asList("sreenu", "sravani","kumar","narayan" );
		Stream<String> stream = listNames.stream();
		
		Boolean nonMatch = stream.noneMatch((element) -> { return "derangula".equals(element);});
		System.out.println(nonMatch);		
		
		
	}

}
