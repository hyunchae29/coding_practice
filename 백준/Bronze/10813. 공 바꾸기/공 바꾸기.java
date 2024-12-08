import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] baskets = new int[n];
        
        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1;
        }
        for (int t = 0; t < m; t++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }
        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
        sc.close();
    }
}