import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        if(isDate(month, day))System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }

    public static boolean isDate(int month, int day){
        if(month>12) return false;
        if(month == 2 && day < 29) return true;
        if(month == 1 || month == 3||month == 5||month == 7||month == 8||month == 10||month == 12){
            if(day<32) return true;
        }
        else {
            if(day<31) return true;
        }
        return false;
    }
}