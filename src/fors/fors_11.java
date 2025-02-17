package fors;

import java.util.Scanner;

import static java.lang.Math.pow;

public class fors_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (int) pow((n + i) * (n + i),2);
        }
        System.out.println(sum);
    }
}
