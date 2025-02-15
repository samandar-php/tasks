package begin;

import java.util.Scanner;

import static java.lang.Math.pow;

public class begin_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        System.out.println("A2= " + pow(A,2));
        System.out.println("A3= " + pow(A,3));
        System.out.println("A5= " + pow(A,5));
        System.out.println("A10= " + pow(A,10));
        System.out.println("A15= " + pow(A,15));
    }
}
