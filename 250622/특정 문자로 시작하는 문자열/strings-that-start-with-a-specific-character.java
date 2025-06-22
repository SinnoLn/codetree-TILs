import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for(int i=0; i<n; i++){
            words[i] = br.readLine();
        }

        char startWord = br.readLine().charAt(0);

        double len = 0.0;
        int cnt = 0;

        for(String s : words){
            char c = s.charAt(0);
            if(c == startWord){
                len+=s.length();
                cnt++;
            }
        }

        len = len/cnt;

        System.out.printf("%d %.2f", cnt, len);
    }
}