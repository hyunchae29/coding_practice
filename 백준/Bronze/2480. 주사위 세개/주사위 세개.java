import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 1번째
        int b = sc.nextInt(); // 2번째
        int c = sc.nextInt(); // 3번째
        int d = Math.max(a, Math.max(b, c));

        if(a==b && a==c){
            System.out.println(10000 + (a*1000));
        }else if(a==b || a==c) {
            System.out.println(1000 + (a * 100));
        }else if(b==c) {
            System.out.println(1000 + (b * 100));
        } else {
            System.out.println(d*100);
        }
        sc.close();
    }
}