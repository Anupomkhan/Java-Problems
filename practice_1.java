import java.util.Scanner;

public class practice_1 {
    public static void main(String[] args) {
        // area of a triangle:

        Scanner sc = new Scanner(System.in);
        System.out.print("base=");
        double base = sc.nextDouble();

        System.out.print("hight=");
        double hight = sc.nextDouble();

        double area = 0.5 * base * hight;
        System.out.print("area=" + area);
    }
}