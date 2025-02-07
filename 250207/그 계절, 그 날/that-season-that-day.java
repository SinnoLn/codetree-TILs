import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        if(isDate(year, month, day)){
            if(month>=3 & month<=5) System.out.println("Spring");
            else if(month>=6 && month<=8) System.out.println("Summer");
            else if(month>=9 && month<=11) System.out.println("Fall");
            else System.out.println("Winter");
         }
         else System.out.println(-1);
        sc.close();
    }
    //125781012

    public static boolean isDate(int year, int month, int day){
        if(month==2){
            if(isLeapYear(year)) {
                if(day<30) return true;
            }
            else{
                if(day<29) return true;
            } 
        }
        if(month==1 || month==3|| month==5|| month==7|| month==8|| month==10|| month==12){
            if(day<32) return true;
        }
        else if(month==4||month==6||month==9||month==11){
            if(day<31) return true;
        }
        return false;
    }
    public static boolean isLeapYear(int year){
        if((year%4==0 &&year%100==0)&&year%400==0) return true;
        if(year%4==0 && year%100==0) return false;
        if(year%4==0) return true;

        return false;
    }
}