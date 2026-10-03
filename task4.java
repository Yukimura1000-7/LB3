import java.util.Scanner;

public class task4 {

    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово (только латиница): ");
        String word = scanner.nextLine().trim();

        boolean result = isPalindrome(word, 0, word.length() - 1);
        System.out.println(result ? "Да" : "Нет");

        scanner.close();
    }
}