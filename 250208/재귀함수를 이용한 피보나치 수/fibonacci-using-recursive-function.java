import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(F(n));
        sc.close();
    }
    public static int F(int n){
        if(n==1) return 1;
        if(n==2) return 1;

        return F(n-1) + F(n-2);
    }
}