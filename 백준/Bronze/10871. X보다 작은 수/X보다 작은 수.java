import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];  // 크기 지정

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int count = 0;
        for(int num : A){
            if (num < X){
                System.out.print(num+" ");
            }
        }

    }
}