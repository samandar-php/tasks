package cases;

import java.util.Scanner;

public class Case_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oy = scanner.nextInt();
        switch (oy) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                    System.out.println("31");
            case 4, 6, 9, 11 ->
                    System.out.println("30");
            case 2 ->
                    System.out.println("28");
            default ->
                    System.out.println("Error");
        }
    }
}
