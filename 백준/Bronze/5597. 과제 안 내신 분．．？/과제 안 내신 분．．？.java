import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] st = new boolean[30]; //확인만 하면 되기 때문

        for (int i = 0; i < 28; i++){
            int n = sc.nextInt();
            st[n-1] = true;  //배열 인덱스 맞추기
        }
        for (int i = 0; i < 30; i ++){
            if (!st[i]){
                System.out.println(i+1);
            }
        }
    }
}
