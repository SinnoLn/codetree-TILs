import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] map1 = new int[3][3];
        int[][] map2 = new int[3][3];

        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                map1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        String s = br.readLine();
        
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                map2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(map1[i][j]*map2[i][j] + " ");
            }
            System.out.println();
        }
    }
}