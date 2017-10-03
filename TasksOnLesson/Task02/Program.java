import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 1) {
            System.out.println(a + " is nechet");
        } else {
            System.out.println(a + " is chet");
        }

    }
}