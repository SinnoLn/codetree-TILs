import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[10];

        for(int i=0; i<10; i++){
            words[i] = br.readLine();
        }

        char endWord = br.readLine().charAt(0);

        boolean check = false;
        for(String s : words){
            char c = s.charAt(s.length()-1);
            if(c == endWord){
                System.out.println(s);
                check = true;
            }
        }

        if(!check) System.out.println("None");
    }
}