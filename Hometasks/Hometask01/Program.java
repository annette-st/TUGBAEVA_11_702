import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = 1;
        int sum = 0;
        int s = 0;
        int c;
        int a = scanner.nextInt();
        while(a != -1) {
            c = a;
            while(c != 0) {
                sum = sum + c % 10;
                c = c / 10;
            }
            if (sum % 2== 0) {
                p = p * a;
            }
            if (a % 10== 7) {
                s = s + a;
            }
            a = scanner.nextInt();
            sum = 0;
        }
        System.out.println(p);
        System.out.println(s);

    }
}