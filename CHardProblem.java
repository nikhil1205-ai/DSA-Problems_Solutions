import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] cost = new long[n];
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        String[] rev = new String[n];

        for (int i = 0; i < n; i++) {
            rev[i] = new StringBuilder(s[i]).reverse().toString();
        }

        long INF = Long.MAX_VALUE / 4;

        // dp[i][0] = minimum cost if s[i] is NOT reversed
        // dp[i][1] = minimum cost if s[i] IS reversed
        long[][] dp = new long[n][2];

        for (int i = 0; i < n; i++) {
            dp[i][0] = INF;
            dp[i][1] = INF;
        }

        dp[0][0] = 0;
        dp[0][1] = cost[0];

        for (int i = 1; i < n; i++) {

            // Current string is NOT reversed
            if (s[i].compareTo(s[i - 1]) >= 0) {
                dp[i][0] = Math.min(dp[i][0], dp[i - 1][0]);
            }

            if (s[i].compareTo(rev[i - 1]) >= 0) {
                dp[i][0] = Math.min(dp[i][0], dp[i - 1][1]);
            }

            // Current string IS reversed
            if (rev[i].compareTo(s[i - 1]) >= 0) {
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][0] + cost[i]);
            }

            if (rev[i].compareTo(rev[i - 1]) >= 0) {
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + cost[i]);
            }
        }

        long answer = Math.min(dp[n - 1][0], dp[n - 1][1]);

        if (answer >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}