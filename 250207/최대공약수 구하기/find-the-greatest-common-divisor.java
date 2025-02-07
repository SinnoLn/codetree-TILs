import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n>m) System.out.println(gcd(m,n));
        else System.out.println(gcd(n,m));

       sc.close();
    }

    public static int gcd(int n, int m){
       if(m == 0) return n;
       return gcd(m, n % m);
    }
}