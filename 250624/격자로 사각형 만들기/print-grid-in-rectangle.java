import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        for(int i=0; i<n; i++){
            map[i][0] = 1;
            map[0][i] = 1;
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                map[i][j] = map[i-1][j] + map[i][j-1] + map[i-1][j-1];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}