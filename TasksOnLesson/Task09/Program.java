
public class Program {

    public static void bubbleSort(int a[]) {

        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }


    }

    public static void main(String[] args) {
        int []x = {1, 2, 3, 10, 5};
        int []y = {8, 9, 1, 5, 3};
        bubbleSort(x);
        bubbleSort(y);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        for (int j = 0; j < y.length; j++) {
            System.out.print(y[j] + " ");
        }

    }
}

//процедура "Сортировка пузырьком", вызов процедуры для опред. массивов