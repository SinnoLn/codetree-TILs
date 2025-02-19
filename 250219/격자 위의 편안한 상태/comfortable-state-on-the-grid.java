import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;

        int[][] arr = new int[n+1][n+1];

        for(int i=0; i<m; i++){
            int y = sc.nextInt();
            int x = sc.nextInt();

            arr[y][x] = 1;
            int cnt = 0;
            for(int j=0; j<4; j++){
                int nx = x + dx[j];
                int ny = y + dy[j];

                if(!isRange(nx,ny, n)) continue;
                if(arr[ny][nx] == 1) cnt++;
            }
            if(cnt == 3){
                System.out.println(1);
            }
            else System.out.println(0);
            cnt = 0;
        }
        sc.close();
    }
    public static boolean isRange(int x, int y, int n){
        return (x>=1 && y>=1 && x<n+1 && y<n+1);
    }
}