import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        resurse(n);
        sc.close();
    }
    public static void resurse(int n){
        if(n==0) return;
        System.out.println("HelloWorld");
        resurse(n-1);
    }
}