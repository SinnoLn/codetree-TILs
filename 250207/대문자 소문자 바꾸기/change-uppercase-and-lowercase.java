import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        String ans = "";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z') ans += (char)(c-'a'+'A');
            else ans += (char)(c-'A'+'a'); 
        }
        System.out.println(ans);
        sc.close();
    }
}