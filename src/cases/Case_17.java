package cases;

import java.util.Scanner;

public class Case_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 10;
        int c = a % 10;
        switch (b) {
            case 1 ->
                    System.out.print("o'n ");
            case 2 ->
                    System.out.print("yigirma ");
            case 3 ->
                    System.out.print("o'ttiz ");
            case 4 ->
                    System.out.print("qirq ");
        }
        switch (c) {
            case 1 ->
                    System.out.println("birinchi vazifa");
            case 2 ->
                    System.out.println("ikkinchi vazifa");
            case 3 ->
                    System.out.println("uchinchi vazifa");
            case 4 ->
                    System.out.println("to'rtinchi vazifa");
            case 5 ->
                    System.out.println("beshinchi vazifa");
            case 6 ->
                    System.out.println("oltinchi vazifa");
            case 7 ->
                    System.out.println("yettinchi vazifa");
            case 8 ->
                    System.out.println("sakkizinchi vazifa");
            case 9 ->
                    System.out.println("to'qqizinchi vazifa");
        }
    }
}
