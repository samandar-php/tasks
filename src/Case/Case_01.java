package Case;

import java.util.Scanner;

public class Case_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1 ->
                    System.out.println("Dushanba");
            case 2 ->
                    System.out.println("Seshanba");
            case 3 ->
                    System.out.println("Chorshanba");
            case 4 ->
                    System.out.println("Payshanba");
            case 5 ->
                    System.out.println("Juma");
            case 6 ->
                    System.out.println("Shanba");
            case 7 ->
                    System.out.println("Yakshanba");
            default ->
                    System.out.println("Error");
        }
    }
}
