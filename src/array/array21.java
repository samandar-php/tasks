package array;

import java.util.Scanner;

public class array21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;

        for (int i = l; i <m ; i++) {
            sum = array[i];

        }
        System.out.println(sum/(l-m));
    }
}
