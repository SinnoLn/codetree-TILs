import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        if(Check(x1, x2, x3, x4)) System.out.println("intersecting");
        else System.out.println("nonintersecting");
    }

    public static boolean Check(int x1, int x2, int x3, int x4){
        if(x2<x3 || x4<x1) return false;
        return true;
    }
}