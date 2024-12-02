import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] triNumbers = new int[45];
        for (int i = 1; i < 45; i++) {
            triNumbers[i] = i * (i + 1) / 2;
        }
        // 처음에 삼각수 값을 먼저 구함

        int cases = sc.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < cases; i++) {
            int k = sc.nextInt();
            boolean found = false;

            // 3개의 삼각수로 k를 확인
            // 정확히 3개의 삼각수의 합으로 표현될수 있다면 1, 아니면 0을 출력
            for (int j = 1; j < 45 && !found; j++) {
                for (int l = 1; l < 45 && !found; l++) {
                    for (int m = 1; m < 45 && !found; m++) {
                        if (triNumbers[j] + triNumbers[l] + triNumbers[m] == k) {
                            found = true;
                        }
                    }
                }
            }
            result.append(found ? 1 : 0).append("\n");
        }
        System.out.print(result);
        sc.close();
    }
}