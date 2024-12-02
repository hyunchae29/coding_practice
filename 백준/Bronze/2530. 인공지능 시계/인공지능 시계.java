import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        int addSecond = sc.nextInt();
        
        second += addSecond;
        minute += second/60;
        second %= 60; 
        
        hour += minute / 60;
        minute %= 60; 

        hour %= 24;     
        
        System.out.println(hour + " " + minute + " " + second + " " );
        
        sc.close();
            
    }
}