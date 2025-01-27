public class Lab1 {

    static void PrimeNumber(int a) {

        System.out.println();
        int flag = 0;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }

    static void multiplicationTable(int a) {
        System.out.println("Multiplication Table: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + a + "=" + (i * a));
        }
    }


    public static void main(String[] args) {
        int arr[] = {5, 7, 8, 11, 17, 40};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);


        System.out.println("Avg: " + sum / arr.length);

        System.out.print("Even number is: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("\nOdd number is: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        PrimeNumber(12);
        multiplicationTable(25);
    }
}
