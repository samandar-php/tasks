package array;

import java.util.Scanner;

public class array06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] array = new  int[c];
        if (c > 0) array[0] = a;
        if (c > 1) array[1] = b;
        for (int i = 2; i < c; i++) {
            array[i] = 0;
            for (int j = 0; j < i; j++) {
                array[i] += array[j];
            }
        }
    for (int j: array){
        System.out.print(j+" ");
    }
    }
}
