package com.sreenu.javastreams;

import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

		
		        String str = "Hello";
		        String result = removeDuplicates(str);
		        System.out.println(result);
		    }

		    public static String removeDuplicates(String str) {
		        return str.chars()
		                .distinct()
		                .mapToObj(c -> String.valueOf((char) c))
		                .collect(Collectors.joining());
		    }
		}
