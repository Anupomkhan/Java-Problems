import java.util.Scanner;

public class Practice_Problem {
    public static void main(String[] args) {
        // area of a triangle:
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("base=");
            double base = sc.nextDouble();

            System.out.print("hight=");
            double hight = sc.nextDouble();

            double area = 0.5 * base * hight;
            System.out.print("area=" + area);

            System.out.println(" done!");

            // volume of a ball:
            double pi = 3.1416;
            System.out.print("radius=");
            double r = sc.nextDouble();
            double cons = 4 / 3;
            double vol = cons * pi * r * r;
            System.out.print("volume=" + vol);

            System.out.println("done!");

            // area of a circle:
            System.out.print("radius=");
            double r2 = sc.nextDouble();
            System.out.print("area=" + pi * r2 * r2);

            System.out.println("done!");

            // celsius to fahrenheit:

            System.out.print("celsius:");
            double C = sc.nextDouble();
            System.out.print("fahrenheit:" + ((C * 9) / 5) + 32);

            System.out.println("done!");

            // area of a equilateral triangle:
            System.out.print("arm:");
            double a = sc.nextDouble();
            System.out.print("area:" + ((Math.sqrt(3) / 4) * a * a));

            System.out.println("done!");

            // Find the area of a triangle (2):
            System.out.print("a:");
            double a2 = sc.nextDouble();
            System.out.print("b:");
            double b = sc.nextDouble();
            System.out.print("c:");
            double c = sc.nextDouble();
            double s = (a2 + b + c) / 2;
            double ar = Math.sqrt(s * (s - a2) * (s - b) * (s - c));
            System.out.print("ar:" + ar);

        }

    }
}