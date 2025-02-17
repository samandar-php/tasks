package fors;

import java.util.Scanner;

public class fors_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i / 10.0 + " kg = " + price * i / 10.0);
        }
    }
}
