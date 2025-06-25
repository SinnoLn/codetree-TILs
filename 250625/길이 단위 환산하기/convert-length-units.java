import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        double ft = 30.48;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double n = Double.parseDouble(br.readLine());
        System.out.printf("%.1f",n*ft);
    }
}