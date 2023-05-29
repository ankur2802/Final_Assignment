/*
7. Create a Java program that implements a binary search algorithm. The program
should accept user input for the target value and search for it in a sorted array. The
program should return the index of the target value if found or a message if not
found.*/

import java.util.Scanner;

public class Question_7 {
    public static int binarySearch(int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1; // Target value not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 4, 8, 12, 15, 18, 20, 24, 27, 30, 35, 40, 45, 50};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();
        
        int index = binarySearch(sortedArray, target);
        
        if (index != -1) {
            System.out.println("Target value found at index " + index);
        } else {
            System.out.println("Target value not found in the array.");
        }
        
       
    }
}