package com.sreenu.questions;

import java.util.Arrays;

public class ArrayReverse {

	    public static void reverseArray(int[] arr) {
		        int start = 0;
		        int end = arr.length - 1;
		        
		        while (start < end) {
		            // Swap the elements at start and end indices
		            int temp = arr[start];
		            arr[start] = arr[end];
		            arr[end] = temp;
		            
		            // Move the pointers towards each other
		            start++;
		            end--;
		        }
		    }

		    public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 4, 5};
		        
		        System.out.println("Original Array: " + Arrays.toString(arr));
		        
		        reverseArray(arr);
		        
		        System.out.println("Reversed Array: " + Arrays.toString(arr));
		    }
		}
