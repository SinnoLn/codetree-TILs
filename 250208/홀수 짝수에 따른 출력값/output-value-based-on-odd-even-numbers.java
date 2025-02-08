import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(F(n));
        sc.close();
    }
    public static int F(int n){
        if(n<=2) return n;
        return F(n-2) + n;
    }
}