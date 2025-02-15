package begin;

import java.util.Scanner;

public class begin_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Gipotenuza: " + Math.sqrt(a * a + b * b));
        System.out.println("Perimetr: " + (a + b + Math.sqrt(a * a + b * b)));
    }
}
