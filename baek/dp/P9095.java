import java.util.Scanner;

public class P9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n[] = new int[t];
        int max = -1;

        for(int i = 0; i < t; i++) {
            n[i] = sc.nextInt();
            max = Math.max(max, n[i]);
        }

        int dp[] = new int[max + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= max; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for(int i = 0; i < t; i++) {
            System.out.println(dp[n[i]]);
        }
    }
}
