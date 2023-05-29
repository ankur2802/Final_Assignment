/*
6. Write a Java program that uses stream api to perform operations on a large data set
such as sorting or filtering the data.
*/

import java.util.*;

import java.util.stream.Collectors;

public class Question_6 {
    public static void main(String[] args) {
        // Create a large data set
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            num.add(i);
        }

        // Sorting the data set
        List<Integer> sortedNum = num.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted numbers: ");
        for (int number : sortedNum) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Filtering the data set
        List<Integer> evenNum = num.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: ");
        for (int number : evenNum) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}