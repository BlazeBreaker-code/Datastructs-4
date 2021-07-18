//Suraj Mohan N01234931
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter random number of integers. \nEnter 0 when complete.");

        HashMap<Integer, Integer> instances = new HashMap<>();

        int input;
        //Keeps scanning next integer as long as it isn't 0
        while ((input = scan.nextInt()) != 0) {
            if (!instances.containsKey(input)) {
                instances.put(input, 1);
            } else {
                instances.put(input, instances.get(input) + 1);
            }
        }

        int max = Collections.max(instances.values());

        HashMap<Integer, Integer> highest = new HashMap<>();

        instances.forEach((key, value) -> { if (value >= max) highest.put(key, value); });

        System.out.println("Integers with most frequent occurrences: ");
        highest.forEach((key, value) -> System.out.println(key + " occurred " + value + " times."));
    }
}