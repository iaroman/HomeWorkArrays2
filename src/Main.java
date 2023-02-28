import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int arrIn : arr) {
            sum += arrIn;
        }
        System.out.println("___ Task 1 ___");
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        System.out.println("___ Task 2 ___");
        int [] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int arrIn : arr) {
            if (arrIn < min) min = arrIn;
            if (arrIn > max) max = arrIn;
        }
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за месяц составила " + max + " рублей");
    }
    public static void task3() {
        System.out.println("___ Task 3 ___");
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int arrIn : arr) {
            sum += arrIn;
        }
        double avv = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avv + " рублей");
    }
    public static void task4() {
        System.out.println("___ Task 4 ___");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}