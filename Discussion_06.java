import java.util.Scanner;
public class Discussion_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Practice Problem 04-String
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.println("Reverse: " + reverseString(text));

        if (isPalindrome(text)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        System.out.print("Enter a character to count: ");
        char target = input.next().charAt(0);
        System.out.println("Occurrence of '" + target + "': " + countCharacter(text, target));

        input.close();
    }

    public static String reverseString(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    public static boolean isPalindrome(String text) {
        String reversed = reverseString(text);
        return text.equals(reversed);
    }

    public static int countCharacter(String text, char target) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
}
