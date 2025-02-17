package fors;

import java.util.Scanner;

public class fors_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
