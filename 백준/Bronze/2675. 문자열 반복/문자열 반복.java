import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            StringBuilder result = new StringBuilder();

            for (char c : s.toCharArray()) {
                result.append(String.valueOf(c).repeat(r));
            }
            System.out.println(result);
        }
    }
}
