import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char a = s.charAt(0);
        char b = s.charAt(1);

        String ans = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == b) ans+=a;
            else ans+=s.charAt(i);
        }

        System.out.println(ans);
    }
}