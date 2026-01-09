import java.util.Scanner;

public class Practice_Problem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            /*
             * Write a program to check whether a given
             * input is a positive integer or not:
             */
            // System.out.print("input your num:");
            // int num = sc.nextInt();
            // if (num < 0) {
            // System.out.println("negetive number");
            // } else {
            // System.out.println("positive number");
            // }
            // System.out.println(" done!");
            /*
             * Write a program to check whether a given input is an odd or even number
             */
            // System.out.print("input your num:");
            // int num2 = sc.nextInt();
            // if (num2 % 2 == 0) {
            // System.out.println("even number");
            // } else {
            // System.out.println("odd number");
            // }
            // System.out.println(" done!");

            /*
             * Write a program to calculate grade of the following scenario:
             * 0 - 39 : F
             * 40 - 59 : C+
             * 60 - 69 : B
             * 70 - 79 : A-
             * 80 - 89 : A
             * 90+ : A+
             */

            // System.out.print("input your mark:");
            // int mark = sc.nextInt();
            // if (mark >= 90) {
            // System.out.println("A+");
            // }
            // if (mark >= 80 && mark <= 89) {
            // System.out.println("A");
            // }
            // if (mark >= 70 && mark <= 79) {
            // System.out.println("A-");
            // }
            // if (mark >= 60 && mark <= 69) {
            // System.out.println("B");
            // }
            // if (mark >= 40 && mark <= 59) {
            // System.out.println("C+");
            // }
            // if (mark >= 0 && mark <= 39) {
            // System.out.println("F");
            // }

            // Build a simple calculator:
            System.out.print("Input1 (integer a): ");
            int a = sc.nextInt();

            System.out.print("Input2 (integer b): ");
            int b = sc.nextInt();

            System.out.print("Input3 (operator +, -, *, /): ");
            char op = sc.next().charAt(0);

            int result;
            switch (op) {
                case '+':
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (b == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        double divResult = (double) a / b;
                        System.out.println("Result: " + divResult);
                    }
                    break;

                default:
                    System.out.println("Invalid operator");
            }
        }
    }
}