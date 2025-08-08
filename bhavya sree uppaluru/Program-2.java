import java.util.Scanner;

public class GenerateOddSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int a = scanner.nextInt();
         for (int i = 1; i <= a; i++) {
            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber);
            if (i != a) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
        scanner.close();
    }
}
