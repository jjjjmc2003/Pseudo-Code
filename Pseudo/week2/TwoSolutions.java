package week2;

import java.util.*;

public class TwoSolutions {
    public static void main(String[] args) {
        // Step 1: Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        // Step 2: Create an array called fib containing 0 and 1
        int[] fib = new int[Math.max(N, 2)];
        fib[0] = 0;
        fib[1] = 1;

        // Step 3: Add parameters ie make this user proof
        if (N < 0) {
            System.out.println("Positive numbers only bro...");
            return;
        }

        // Step 4: Add for loop and calculate fib series
        for (int i = 2; i < N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(Arrays.toString(Arrays.copyOf(fib, N)));

        // Now that we calculated the fib sequence, let's check if there are any duplicates
        if (hasDuplicate(fib, N)) {
            System.out.println("The Fibonacci sequence has duplicates in it, try inputting 0 or 1 if you don't want any duplicates");
        } else {
            System.out.println("No duplicates found in the Fibonacci sequence, let me guess input was either 0 or 1... I'm a genius ");
        }
    }

    // When I wrote this function, I didn't realize that after 0 and 1 1 is repeated
    // meaning that if you input 2 or more you will get duplicates so it's a pretty
    // useless checker, but the code works so I think that's cool

    public static boolean hasDuplicate(int[] arr, int length) {
        HashSet<Integer> seen = new HashSet<>();
        // Found this set thing called Hash, pretty useful for duplicates
        for (int i = 0; i < length; i++) {
            if (seen.contains(arr[i])) {
                return true;
            }
            seen.add(arr[i]);
        }
        return false;
    }
}