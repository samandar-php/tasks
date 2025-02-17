package cases;

import java.util.Scanner;

public class Case_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        switch (n) {
            case 1 ->
                    System.out.println(m);
            case 2 ->
                    System.out.println(m / 1000000);
            case 3 ->
                    System.out.println(m / 1000);
            case 4 ->
                    System.out.println(m * 1000);
            case 5 ->
                    System.out.println(m * 100);
            default ->
                    System.out.println("Error");
        }
    }
}
