class Program {
    public static void main(String[] args) { //входная точка приложения, args - массив входных параметров (данные после пробела)
        int n = 67;
        int a =0; int b = 0; int c = 0; int d = 0; int e = 0; int f = 0; int g = 0;
        a = n % 2;
        n = n / 2;
        b = n % 2;
        n = n / 2;
        c = n % 2;
        n = n / 2;
        d = n % 2;
        n = n / 2;
        e = n % 2;
        n = n / 2;
        f = n % 2;
        n = n / 2;
        g = n % 2;
        n = n / 2;
        System.out.println(g);
        System.out.println(f);
        System.out.println(e);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

    }
}