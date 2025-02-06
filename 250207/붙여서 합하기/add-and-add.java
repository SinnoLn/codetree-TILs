import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String addAB = a+b;
        String addBA = b+a;

        System.out.println(Integer.parseInt(addAB) + Integer.parseInt(addBA));
        sc.close();
    }
}