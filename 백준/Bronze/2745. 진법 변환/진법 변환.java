import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        long result = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            int val;

            if (c >= '0' && c <= '9') val = c - '0';
            else val = c - 'A' + 10;

            result = result * b + val;
        }

        System.out.print(result);
    }
}