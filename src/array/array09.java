package array;

import java.util.Scanner;

public class array09 {
    public static void main(String[] args) {
                Scanner scanner = new  Scanner(System.in);
                int count = scanner.nextInt();
                int[] array = new int[count];
                int sum =0;
                for (int i = 0; i < count; i++) {
                    array[i] = (int) (Math.random() * 100);
                    System.out.print(array[i]+ " ");
                }

                System.out.print("\n");
                for (int i = count - 1; i >= 0; i--) {
                    System.out.print(array[i]+ " ");
                    if (array[i] % 2 == 0) {
                        sum++;
                    }
                }
        System.out.print("\n");
        System.out.println(sum);


    }
}
