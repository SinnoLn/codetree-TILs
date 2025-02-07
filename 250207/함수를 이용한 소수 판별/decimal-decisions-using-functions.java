import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for(int i=a; i<b+1; i++){
            if(isPrime(i)) sum+=i;
        }       
        System.out.println(sum);
        sc.close();
    }
    
    public static boolean isPrime(int n){
        if(n == 1) return false;
        if(n == 2) return true; 
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}