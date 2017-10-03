import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int mas[] = new int[N];
        for (int i = 0; i < a.length; i++) {
            mas[i] = scanner.nextInt();
        }

        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int t = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = t;
                }
            }
        }
        for ()
