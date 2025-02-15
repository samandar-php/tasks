package begin;

import java.util.Scanner;

public class begin_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double p = (a + b + c) / 2;
        System.out.println("Perimetr: " + (a + b + c));
        System.out.println("Yuzasi: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
