package cases;

import java.util.Scanner;

public class Case_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 10;
        int c = a % 10;
        switch (b) {
            case 2 ->
                    System.out.print("yigirma ");
            case 3 ->
                    System.out.print("o'ttiz ");
            case 4 ->
                    System.out.print("qirq ");
            case 5 ->
                    System.out.print("ellik ");
            case 6 ->
                    System.out.print("oltmish ");
        }
        switch (c) {
            case 1 ->
                    System.out.println("bir yil");
            case 2 ->
                    System.out.println("ikki yil");
            case 3 ->
                    System.out.println("uch yil");
            case 4 ->
                    System.out.println("to'rt yil");
            case 5 ->
                    System.out.println("besh yil");
            case 6 ->
                    System.out.println("olti yil");
            case 7 ->
                    System.out.println("yetti yil");
            case 8 ->
                    System.out.println("sakkiz yil");
            case 9 ->
                    System.out.println("to'qqiz yil");

        }
    }
}
