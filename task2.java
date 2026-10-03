import java.util.Scanner;

public class task2 {

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static double lnFactorial(int n) {
        return Math.log(factorial(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("n должно быть неотрицательным");
        } else {
            System.out.println("ln(" + n + "!) = " + lnFactorial(n));
        }

        scanner.close();
    }
}