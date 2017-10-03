import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int mas[] = new int[N];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }

        for (int j = 0; j < mas.length; j++) {
            int min = mas[j];
            int imin = j;
            for (int i = j; i < mas.length; i++) {
                if (mas[i] < min) {
                    min = mas[i];
                    imin = i;
                }
            }
            int temp = mas[j];
            mas[j] = min;
            mas[imin] = temp;
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}