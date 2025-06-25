import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double ft = 30.48;
        int mi = 160934;

        double conFt = ft*9.2;
        double conMi = mi*1.3;

        System.out.printf("9.2ft = %.1fcm\n", conFt);
        System.out.printf("1.3mi = %.1fcm", conMi);
    }
}