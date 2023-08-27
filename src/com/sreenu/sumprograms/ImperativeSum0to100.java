package com.sreenu.sumprograms;

import java.util.stream.IntStream;

public class ImperativeSum0to100 {

	public static void main(String[] args) {
		// imperative style of program
int sum =0;
for (int i=0; i<=100; i++) {
	sum+=i;
}
System.out.println("##################Imperative Approach#################");
System.out.println("Sum using imperative appoach value of 0 to 100 : "+sum);


System.out.println("********************Declarative Approach**************");
//declarative approach style of program


int sum1 = IntStream.rangeClosed(0, 100)
                     .parallel()
                    .sum();


System.out.println("Sum using declarative appoach value of 0 to 100 : "+sum1);
	}

	
	
	
	
}
