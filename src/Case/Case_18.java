package Case;

import java.util.Scanner;

public class Case_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 100;
        int c = a % 100 / 10;
        int d = a % 10;
        switch (b) {
            case 1 ->
                    System.out.print("yuz ");
            case 2 ->
                    System.out.print("ikki yuz ");
            case 3 ->
                    System.out.print("uch yuz ");
            case 4 ->
                    System.out.print("to'rt yuz ");
            case 5 ->
                    System.out.print("besh yuz ");
            case 6 ->
                    System.out.print("olti yuz ");
            case 7 ->
                    System.out.print("yetti yuz ");
            case 8 ->
                    System.out.print("sakkiz yuz ");
            case 9 ->
                    System.out.print("to'qqiz yuz ");
        }
        switch (c) {
            case 1 ->
                    System.out.print("o'n ");
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
            case 7 ->
                    System.out.print("yetmish ");
            case 8 ->
                    System.out.print("sakson ");
            case 9 ->
                    System.out.print("to'qson ");
        }
        switch (d) {
            case 1 ->
                    System.out.println("bir");
            case 2 ->
                    System.out.println("ikki");
            case 3 ->
                    System.out.println("uch");
            case 4 ->
                    System.out.println("to'rt");
            case 5 ->
                    System.out.println("besh");
            case 6 ->
                    System.out.println("olti");
            case 7 ->
                    System.out.println("yetti");
            case 8 ->
                    System.out.println("sakkiz");
            case 9 ->
                    System.out.println("to'qqiz");
        }
    }
}
