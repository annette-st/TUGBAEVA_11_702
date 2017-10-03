import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int s = 0;
        int a = scanner.nextInt();
        while(a!=-1) {
            if (a%10 == 7) {
                s = s + a;
            }
            a = scanner.nextInt();
            sum = 0;
        }
        System.out.println(s);

    }
}