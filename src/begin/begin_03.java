package begin;

import java.util.Scanner;

public class begin_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Perimetr: " + 2 * (a + b));
    }
}
