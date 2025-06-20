import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] word = new int[26];

        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)) cnt++;
            else {
                sb.append(s.charAt(i-1)).append(cnt);
                cnt = 1;
            }
        }
        sb.append(s.charAt(s.length() - 1)).append(cnt);

        System.out.println(sb.length());
        System.out.println(sb.toString());
    }
}