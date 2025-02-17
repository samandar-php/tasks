package fors;

import java.util.Scanner;

public class fors_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 1;
        for (double i = 1.1; i <= n; i += 0.1) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
