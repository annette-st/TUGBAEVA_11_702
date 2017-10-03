import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, a, a = 1, max, min, p;
        n = scanner.nextInt();
        a = scanner.nextInt();
        min = a;
        max = a;
        while (i != n) {
            a = scanner.nextInt();
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
            i++;
        }
        p = max - min;
        System.out.println(p);
    }
}