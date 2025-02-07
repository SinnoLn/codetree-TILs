import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isLeapYear(n)) System.out.println("true");
        else System.out.println("false");
    }

    public static boolean isLeapYear(int year){
        if(year%100==0&&year%400!=0)  return false;
        if(year%4==0) return true; 
        return false;
    }
}