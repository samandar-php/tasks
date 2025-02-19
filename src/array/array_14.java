package array;

import java.util.Scanner;

public class array_14 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (Math.random() * 100);
          System.out.print(array[i]+ " ");
        }
        System.out.println("\n");
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n");
        for (int i = count - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
