import java.util.*;

public class Main {
    public static int[] num_of_days = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month1 = sc.nextInt();
        int day1 = sc.nextInt();
        int month2 = sc.nextInt();
        int day2 = sc.nextInt();

        int sumMonth1 = 0;
        int sumMonth2 = 0;

        for(int i=0; i<month1-1; i++) sumMonth1+=num_of_days[i];
        for(int i=0; i<month2-1; i++) sumMonth2+=num_of_days[i];

        System.out.println(sumMonth2+day2-(sumMonth1+day1)+1);
        sc.close();
    }
}