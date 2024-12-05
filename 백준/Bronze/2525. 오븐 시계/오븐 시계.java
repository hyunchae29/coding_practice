import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // hour
        int B = sc.nextInt(); // minute
        int C = sc.nextInt(); // 입력값 (추가 분)

        B += C;
        A += B / 60;
        B %= 60;
        A %= 24;

        System.out.println(A + " " + B);
        sc.close();
    }
}