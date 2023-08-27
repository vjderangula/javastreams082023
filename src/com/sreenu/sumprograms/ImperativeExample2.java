package com.sreenu.sumprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ImperativeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> listInteger = Arrays.asList(1,2,3,3,4,5,5,6,7,8,9,9,10);
		
		/* Imperative*/
		List<Integer> uniquelistint = new ArrayList<Integer>();
		
for (Integer integer : listInteger) {
	if(!uniquelistint.contains(integer)) {
		uniquelistint.add(integer);
	}
	
}
System.out.println("Imperative Unique List Integer :: "+uniquelistint);
System.out.println("**********************");

/* Declarative*/

List<Integer> uniquelistint1 = listInteger.stream()
										  .distinct()
                                          .collect(Collectors.toList());

System.out.println("Declarative Unique List Integer :: " +uniquelistint1 );

	}

}
