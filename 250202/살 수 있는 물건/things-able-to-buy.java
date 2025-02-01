import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>=3000) System.out.println("book");
        else if(a>=1000) System.out.println("mask");
        else System.out.println("no");        
    }
}