package begin;

import java.util.Scanner;

public class begin_40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A1 = input.nextInt();
        int B1 = input.nextInt();
        int C1 = input.nextInt();
        int A2 = input.nextInt();
        int B2 = input.nextInt();
        int C2 = input.nextInt();
        System.out.println("x= " + (C1 * B2 - C2 * B1) / (A1 * B2 - A2 * B1));
        System.out.println("y= " + (A1 * C2 - A2 * C1) / (A1 * B2 - A2 * B1));
    }
}
