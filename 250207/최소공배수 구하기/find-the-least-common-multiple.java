import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(lcm(n,m));    
        sc.close();    
    }

    public static int lcm(int n, int m){
        return(n*m)/gcd(n,m);
    }

    public static int gcd(int n, int m){
        while(m!=0){
            int temp = m;
            m = n%m;
            n = temp;
        }
        return n;
    }
}