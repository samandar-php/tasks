package begin;

import java.util.Scanner;

public class begin_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        System.out.println("AC: " + Math.abs(C - A));
        System.out.println("BC: " + Math.abs(C - B));
        System.out.println("AC + BC: " + (Math.abs(C - A) + Math.abs(C - B)));
    }
}
