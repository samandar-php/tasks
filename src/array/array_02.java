package array;
import java.util.Scanner;
import static java.lang.Math.pow;

public class array_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =  scanner.nextInt();
        int[] array = new int[count];
        for (int i = 1; i < count; i++) {
         array[i] = (int) pow(2,i);
        }
        for (int j : array) {
            System.out.print(j+" ");
        }
    }
}
