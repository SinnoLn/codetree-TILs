import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double am = Math.round(a*100.0)/100.0;
        double bm = Math.round(b*100.0)/100.0;

        System.out.println(c);
        System.out.printf("%.2f", am);
        System.out.println();
        System.out.printf("%.2f", bm);
    }
}