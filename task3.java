import java.util.Scanner;

public class task3 {

    public static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число n > 1: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Число должно быть больше 1");
        } else {
            System.out.println(isPrime(n, 2) ? "Да :) " : "Нет :( ");
        }

        scanner.close();
    }
}