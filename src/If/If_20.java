package If;

import java.util.Scanner;

public class If_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (Math.abs(a - b) < Math.abs(a - c)) {
            System.out.println("B");
            System.out.println(Math.abs(a - b));
        } else {
            System.out.println("C");
            System.out.println(Math.abs(a - c));
        }
    }
}
