import java.util.*;

public class CountMultiples {
    public static void main(String[] args) {
        
        int[] inputNumbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
     
        Map<Integer, Integer> multipleCounts = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            multipleCounts.put(i, 0);
        }
        for (int number : inputNumbers) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (number % divisor == 0) {
                    multipleCounts.put(divisor, multipleCounts.get(divisor) + 1);
                }
            }
        }
        System.out.println(multipleCounts);
    }
}