import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int num = s.charAt(0);
        if(num == 122) System.out.println('a');
        else System.out.println((char)(num+1));
    }
}