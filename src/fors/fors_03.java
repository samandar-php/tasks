package fors;

import java.util.Scanner;

public class fors_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = b; i >= a; i--) {
            System.out.println(i);
        }
    }
}
