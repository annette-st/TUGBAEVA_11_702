import java.util.Scanner;
class Program {

 public static void main (String[] args) {
Scanner scanner = new Scanner(System.in);
int temp = 0, N = 0;
int a[] = new int[100];
for (int i=0; i < 99; i++) {
	a[i] = 0;
}
while (temp != 6) {
	System.out.println(" ");
	System.out.println("MENU:");
	System.out.println("1. Create an array;");
	System.out.println("2. Add a number in the end of the array;");
	System.out.println("3. Delete a number; ");
	System.out.println("4. Add a number in the array; ");
	System.out.println("5. Write down the array; ");
	System.out.println("6. Exit");
	System.out.println(" ");
	temp = scanner.nextInt();
	if (temp == 1) {
		System.out.println("Size of array:");
		N = scanner.nextInt(); 
		System.out.println("Numbers of array:");
		for (int i=0; i<N; i++) {
			a[i] = scanner.nextInt();
		}
	}
	if (temp == 2) {
		System.out.println("Write a number:");
		++N;
		a[N-1] = scanner.nextInt();
	}
	if (temp == 3) {
		System.out.println("Write an index:");
		int index  = scanner.nextInt();
        for (int i=0; i != N - index; i++) {
          	a[index + i] = a[index + 1 + i];
        }
        --N;
	}
	if (temp == 4) {
		int k = 0;
		System.out.println("Write a number:");
		int number = scanner.nextInt();
		System.out.println("Write an index:");
    	int index  = scanner.nextInt();
    	++N;
    	for (int i=N; i > index; i--) {
			k= a[i-1];
			a[i-1] = a[i];
			a[i] = k;
    	}
    	a[index] = number;
	}
	if (temp == 5) {
		System.out.println("Your array:");
		for (int i=0; i < N; i++) {
    		System.out.print(a[i] + " ");
    		}; 

	}
   }
   System.out.println("See you soon!");
  }
 }
