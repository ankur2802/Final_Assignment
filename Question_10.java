/*
10. Write a Java program that reads a set of integers from the user and stores them in a
List. The program should then find the second largest and second smallest elements
in the List.
*/
import java.util.*;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> num = new ArrayList<>();

        // Read integers from the user and store them in the list
        System.out.print("Enter the number of integers: ");
        int count = sc.nextInt();

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            int num1 = sc.nextInt();
            num.add(num1);
        }

        // Find the second largest and second smallest elements
        int secondLargest = findSecondLargest(num);
        int secondSmallest = findSecondSmallest(num);

        // Print the results
        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
    }

    private static int findSecondLargest(List<Integer> numbers) 
    {
        Collections.sort(numbers);
        int size = numbers.size();
        return numbers.get(size - 2);
    }

    private static int findSecondSmallest(List<Integer> numbers) 
    {
        Collections.sort(numbers);
        return numbers.get(1);
    }
}