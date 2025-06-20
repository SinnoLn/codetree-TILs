import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(s.charAt(s.length()-i-1));
        }
        System.out.println(sb.toString());
    }
}