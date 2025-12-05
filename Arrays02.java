package janhavi;
import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 2, 3, 3, 3, 4};

	        int count = 0;

	        // Loop through the array and compare adjacent elements
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] == arr[i + 1]) {
	                count++;
	            }
	        }

	        System.out.println("Count of adjacent equal elements: " + count);
	    }
	}
	
	