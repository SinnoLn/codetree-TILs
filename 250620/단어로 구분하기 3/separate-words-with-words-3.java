import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = br.readLine().split(" ");
        for(int i=0; i<list.length; i++){
            System.out.println(list[list.length-i-1]);
        }

    }
}