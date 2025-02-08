import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recurse(n));
        sc.close();
    }
    public static int recurse(int n){
        if(n==1) return 0;

        if(n%2==0) return recurse(n/2) + 1;
        else return recurse(n/3) + 1;
    }
}