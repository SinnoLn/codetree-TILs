import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(checkNum(n)) System.out.println("Yes");
        else System.out.println("No");
        
    }
    public static boolean checkNum(int n){
        if(n%2==0){
            int sum = 0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            if(sum%5==0) return true;
        }
        return false;
    }
}