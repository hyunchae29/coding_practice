import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] pos = new int[26];

        for (int i = 0; i < 26; i++) {
            pos[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (pos[index] == -1) {
                pos[index] = i;
            }
        }

        for (int i : pos) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
