package fors;

import java.util.Scanner;

import static java.lang.Math.round;

public class fors_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        for (double i = 1.2; i <= 2.0; i += 0.2) {
            double a = round(price * i);
            System.out.println(a);
        }
    }
}
