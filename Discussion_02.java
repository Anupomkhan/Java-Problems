import java.util.Scanner;

public class Discussion_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Calculate if a given year is a leap year or not:
            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }

            /*
             * Print the following series (using for-loop, while loop & do-while loop as
             * well):
             * 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
             * 1, 3, 5, 7, 9, 11, 13, 15, 17, 19
             */
            int sum_even = 0;
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    sum_even += i;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            int sum_odd = 0;
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 1) {
                    sum_odd += i;
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            // Calculate the sum of the series above (using the loops)
            System.out.println("sum even:" + sum_even);
            System.out.println("sum even:" + sum_odd);
        }
    }
}