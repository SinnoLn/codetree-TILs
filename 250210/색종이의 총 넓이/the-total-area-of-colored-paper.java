import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] rec = new int[200][200];
        int offset = 100;

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int h=x; h<x+8; h++){
                for(int w=y; w<y+8; w++){
                    rec[h+offset][w+offset]++;
                }
            }
        }

        int cnt=0;
        for(int i=0; i<200; i++){
            for(int j=0; j<200; j++){
                if(rec[i][j]>0) cnt++; 
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}