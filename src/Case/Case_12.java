package Case;

import java.util.Scanner;

public class Case_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a = scanner.nextDouble();
        switch (n) {
            case 1, 3 ->
                    System.out.println(a);
            case 2 ->
                    System.out.println(a * Math.sqrt(2));
            case 4 ->
                    System.out.println(a * a / 2);
            default ->
                    System.out.println("Error");
        }
    }
}
