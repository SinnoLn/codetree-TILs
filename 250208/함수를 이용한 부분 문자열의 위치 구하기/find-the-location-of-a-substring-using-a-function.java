import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String find = sc.next();
        System.out.println(cal(s, find));
        sc.close();
    }
    public static int cal(String s, String find){
        return s.indexOf(find);
    }
}