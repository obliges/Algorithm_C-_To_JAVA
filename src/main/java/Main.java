import java.io.*;
import java.util.*;



public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        n = n - n % 5;
        System.out.println(n / 125 + n / 25 + n / 5);

    }


}

