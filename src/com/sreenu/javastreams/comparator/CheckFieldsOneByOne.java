package com.sreenu.javastreams.comparator;

import java.util.Comparator;

public class CheckFieldsOneByOne implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        if(nameCompare != 0) {
            return nameCompare;
        }
        return 0;
    }
    
	/*
	 * @Override public int compare(Person o1, Person o2) { int nameCompare =
	 * o1.getName().compareTo(o2.getName()); if(nameCompare != 0) { return
	 * nameCompare; } return Integer.compare(o1.getAge(), o2.getAge()); }
	 */
    
    public static void main(String[] args) {
		
    	Person person1 = new Person("John", 21);
        Person person2 = new Person("Tom", 20);
        // Another person named John
        Person person3 = new Person("John", 22);
        
        CheckFieldsOneByOne checkFieldsOneByOne = new CheckFieldsOneByOne();
        int result = checkFieldsOneByOne.compare(person1, person2);
        
        int result1 = checkFieldsOneByOne.compare(person1, person3);
        
        
     System.out.println(result); 
     System.out.println(result1); 
	}
}
