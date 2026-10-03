public class task1 {

    public static int[] removeAll(int[] arr, int value) {

        int count = 0;
        for (int x : arr) {
            if (x != value) count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int x : arr) {
            if (x != value) {
                result[index++] = x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        int value = 2;
        int[] result = removeAll(numbers, value);
        System.out.print("Результат: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}