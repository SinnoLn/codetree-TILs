import java.util.*;

public class Main {
    public static int[] remain_days = {31,29,31,30,31,30,31,31,30,31,30,31};
    public static String[] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month1 = sc.nextInt();
        int day1 = sc.nextInt();
        int month2 = sc.nextInt();
        int day2 = sc.nextInt();

        String day = sc.next();

        int sum1 = day1;
        int sum2 = day2;

        for(int i=0; i<month1-1; i++) sum1+=remain_days[i];
        for(int i=0; i<month2-1; i++) sum2+=remain_days[i];

        int num = Arrays.asList(days).indexOf(day);
        int ans = (sum2-sum1)/7;
        if((sum2-sum1)%7>=num) ans++;

        System.out.println(ans);
        sc.close();

    }
}