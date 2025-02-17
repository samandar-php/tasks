package Case;

import java.util.Scanner;

public class Case_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a = scanner.nextDouble();
        switch (n) {
            case 1 ->
                    System.out.println(a);
            case 2 ->
                    System.out.println(a * Math.sqrt(3) / 6);
            case 3 ->
                    System.out.println(2 * a * Math.sqrt(3) / 6);
            case 4 ->
                    System.out.println(a * a * Math.sqrt(3) / 4);
            default ->
                    System.out.println("Error");
        }
    }
}
