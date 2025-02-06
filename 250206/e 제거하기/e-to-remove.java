import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int index = s.indexOf('e');
        s = s.substring(0,index) + s.substring(index+1);

        System.out.println(s);
    }
}