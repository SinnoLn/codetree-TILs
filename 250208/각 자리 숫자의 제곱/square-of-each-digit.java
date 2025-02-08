import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recurse(n));
        sc.close();
    }
    public static int recurse(int n){
        if(n<10) return n*n;
        return recurse(n/10) + (n%10)*(n%10);
    }
}