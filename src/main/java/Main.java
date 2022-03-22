import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long r = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.println(z(n, r, c));
    }

    public static long z(long num, long x, long y) {
        if (num == 0) {
            return 0;
        }
        if (x < Math.pow(2, num - 1) && y < Math.pow(2, num - 1)) {
            return z(num - 1, x, y);
        }
        else if (x < Math.pow(2, num - 1) && y >= Math.pow(2, num - 1)) {
            return (long) (Math.pow(4, num - 1) + z(num - 1, x, (long) (y - Math.pow(2,num - 1))));
        }
        else if (x >= Math.pow(2, num - 1) && y < Math.pow(2, num - 1)) {
            return (long) (Math.pow(4, num - 1) * 2 + z(num - 1, (long) (x - Math.pow(2, num - 1)), y));
        }
        return (long) (Math.pow(4, num - 1) * 3 + z(num - 1, (long) (x - Math.pow(2, num - 1)), (long) (y - Math.pow(2, num - 1))));
    }
}
