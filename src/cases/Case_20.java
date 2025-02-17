package cases;

import java.util.Scanner;

public class Case_20 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int d = scanner.nextInt();
    int m = scanner.nextInt();
        if (m == 1 && d >= 20 || m == 2 && d <= 18) {
        System.out.println("Aquarius");
    } else if (m == 2 || m == 3 && d <= 20) {
        System.out.println("Pisces");
    } else if (m == 3 || m == 4 && d <= 19) {
        System.out.println("Aries");
    } else if (m == 4 || m == 5 && d <= 20) {
        System.out.println("Taurus");
    } else if (m == 5 || m == 6 && d <= 21) {
        System.out.println("Gemini");
    } else if (m == 6 || m == 7 && d <= 22) {
        System.out.println("Cancer");
    } else if (m == 7 || m == 8 && d <= 22) {
        System.out.println("Leo");
    } else if (m == 8 || m == 9 && d <= 22) {
        System.out.println("Virgo");
    } else if (m == 9 || m == 10 && d <= 22) {
        System.out.println("Libra");
    } else if (m == 10 || m == 11 && d <= 22) {
        System.out.println("Scorpio");
    } else if (m == 11 || m == 12 && d <= 21) {
        System.out.println("Sagittarius");
    } else if (m == 12 || m == 1) {
        System.out.println("Capricorn");
    } else {
        System.out.println("Error");
    }
}

        }
