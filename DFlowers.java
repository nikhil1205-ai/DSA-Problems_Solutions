import java.io.*;
import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int MAX = 100000;

        long[] dp = new long[MAX + 1];
        long[] prefix = new long[MAX + 1];

        // Base case
        dp[0] = 1;

        // DP
        for (int i = 1; i <= MAX; i++) {

            dp[i] = dp[i - 1];

            if (i >= k) {
                dp[i] = (dp[i] + dp[i - k]) % MOD;
            }
        }

        // Prefix sum
        for (int i = 1; i <= MAX; i++) {
            prefix[i] = (prefix[i - 1] + dp[i]) % MOD;
        }

        // Queries
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            long ans = (prefix[b] - prefix[a - 1] + MOD) % MOD;

            output.append(ans).append('\n');
        }

        System.out.print(output);
    }
}