import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] rec = new int[200][200];
        int n = sc.nextInt();
        int offset = 100;

        for(int i=0; i<n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j=x1; j<x2; j++){
                for(int k=y1; k<y2; k++){
                    rec[j+offset][k+offset]++;
                }
            }
        }
        int cnt = 0;
        for(int i=0;i <rec.length; i++){
            for(int j=0; j<rec[0].length; j++)
                if(rec[i][j]>0) cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}