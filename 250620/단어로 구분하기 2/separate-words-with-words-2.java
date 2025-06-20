import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = br.readLine().split(" ");

        for(int i=0; i<list.length; i+=2){
            System.out.println(list[i]);
        }
    }
}