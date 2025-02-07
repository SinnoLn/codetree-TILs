import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        printWord(n);
        sc.close();
    }

    public static void printWord(int n){
        for(int i=0; i<n; i++)
            System.out.println("12345^&*()_");
    }
}