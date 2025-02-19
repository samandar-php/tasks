package array;

import java.util.Scanner;

public class array_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a - 1; i < b; i++) {
            sum += array[i];

        }
        System.out.println(sum);
    }


}
