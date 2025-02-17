package cases;

import java.util.Scanner;

public class Case_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        switch (n) {
            case 6 ->
                    System.out.print("six ");
            case 7 ->
                    System.out.print("seven ");
            case 8 ->
                    System.out.print("eight ");
            case 9 ->
                    System.out.print("nine ");
            case 10 ->
                    System.out.print("ten ");
            case 11 ->
                    System.out.print("Jek ");
            case 12 ->
                    System.out.print("Queen ");
            case 13 ->
                    System.out.print("King ");
            case 14 ->
                    System.out.print("Ace ");
            default ->
                    System.out.println("Error");
        }
        switch (m) {
            case 1 ->
                    System.out.println("belkurak");
            case 2 ->
                    System.out.println("klub");
            case 3 ->
                    System.out.println("olmos");
            case 4 ->
                    System.out.println("yurak");
            default ->
                    System.out.println("Error");
        }
    }
}
