import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if((s1+s2).equals(s2+s1)) System.out.println("true");
        else System.out.println("false");

    }
}