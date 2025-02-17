package cases;

import java.util.Scanner;

public class Case_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a % 60;
        int c = b % 12;
        switch (b / 12) {
            case 0 ->
                    System.out.print("yashil ");
            case 1 ->
                    System.out.print("qizil ");
            case 2 ->
                    System.out.print("sariq ");
            case 3 ->
                    System.out.print("oq ");
            case 4 ->
                    System.out.print("qora ");
        }
        switch (c) {
            case 0 -> System.out.println("kalamush yili");
            case 1 -> System.out.println("sigir yili");
            case 2 -> System.out.println("yo'lbars yili");
            case 3 -> System.out.println("quyon yili");
            case 4 -> System.out.println("ajdaho yili");
            case 5 -> System.out.println("ilon yili");
            case 6 -> System.out.println("ot yili");
            case 7 -> System.out.println("qo'y yili");
            case 8 -> System.out.println("maymun yili");
            case 9 -> System.out.println("tovuq yili");
            case 10 -> System.out.println("it yili");
            case 11 -> System.out.println("cho'chqa yili");
        }
    }
}
