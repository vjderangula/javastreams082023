package com.sreenu.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<EmployeeStreams> employeeStreamsList = new ArrayList<>();
        
		employeeStreamsList.add(new EmployeeStreams(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeStreamsList.add(new EmployeeStreams(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeStreamsList.add(new EmployeeStreams(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeStreamsList.add(new EmployeeStreams(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeStreamsList.add(new EmployeeStreams(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeStreamsList.add(new EmployeeStreams(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeStreamsList.add(new EmployeeStreams(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeStreamsList.add(new EmployeeStreams(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeStreamsList.add(new EmployeeStreams(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeStreamsList.add(new EmployeeStreams(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeStreamsList.add(new EmployeeStreams(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeStreamsList.add(new EmployeeStreams(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeStreamsList.add(new EmployeeStreams(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeStreamsList.add(new EmployeeStreams(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeStreamsList.add(new EmployeeStreams(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeStreamsList.add(new EmployeeStreams(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeStreamsList.add(new EmployeeStreams(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		employeeStreamsList.add(new EmployeeStreams(266, "Sri Pandey", 6, "infant", "infant Development", 2015, 28900.0));
		employeeStreamsList.add(new EmployeeStreams(277, "Mangal Chettiar", 3, "infant", "infant Development", 2012, 35700.0));
	
		
		Map<String, Long> noOfEmployeesBasedOnGender = employeeStreamsList.stream().collect(Collectors.groupingBy(EmployeeStreams::getGender, Collectors.counting()));
		System.out.println(noOfEmployeesBasedOnGender);
		System.out.println("===============DEPT=================");
		employeeStreamsList.stream().map(EmployeeStreams::getDepartment).distinct().forEach(System.out::println);
		System.out.println("============AGE AVG====================");
		Map<String, Double> avgAgeOfEmp = employeeStreamsList.stream().collect(Collectors.groupingBy(EmployeeStreams::getGender, Collectors.averagingInt(EmployeeStreams::getAge)));
	System.out.println(avgAgeOfEmp);
	
	}

}
