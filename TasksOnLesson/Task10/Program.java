import java.util.Scanner;
public class Program {

    public static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number == 3) {
            return true;
        }
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPrime(n)){
            System.out.println("Simple");
        }
        else
            System.out.println("Not simple");


    }
}

//проверка на простое число