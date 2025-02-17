package Case;

import java.util.Scanner;

public class Case_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        switch (n) {
            case 1 ->
                    System.out.println(a + b);
            case 2 ->
                    System.out.println(a - b);
            case 3 ->
                    System.out.println(a * b);
            case 4 ->
                    System.out.println(a / b);
            default ->
                    System.out.println("Error");
        }
    }
}
