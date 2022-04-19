import java.io.*;
import java.util.*;



public class Main {

    static int n, m;
    static int[][] map = new int[500][500];
    static int[][] dp = new int[500][500];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        System.out.println(findCase(0, 0));
    }

    private static int findCase(int r, int c) {
        if (r == n - 1 && c == m - 1) {
            return 1;
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        int sum = 0;
        if (r != 0) {
            if (map[r - 1][c] < map[r][c]) {
                sum += findCase(r - 1, c);
            }
        }
        if (r != n - 1) {
            if (map[r + 1][c] < map[r][c]) {
                sum += findCase(r + 1, c);
            }
        }
        if (c != 0) {
            if (map[r][c - 1] < map[r][c]) {
                sum += findCase(r, c - 1);
            }
        }
        if (c != m - 1) {
            if (map[r][c + 1] < map[r][c]) {
                sum += findCase(r, c + 1);
            }
        }
        dp[r][c] = sum;
        return sum;
    }


}

