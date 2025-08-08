import java.util.Scanner;
public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();

        int count;
        if (a <= 2) {
             count = 1;

        } else if (a <= 4) {
            count = 3;

        } else {
            count = 5;
            
        }

        for (int i = 1; i <= count; i++) {
            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber);
            if (i < count) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
