import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int j = 0; j < (array.length - 1) / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}