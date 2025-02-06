import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char c = s.charAt(0);

        char prevChar = (char) ((c-'a'-1+26)%26+'a');
        System.out.println(prevChar);

        sc.close();
    }
}