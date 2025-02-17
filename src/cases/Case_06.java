package cases;

import java.util.Scanner;

public class Case_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a = scanner.nextDouble();
        switch (n) {
            case 1 ->
                    System.out.println(a / 10);
            case 2 ->
                    System.out.println(a * 1000);
            case 3 ->
                    System.out.println(a);
            case 4 ->
                    System.out.println(a / 1000);
            case 5 ->
                    System.out.println(a / 100);
            default ->
                    System.out.println("Error");
        }
    }
}
