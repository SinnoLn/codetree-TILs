import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";

        for(int i=0; i<n; i++){
            String s = sc.next();
            ans+=s;
        }

        System.out.println(ans);
    }
}