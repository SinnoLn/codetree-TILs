import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isPalindrome(s)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean isPalindrome(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
}