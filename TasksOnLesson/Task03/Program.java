import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a < (b - 1)) {
            a = a + 1;
            System.out.println(a);
        }

    }
}