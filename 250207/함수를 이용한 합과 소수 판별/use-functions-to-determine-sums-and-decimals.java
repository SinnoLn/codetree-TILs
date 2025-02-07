import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans =0;

        for(int i=a; i<b+1; i++){
            if(isPrime(i)&&isEven(i)) ans++;
        }

        System.out.println(ans);
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n==1) return false;
        if(n==2) return true;
        for(int i=2; i<n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static boolean isEven(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum%2==0) return true;
        else return false;
    }
}