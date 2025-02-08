import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = String.valueOf(chars);

        System.out.println(s);
        sc.close();
    }
}