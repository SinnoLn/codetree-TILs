import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String ans = "";
        for(int i=0; i<n; i++){
            String s = sc.next();
            for(int j=0; j<s.length(); j++){
                ans += s.charAt(j);
                if(ans.length() == 5){
                    System.out.println(ans);
                    ans = "";
                }
            }
        }
        System.out.println(ans);
    }
}