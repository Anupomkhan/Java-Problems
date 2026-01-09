import java.util.ArrayList;
import java.util.Scanner;

public class Discussion_03 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // Store some values (integer or floating point) and print the average of them
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(sc.nextInt());
            }
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += list.get(i);
            }

            double average = (double) sum / 10;
            System.out.println("Average = " + average);

            /*
             * Write a program to give medel if a student has a letter
             * grade and completed the semester. Use nested If statement.
             */
            double grade = sc.nextDouble();
            boolean semesterCompleted = sc.nextBoolean();
            if (semesterCompleted) {
                if (grade >= 3.5) {
                    System.out.println("Medal Awarded");
                } else {
                    System.out.println("No Medal (Grade too low)");
                }
            } else {
                System.out.println("No Medal (Semester not completed)");
            }

            // Consider the following scenario for giving bonus:
            int salesPercent = sc.nextInt();
            int attendancePercent = sc.nextInt();
            int bonus;

            if (salesPercent >= 95) {
                if (attendancePercent == 100) {
                    bonus = 60;
                } else if (attendancePercent >= 90) {
                    bonus = 40;
                } else {
                    bonus = 5;
                }
            } else if (salesPercent >= 80) {
                if (attendancePercent == 100) {
                    bonus = 40;
                } else if (attendancePercent >= 90) {
                    bonus = 20;
                } else {
                    bonus = 5;
                }
            } else {
                bonus = 5;
            }
            System.out.println("Bonus = " + bonus + "%");

            // Find the greatest number of a given series. Use Array and loops:
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Greatest number: " + max);

            // Write a program to see if a given number is a prime number or not:
            int n1 = sc.nextInt();
            boolean isPrime = true;

            if (n1 <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= n1 / 2; i++) {
                    if (n1 % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }

            // Reverse a given series. Use Arrays and loops:
            int n2 = sc.nextInt();
            int[] arr2 = new int[n2];

            for (int i = 0; i < n2; i++) {
                arr2[i] = sc.nextInt();
            }

            for (int i = n2 - 1; i >= 0; i--) {
                System.out.print(arr2[i] + " ");
            }

            // Store some values and print how many odd and even number are in there:
            int n3 = sc.nextInt(); // number of elements
            int[] arr3 = new int[n3];

            for (int i = 0; i < n3; i++) {
                arr3[i] = sc.nextInt();
            }

            int even = 0, odd = 0;

            for (int i = 0; i < n3; i++) {
                if (arr3[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);

            // Print the following Fibonacci series:
            // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

            int n4 = 12; // total numbers to print
            int[] fib = new int[n4];

            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i < n4; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

            for (int i = 0; i < n4; i++) {
                System.out.print(fib[i] + " ");
            }
        }
    }
}
