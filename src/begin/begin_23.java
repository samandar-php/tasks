package begin;

import java.util.Scanner;

public class begin_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        A = A + B + C;
        B = A - B - C;
        C = A - B - C;
        A = A - B - C;
        System.out.println("A= " + A);
        System.out.println("B= " + B);
        System.out.println("C= " + C);
    }
}
