import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
    public static int factorial(int n){
        if(n==1) return 1;
        return factorial(n-1)+n;
    }
}