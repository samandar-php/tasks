package fors;

import java.util.Scanner;

public class fors_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double sum = 1;
        double b = 1;
        for (int i = 1; i <= n; i++) {
            b *= a;
            sum += b;
        }
        System.out.println(sum);
    }
}
