import java.util.Scanner;

public class task5 {

    public static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите m: ");
        int m = scanner.nextInt();

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Числа должны быть неотрицательными");
        } else {
            System.out.println("A(" + m + ", " + n + ") = " + ackermann(m, n));
        }

        scanner.close();
    }
}