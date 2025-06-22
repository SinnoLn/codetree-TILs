import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = br.readLine().split(" ");

        int len1 = words[0].length();
        int len2 = words[1].length();

        if(len1 > len2) System.out.println(words[0] +" "+ len1);
        else if(len1 < len2) System.out.println(words[1] +" "+ len2);
        else System.out.println("same");
    }
}