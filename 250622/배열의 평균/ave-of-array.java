import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] list = new int[2][4];
        double allSum = 0.0;

        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double sum = 0.0;
            for(int j=0; j<4; j++){
                list[i][j] = Integer.parseInt(st.nextToken());
                sum+=list[i][j];
                allSum+=list[i][j];
            }
            System.out.printf("%.1f ",sum/4);
        }
        System.out.println();

        for(int i=0; i<4; i++){
            double sum = 0.0;
            for(int j=0; j<2; j++){
                sum+=list[j][i];
            }
            System.out.printf("%.1f ",sum/2);
        }
        System.out.println();
        System.out.printf("%.1f",allSum/8);
    }
}