import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int idx = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(idx++ + " ");
            }
            System.out.println();
        }
    }
}