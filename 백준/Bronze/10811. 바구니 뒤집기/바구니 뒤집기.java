import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] groups = new int[N];
        for (int i = 0; i < N; i++) {
            groups[i] = i + 1;
        }

        for(int t=0; t<M; t++){
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() -1 ;

            while(i < j){
                int temp = groups[i];
                groups[i] = groups[j];
                groups[j] = temp;

                i++;
                j--;
            }
        }
        for (int group : groups){
            System.out.print(group + " ");
        }
    }
}