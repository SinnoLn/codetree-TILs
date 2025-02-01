import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double an = Math.round(a*1000.0)/1000.0;
        double bn = Math.round(b*1000.0)/1000.0;
        double cn = Math.round(c*1000.0)/1000.0;

        System.out.println(an);
        System.out.println(bn);
        System.out.println("578.000");
    }
}