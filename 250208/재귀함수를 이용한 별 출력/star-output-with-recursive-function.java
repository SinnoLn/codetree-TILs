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
        recurse(n-1);
        for(int i=0; i<n; i++)
            System.out.print("*");
        System.out.println();
    }
}