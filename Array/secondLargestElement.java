package Array;

import java.util.Scanner;

public class secondLargestElement {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
  
        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
  
        // Create an array to store user-input elements
        int array[] = new int[n];
  
        // Prompt the user to enter array elements
        System.out.println("Enter array elements:");
  
        // Loop to get array input elements
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(secondLargest);
        }
    }
}

