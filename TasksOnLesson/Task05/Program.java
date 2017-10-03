import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int mas[] = new int[N];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
            int imin = 0;
            int imax = 0;
            int max = mas[0];
            int min = mas[0];
         for (i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                imax = i;
            }
            if (mas[i] < min) {
                min = mas[i];
                imin = i;
            }
        }
        int c;
        c = mas[imin];
        mas[imin] = mas[imax];
        mas[imax] = c;

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + " ");
        }
    }
}
