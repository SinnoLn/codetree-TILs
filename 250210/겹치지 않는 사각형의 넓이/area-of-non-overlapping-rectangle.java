import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] rec = new int[2000][2000];
        int offset = 1000;
        int x1,x2,y1,y2;
        
        for(int i=0; i<2; i++){
            x1 =sc.nextInt();
            y1 =sc.nextInt();
            x2 =sc.nextInt();
            y2 =sc.nextInt();

            for(int x=x1; x<x2; x++){
                for(int y=y1; y<y2; y++){
                    rec[x+offset][y+offset]++;
                }
            }
        }

        x1 =sc.nextInt();
        y1 =sc.nextInt();
        x2 =sc.nextInt();
        y2 =sc.nextInt();
        for(int x=x1; x<x2; x++){
            for(int y=y1; y<y2; y++){
                rec[x+offset][y+offset]-=20;
            }
        }

        int cnt = 0;
        for(int i=0; i<rec.length; i++){
            for(int j=0; j<rec[0].length; j++){
                if(rec[i][j]>0) cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}