package begin;

import java.util.Scanner;

public class begin_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int A = input.nextInt();
        int Y = input.nextInt();
        System.out.println("1 kg narxi: " + A / X);
        System.out.println("Y kg narxi: " + A * Y / X);
    }
}
