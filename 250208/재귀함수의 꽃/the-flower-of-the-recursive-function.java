import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurse(n);
        sc.close();
    }
    public static void recurse(int n){
        if(n==0) return;
        System.out.print(n + " ");
        recurse(n-1);
        System.out.print(n + " ");
    }
}