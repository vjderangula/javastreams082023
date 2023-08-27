package com.sreenu.javastreams;

import java.util.Arrays;

public class ArrayLongestString {

	public static void main(String[] args) {
		
		
		String[] strings = {"java", "hibernate", "springboot","microservices", "springwithangular"};
		
		String longestString = Arrays.stream(strings).reduce((word1, word2)->word1.length() > word2.length() ? word1 : word2).get();
		System.out.println(longestString);
	}

}
