import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String act = scanner.next();
            if (act.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }
        ArrayList<String> result = new ArrayList<>(set);
        Collections.sort(result, Collections.reverseOrder());

        for (String name : result) {
            System.out.println(name);
        }
    }
}