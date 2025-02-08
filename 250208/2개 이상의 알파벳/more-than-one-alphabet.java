import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(cal(s)) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
    public static boolean cal(String s){
        int[] alphabet = new int[26];
        for(int i=0; i<s.length(); i++){
            alphabet[s.charAt(i)-'a']++;
        }
        int count = 0;
        for(int i=0; i<26; i++){
            if(alphabet[i]>0) count++;
            if(count>1) return true;
        }
        return false;
    }
}