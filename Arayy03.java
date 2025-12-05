package janhavi;

public class Arayy03 {

	 
		// TODO Auto-generated method stub
		 

		    // Method to perform Bubble Sort and print the sorted array
		    public static void bubbleSort(int arr[])
		    {
		        int n = arr.length;
		        int temp;

		        // Bubble Sort logic
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                if (arr[j] > arr[j + 1]) {
		                    // Swap arr[j] and arr[j+1]
		                    temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }

		        // Printing sorted array
		        System.out.println("Sorted Array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }

		    public static void main(String[] args) {
		        int[] array = { 5, 3, 8, 4, 2 };
		        
		        System.out.println("Original Array:");
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		        System.out.println();

		        // Call bubbleSort method
		        bubbleSort(array);
		    }
		


	}


