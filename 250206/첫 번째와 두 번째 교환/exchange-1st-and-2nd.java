import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char first = s.charAt(0);
        char second = s.charAt(1);
        String ans = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==first) ans+=second;
            else if(s.charAt(i)==second) ans+=first;
            else ans+=s.charAt(i);
        }

        System.out.println(ans);
    }
}