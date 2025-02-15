package begin;

import java.util.Scanner;

public class begin_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int A = input.nextInt();
        int Y = input.nextInt();
        int B = input.nextInt();
        System.out.println("1 kg shokolad narxi: " + A / X);
        System.out.println("1 kg shakar konfeti narxi: " + B / Y);
        if (A / X > B / Y) {
            System.out.println("Shokolad qimmat");
        } else {
            System.out.println("Shakar qimmat");
        }
    }
}
