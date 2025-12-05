package janhavi;
import java.util.Scanner;
public class Array22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Taking array input
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter the element to search: ");
	        int key = sc.nextInt();

	        // Searching the element
	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == key) {
	                found = true;
	                break;
	            
	            }
	        }
	}
}



	


