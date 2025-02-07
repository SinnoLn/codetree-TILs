import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String an = "";
        String bn = "";
        for(int i=0; i<a; i++) an+=sc.next();
        for(int i=0; i<b; i++) bn+=sc.next();

        if(an.contains(bn)) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}