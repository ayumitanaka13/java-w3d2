import java.util.Scanner;

public class Driver {
	
	public static int[] sort(int[] numArray) {
		// create the for loop and iterate through the for loop
		for (int i=1; i < numArray.length; i++) {
			for (int j=i; j>0; j--) {
				if(numArray[j] < numArray[j-1]) {
					int d = numArray[j-1];
					numArray[j-1] = numArray[j];
					numArray[j] = d;
				}
			}
		}
		return numArray;
	}
	
	public static boolean search(int[] numArray, int num) {
		// Iterate through numArray		
		// Inside the for loop check if each element equals to num --> return true		
		//After for loop return false
		boolean isFound = false;
		for (int i=0; i < numArray.length; i++) {
			if(numArray[i]==num) {
				isFound = true;
			}
		}
		return isFound;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ask User How many numbers wants to add ?
		System.out.println("How many numbers wants to add? :");
		// Declare array with that number	
		int[] numberArray = new int[input.nextInt()];
		// Iterate through for loop and add the numbers to Array
		System.out.println("Enter the numbers :");		
		for (int i=0; i < numberArray.length; i++) {
			numberArray[i] = input.nextInt();
		}
		
		// Ask the number from user
		System.out.println("Enter the numbers for searching in the array :");
		int searchNum = input.nextInt();
		// Call search method here and print the result
		boolean found = search(numberArray, searchNum);
		
		if (found == true) {
			System.out.println(searchNum + " is in the list");
		} else {
			System.out.println(searchNum + " is not in the list");			
		}
		System.out.println("-------------------------------------");
		System.out.println("Sorted Array");
		int[] sortedArray = new int[numberArray.length];
		sortedArray = sort(numberArray);
		for (int i=0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");	
		}
	}
}
