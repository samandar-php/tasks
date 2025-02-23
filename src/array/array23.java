package array;

import java.util.Scanner;

public class array23 {
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
        int sum = 0,sum1 =0;
        for (int i = 0; i < count; i++) {
            sum+=array[i];

        }
        for (int i = l; i <m ; i++) {
            sum1 = array[i];

        }
        System.out.println((sum-sum1)/(l-m));
    }
}
