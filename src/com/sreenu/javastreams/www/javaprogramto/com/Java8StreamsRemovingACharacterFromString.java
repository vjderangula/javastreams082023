package com.sreenu.javastreams.www.javaprogramto.com;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Java8StreamsRemovingACharacterFromString {

	public static void main(String[] args) {

		String input = "Hello 00 World0";
		String result = input.replaceAll("0", "");
		
		System.out.println("input with 00 :: " +input);
		System.out.println("Output without 00 :: "+result);
		
		System.out.println("=================Pattern========================");
		//The above code does not work for the special characters. 
		//If input string contains any one of these characters(<, (, [, {, \, ^, -, =, $, !, |, ], }, ), ?, *, +, ., >) 
		//then it will throw PatternSyntaxException.
		
		String scInput = "Hello +World++";
		String scResult = scInput.replaceAll(Pattern.quote("+"), "");
		
		System.out.println("scInput with ++ :: "+scInput);
		System.out.println("scInput without ++ ::"+ scResult);
		
		System.out.println("==================StringBuilder=======================");
		
		String inputstring = "hello @world @@";
		char removalCh = '@';

		char[] chars = inputstring.toCharArray();
		
		StringBuilder builder = new StringBuilder();

		for (char ch: chars) {
			if(ch !=removalCh) {
				builder.append(ch);
			}
			
		}
		System.out.println(inputstring);
		System.out.println(builder.toString());		
		
		System.out.println("=================Java 8========================");
		
		String inputv = "hello +world ++";
		char removalChara = '+';

		//String output = inputv.chars().filter(ch -> ch != removalChara ).mapToObj(ch ->String.valueOf(ch)).collect(Collectors.joining());
		
		
		 String output =  inputv.chars().filter(ch -> ch != removalChara).mapToObj(ch -> String.valueOf(ch)).collect(Collectors.joining());
		System.out.println("Original input string :: "+inputv);
		System.out.println("Output after removing '+' :: "+output);
		
	}

}
