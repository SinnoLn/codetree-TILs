import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurse(n);
        System.out.println();
        recurseReverse(n);
        sc.close();
    }
    public static void recurse(int n){
        if(n==0) return;
        recurse(n-1);
        System.out.printf(n +" ");
    }

    public static void recurseReverse(int n){
        if(n==0) return;
        System.out.printf(n +" ");
        recurseReverse(n-1);
    }
}