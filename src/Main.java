import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i != 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(n + " Is a prime number.");
        } else {
            System.out.println(n + " Is not a prime number.");
        }
    }
}