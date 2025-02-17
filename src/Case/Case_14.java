package Case;

import java.util.Scanner;

public class Case_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        switch (n) {
            case 1 ->
                    System.out.println(a);
            case 2 ->
                    System.out.println(b);
            case 3 ->
                    System.out.println(c);
            case 4 ->
                    System.out.println(a * b / 2);
            case 5 ->
                    System.out.println(a + b + c);
            default ->
                    System.out.println("Error");
        }
    }
}
