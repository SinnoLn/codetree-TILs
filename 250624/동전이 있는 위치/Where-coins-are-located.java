import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] check = new int[n][n];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken())-1;
            int x = Integer.parseInt(st.nextToken())-1;

            check[y][x] = 1;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(check[i][j] + " ");
            }
            System.out.println();
        }

    }
}