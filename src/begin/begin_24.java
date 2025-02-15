package begin;

import java.util.Scanner;

public class begin_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        A = A + C;
        C = A - C;
        A = A - C;
        B = B + C;
        C = B - C;
        B = B - C;
        System.out.println("A= " + A);
        System.out.println("B= " + B);
        System.out.println("C= " + C);
    }
}
