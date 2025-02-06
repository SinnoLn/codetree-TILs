import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String s = a.substring(0,2);
        String ss = b.substring(2);

        System.out.println(s+ss);
    }
}