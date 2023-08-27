package com.sreenu.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfValues {

	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList(10000, 20000, 25000, 5000);

        List<Integer> filteredAndIncrementedValue = list.stream()
                .filter(value -> value >= 20000)
                .map(value -> (int) (value * 1.10)) 
                .collect(Collectors.toList());

        System.out.println(filteredAndIncrementedValue); 
    }
}
	


