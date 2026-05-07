import java.util.Scanner;
import java.util.HashMap;

public class LongestSubarrayDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // base case

        int maxLength = 0;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            // handle negative sums
            int rem = ((currentSum % k) + k) % k;

            if (map.containsKey(rem)) {
                int prevIndex = map.get(rem);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                map.put(rem, i);
            }
        }

        System.out.println(maxLength);
        sc.close();
    }
}