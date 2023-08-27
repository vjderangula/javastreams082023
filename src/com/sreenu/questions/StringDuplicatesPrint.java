package com.sreenu.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringDuplicatesPrint {

	public static void main(String[] args) {		
		prinDduplicateCharactes("a");
		prinDduplicateCharactes("");
		prinDduplicateCharactes(null);
		prinDduplicateCharactes("java");
		prinDduplicateCharactes("1000");		
		prinDduplicateCharactes("tesla");
		prinDduplicateCharactes("String Characters S");
		
	}
	
	public static void prinDduplicateCharactes(String str) {
		if(str == null) {
			System.out.println("NULL string");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("Empty string");
			return;		
		}
		if(str.isBlank()) {
			System.out.println("Blank string");
			return;		
		}
		if(str.length() == 1) {
			System.out.println("Single Char String :: "+str);
			return ;
		}
		
	char[] words =	str.toLowerCase().toCharArray();
	Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	
	for (Character ch : words) {
		if(charMap.containsKey(ch)) {
			charMap.put(ch, charMap.get(ch)+1);
		}else {
			charMap.put(ch, 1);
		}
		
	}
	Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
	
	for (Map.Entry<Character, Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
		
	}

}
