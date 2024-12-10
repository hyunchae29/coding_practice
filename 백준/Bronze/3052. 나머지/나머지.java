import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> remainder = new HashSet<>();

        for (int i = 0; i < 10; i++){
            int n = sc.nextInt();
            remainder.add(n % 42);
        }
        System.out.println(remainder.size());
    }
}