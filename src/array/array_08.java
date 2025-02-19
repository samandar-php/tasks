package array;

import java.util.Scanner;

public class array_08 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < count; i++) {
            if (array[i] % 2 != 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }

}
