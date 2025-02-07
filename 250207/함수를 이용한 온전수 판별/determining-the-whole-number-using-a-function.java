import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        for(int i=a; i<b+1; i++){
            if(!isPerfectNumber(i)) ans++;
        }
        System.out.println(ans);
        sc.close();
    }

    public static boolean isPerfectNumber(int n){
        return n%2==0 || n%10==5 || (n%3==0 && n%9 !=0);
    }
}