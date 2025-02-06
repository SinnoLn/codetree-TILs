import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.print((int)a.charAt(0)+(int)b.charAt(0) + " " + Math.abs((int)a.charAt(0)-(int)b.charAt(0)));
    }
}