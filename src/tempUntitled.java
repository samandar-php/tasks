
import java.util.Scanner;
public class tempUntitled {
    public static long fibonacci(long n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter which Fibonacci want you compute: ");
        long n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Fibonacci of number " + n + " = " + fibonacci(n));
        }
    }
}
