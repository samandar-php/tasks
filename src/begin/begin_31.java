package begin;

import java.util.Scanner;

public class begin_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        System.out.println("Santigrad: " + (T - 32) * 5 / 9);
    }
}
