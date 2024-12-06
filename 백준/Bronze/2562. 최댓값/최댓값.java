import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] k = new int[10];

        for(int i=1; i<10; i++){
            k[i] = sc.nextInt();
        }

        int max = k[0];
        int index = k[0];

        for(int i=1; i<10; i++){
            if(k[i]>max) {
                max = k[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}