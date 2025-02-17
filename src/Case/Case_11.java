package Case;

import java.util.Scanner;

public class Case_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double r = scanner.nextDouble();
        switch (n) {
            case 1 ->
                    System.out.println(r);
            case 2 ->
                    System.out.println(2 * r);
            case 3 ->
                    System.out.println(2 * 3.14 * r);
            case 4 ->
                    System.out.println(3.14 * r * r);
            default ->
                    System.out.println("Error");
        }
    }
}
