import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans = "";

        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(Character.isDigit(c)) ans+=c;
            else if(Character.isLetter(c)){
                if(c>='A' && c<='Z') ans+=(char)(c - 'A' + 'a');
                else ans+=c;
            } 
        }
        System.out.println(ans);
    }
}