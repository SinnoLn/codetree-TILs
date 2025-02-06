import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();
        for(int i=0; i<len+1; i++){
            System.out.println(s);
            s = s.substring(len-1, len) + s.substring(0, len-1);
        }
    }
}