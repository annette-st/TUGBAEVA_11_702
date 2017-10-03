import java.util.Scanner;

class Program {

    public static double function(double x) {
        return Math.sin(1 / x);
    }


    public static double integrate(double a, double b, double h) {
        double result = 0;
        for (double i = a; i <= b; i += h) {
            if (i != 0) {
                result = result + h * function(i);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int n = scanner.nextInt();

        double h = Math.abs((a + b) / n);

        double integral = integrate(a, b, h);

        System.out.print(integral);
    }

}
//проверка на простое число