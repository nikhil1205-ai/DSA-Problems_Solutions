import java.io.*;
import java.util.*;

public class DLongestKGoodSegment {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;

        int bestL = 0;
        int bestR = 0;

        for (int right = 0; right < n; right++) {

            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > k) {

                map.put(arr[left], map.get(arr[left]) - 1);

                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }

                left++;
            }

            if ((right - left) > (bestR - bestL)) {
                bestL = left;
                bestR = right;
            }
        }

        System.out.println((bestL + 1) + " " + (bestR + 1));
    }
}